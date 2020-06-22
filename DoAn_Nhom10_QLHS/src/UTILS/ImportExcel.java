/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILS;

/**
 *
 * @author admin
 */

import BLL.HocSinhBLL;
import DTO.GiaoVienDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import DTO.HocSinhDTO;

public class ImportExcel {
    
   
    public ArrayList<GiaoVienDTO> importTeacher(String excelFilePath) throws IOException {
        //
        final int COLUMN_INDEX_ID = 0;
        final int COLUMN_INDEX_NAME = 1;
        final int COLUMN_INDEX_SEX = 2;
        final int COLUMN_INDEX_DATE = 3;
        

        
        ArrayList<GiaoVienDTO> list = new ArrayList<>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workbook
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for book object
             GiaoVienDTO gv=new GiaoVienDTO();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                if (cellValue == null || cellValue.toString().isEmpty()) {
                    continue;
                }
                // Set value for hs object
                int columnIndex = cell.getColumnIndex();
                
                switch (columnIndex) {
                case COLUMN_INDEX_ID:
                    gv.setIdtablegiaovien((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_NAME:
                    gv.setTengiaovien((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_SEX:
                    gv.setGioitinh((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_DATE:
                    gv.setNgaysinh((String) getCellValue(cell));
                    break;
                default:
                    break;
                }
 
            }
            list.add(gv);
        }
 
        workbook.close();
        inputStream.close();
 
        return list;
    }
   
            
    
    public ArrayList<HocSinhDTO> importStudent(String excelFilePath) throws IOException {
        //
        final int COLUMN_INDEX_IDHS = 0;
        final int COLUMN_INDEX_NAMEHS = 1;
        final int COLUMN_INDEX_SEXHS = 2;
        final int COLUMN_INDEX_DATEHS = 3;
        final int COLUMN_INDEX_HOMELAND = 4;
        final int COLUMN_INDEX_ADDRESS = 5;
        final int COLUMN_INDEX_IDCLASS = 6;
        
        ArrayList<HocSinhDTO> list = new ArrayList<>();
 
        // Get file
        InputStream inputStream = new FileInputStream(new File(excelFilePath));
 
        // Get workbook
        Workbook workbook = getWorkbook(inputStream, excelFilePath);
 
        // Get sheet
        Sheet sheet = workbook.getSheetAt(0);
 
        // Get all rows
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            if (nextRow.getRowNum() == 0) {
                // Ignore header
                continue;
            }
 
            // Get all cells
            Iterator<Cell> cellIterator = nextRow.cellIterator();
 
            // Read cells and set value for book object
             HocSinhDTO hs=new HocSinhDTO();
            while (cellIterator.hasNext()) {
                //Read cell
                Cell cell = cellIterator.next();
                Object cellValue = getCellValue(cell);
                if (cellValue == null || cellValue.toString().isEmpty()) {
                    continue;
                }
                // Set value for hs object
                int columnIndex = cell.getColumnIndex();
                
                switch (columnIndex) {
                case COLUMN_INDEX_IDHS:
                    hs.setIdtablehocsinh((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_NAMEHS:
                    hs.setTenhocsinh((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_SEXHS:
                    hs.setGioitinh((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_DATEHS:
                    hs.setNgaysinh((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_HOMELAND:
                    hs.setQuequan((String) getCellValue(cell));
                    break;
                case COLUMN_INDEX_ADDRESS:
                    hs.setDiachi((String) getCellValue(cell));
                    break;
                 case COLUMN_INDEX_IDCLASS:
                    hs.setIdtablelop((String) getCellValue(cell));
                    break;
                default:
                    break;
                }
 
            }
            list.add(hs);
        }
 
        workbook.close();
        inputStream.close();
 
        return list;
    }
 
    // Get Workbook
    private static Workbook getWorkbook(InputStream inputStream, String excelFilePath) throws IOException {
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }
 
        return workbook;
    }
 
    // Get cell value
    private static Object getCellValue(Cell cell) {
        CellType cellType = cell.getCellTypeEnum();
        Object cellValue = null;
        switch (cellType) {
        case BOOLEAN:
            cellValue = cell.getBooleanCellValue();
            break;
        case FORMULA:
            Workbook workbook = cell.getSheet().getWorkbook();
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            cellValue = evaluator.evaluate(cell).getNumberValue();
            break;
        case NUMERIC:
            cellValue = cell.getNumericCellValue();
            break;
        case STRING:
            cellValue = cell.getStringCellValue();
            break;
        case _NONE:
        case BLANK:
        case ERROR:
            break;
        default:
            break;
        }
 
        return cellValue;
    }
    
}
