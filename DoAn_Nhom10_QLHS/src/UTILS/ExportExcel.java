/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILS;

import DTO.GiaoVienDTO;
import DTO.HocSinhDTO;
import DTO.LopDTO;
import DTO.ThongKeDTO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hunte
 */
public class ExportExcel {
    
    public boolean exportStudent(ArrayList<HocSinhDTO> list){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Student");
        
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        
        int rowNum = 0;
        //Setting Header
        Row firstRow = sheet.createRow(rowNum++);
        Cell firstCell0 = firstRow.createCell(0);
        Cell firstCell1 = firstRow.createCell(1);
        Cell firstCell2 = firstRow.createCell(2);
        Cell firstCell3 = firstRow.createCell(3);
        Cell firstCell4 = firstRow.createCell(4);
        Cell firstCell5 = firstRow.createCell(5);
        Cell firstCell6 = firstRow.createCell(6);
        
        //Setting style
        firstCell0.setCellStyle(cellStyle);
        firstCell1.setCellStyle(cellStyle);
        firstCell2.setCellStyle(cellStyle);
        firstCell3.setCellStyle(cellStyle);
        firstCell4.setCellStyle(cellStyle);
        firstCell5.setCellStyle(cellStyle);
        firstCell6.setCellStyle(cellStyle);
        
        //Setting value
        firstCell0.setCellValue("ID");
        firstCell1.setCellValue("Họ Tên");
        firstCell2.setCellValue("Giới Tính");
        firstCell3.setCellValue("Ngày Sinh");
        firstCell4.setCellValue("Quê quán");
        firstCell5.setCellValue("Địa Chỉ");
        firstCell6.setCellValue("ID Lớp học");
        
        for (HocSinhDTO hocSinhDTO : list) {
            Row row = sheet.createRow(rowNum++);
            
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(hocSinhDTO.getIdtablehocsinh());
            
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(hocSinhDTO.getTenhocsinh());
            
            Cell cell2 = row.createCell(2);
            cell2.setCellValue(hocSinhDTO.getGioitinh());
            
            Cell cell3 = row.createCell(3);
            cell3.setCellValue(hocSinhDTO.getNgaysinh());
            
            Cell cell4 = row.createCell(4);
            cell4.setCellValue(hocSinhDTO.getQuequan());
            
            Cell cell5 = row.createCell(5);
            cell5.setCellValue(hocSinhDTO.getDiachi());
            
            Cell cell6 = row.createCell(6);
            cell6.setCellValue(hocSinhDTO.getIdtablelop());
        }
        FileOutputStream outputStream;
        try {
            
            outputStream = new FileOutputStream("HocSinh.xlsx");
            workbook.write(outputStream);
            workbook.close();
            return true;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean exportTeacher(ArrayList<GiaoVienDTO> list){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Teacher");
        
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        
        int rowNum = 0;
        //Setting Header
        Row firstRow = sheet.createRow(rowNum++);
        Cell firstCell0 = firstRow.createCell(0);
        Cell firstCell1 = firstRow.createCell(1);
        Cell firstCell2 = firstRow.createCell(2);
        Cell firstCell3 = firstRow.createCell(3);
        
        //Setting style
        firstCell0.setCellStyle(cellStyle);
        firstCell1.setCellStyle(cellStyle);
        firstCell2.setCellStyle(cellStyle);
        firstCell3.setCellStyle(cellStyle);
        
        //Setting value
        firstCell0.setCellValue("ID");
        firstCell1.setCellValue("Họ Tên");
        firstCell2.setCellValue("Giới Tính");
        firstCell3.setCellValue("Ngày Sinh");
        
        for (GiaoVienDTO giaoVienDTO : list) {
            Row row = sheet.createRow(rowNum++);
            
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(giaoVienDTO.getIdtablegiaovien());
            
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(giaoVienDTO.getTengiaovien());
            
            Cell cell2 = row.createCell(2);
            cell2.setCellValue(giaoVienDTO.getGioitinh());
            
            Cell cell3 = row.createCell(3);
            cell3.setCellValue(giaoVienDTO.getNgaysinh());
           
        }
        FileOutputStream outputStream;
        try {
            
            outputStream = new FileOutputStream("GiaoVien.xlsx");
            workbook.write(outputStream);
            workbook.close();
            return true;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean exportClassroom(ArrayList<LopDTO> list){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Classroom");
        
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        
        int rowNum = 0;
        //Setting Header
        Row firstRow = sheet.createRow(rowNum++);
        Cell firstCell0 = firstRow.createCell(0);
        Cell firstCell1 = firstRow.createCell(1);
        Cell firstCell2 = firstRow.createCell(2);
        Cell firstCell3 = firstRow.createCell(3);
        Cell firstCell4 = firstRow.createCell(4);
        
        //Setting style
        firstCell0.setCellStyle(cellStyle);
        firstCell1.setCellStyle(cellStyle);
        firstCell2.setCellStyle(cellStyle);
        firstCell3.setCellStyle(cellStyle);
        firstCell4.setCellStyle(cellStyle);
        
        //Setting value
        firstCell0.setCellValue("ID");
        firstCell1.setCellValue("Tên lớp");
        firstCell2.setCellValue("Sĩ số");
        firstCell3.setCellValue("ID Giáo viên");
        firstCell4.setCellValue("ID Khóa học");
        
        for (LopDTO lopDTO : list) {
            Row row = sheet.createRow(rowNum++);
            
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(lopDTO.getIdtablelop());
            
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(lopDTO.getTenlop());
            
            Cell cell2 = row.createCell(2);
            cell2.setCellValue(lopDTO.getSiso());
            
            Cell cell3 = row.createCell(3);
            cell3.setCellValue(lopDTO.getIdtablegiaovien());
            
            Cell cell4 = row.createCell(3);
            cell4.setCellValue(lopDTO.getIdtablekhoahoc());
           
        }
        FileOutputStream outputStream;
        try {
            
            outputStream = new FileOutputStream("LopHoc.xlsx");
            workbook.write(outputStream);
            workbook.close();
            return true;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean exportTK(ArrayList<ThongKeDTO> list, String path){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("ThongKe");
        
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        
        int rowNum = 0;
        //Setting Header
        Row firstRow = sheet.createRow(rowNum++);
        Cell firstCell0 = firstRow.createCell(0);
        Cell firstCell1 = firstRow.createCell(1);
        Cell firstCell2 = firstRow.createCell(2);
        Cell firstCell3 = firstRow.createCell(3);
        
        //Setting style
        firstCell0.setCellStyle(cellStyle);
        firstCell1.setCellStyle(cellStyle);
        firstCell2.setCellStyle(cellStyle);
        firstCell3.setCellStyle(cellStyle);
        
        //Setting value
        firstCell0.setCellValue("ID");
        firstCell1.setCellValue("Họ Tên");
        firstCell2.setCellValue("ID Lớp học");
        firstCell3.setCellValue("Điểm tổng kết");
        
        for (ThongKeDTO thongKeDTO : list) {
            Row row = sheet.createRow(rowNum++);
            
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(thongKeDTO.getId());
            
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(thongKeDTO.getFullName());
            
            Cell cell2 = row.createCell(2);
            cell2.setCellValue(thongKeDTO.getIdClass());
            
            Cell cell3 = row.createCell(3);
            cell3.setCellValue(thongKeDTO.getAvgAll());
            
        }
        FileOutputStream outputStream;
        try {
            
            outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            return true;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExportExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
