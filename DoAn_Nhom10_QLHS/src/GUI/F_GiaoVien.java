/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.GiaoVienBLL;
import DAL.GiaoVienDAL;
import DTO.GiaoVienDTO;
import UTILS.ConnectionUtil;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import GUI.TheModel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author HP
 */
public class F_GiaoVien extends javax.swing.JFrame {

    /**
     * Creates new form F_GiaoVien
     */
    public F_GiaoVien() {
        initComponents();
        //showdatatintable();
        showdata();
    }

    public void showdata() {
        GiaoVienDAL gv = new GiaoVienDAL();
        ArrayList<GiaoVienDTO> list = gv.BindTable();
        String[] columnName = {"idtablegiaovien", "tengiaovien", "ngaysinh", "gioitinh", "img"};
        Object[][] rows = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).getIdtablegiaovien();
            rows[i][1] = list.get(i).getTengiaovien();
            rows[i][2] = list.get(i).getNgaysinh();
            rows[i][3] = list.get(i).getGioitinh();
//            if (list.get(i).getImg() != null) {
//                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getImg()).getImage()
//                        .getScaledInstance(150, 120, Image.SCALE_SMOOTH));
//                rows[i][4] = image;
//            } else {
//                rows[i][4] = null;
//            }
            
        }
        TheModel model = new TheModel(rows, columnName);
        jTable1.setModel(model);
        jTable1.setRowHeight(120);
//        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidgiaovien = new javax.swing.JTextField();
        txthotengiaovien = new javax.swing.JTextField();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnaddgv = new javax.swing.JButton();
        btnupdategv = new javax.swing.JButton();
        btndeletegv = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        labelhienthihinh = new javax.swing.JLabel();
        btnchonhinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Họ Tên");

        jLabel2.setText("Mã giáo viên");

        jLabel3.setText("Giới Tính");

        jLabel4.setText("Ngày Sinh");

        nam.setText("nam");
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        nu.setText("nữ");
        nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Giáo Viên", "Họ Tên", "Ngày Sinh", "Giới Tính"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Tìm Kiếm");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        btnaddgv.setText("thêm");
        btnaddgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddgvActionPerformed(evt);
            }
        });

        btnupdategv.setText("sửa");
        btnupdategv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdategvActionPerformed(evt);
            }
        });

        btndeletegv.setText("xóa");
        btndeletegv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletegvActionPerformed(evt);
            }
        });

        btnchonhinh.setText("chọn hình ảnh...");
        btnchonhinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchonhinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchonhinh)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtidgiaovien)
                            .addComponent(txthotengiaovien, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nam)
                                .addGap(59, 59, 59)
                                .addComponent(nu))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelhienthihinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnaddgv)
                        .addGap(143, 143, 143)
                        .addComponent(btnupdategv)
                        .addGap(153, 153, 153)
                        .addComponent(btndeletegv)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidgiaovien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndeletegv)
                            .addComponent(btnupdategv)
                            .addComponent(btnaddgv))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthotengiaovien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam)
                            .addComponent(nu))
                        .addGap(54, 54, 54)
                        .addComponent(btnchonhinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelhienthihinh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchonhinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchonhinhActionPerformed
        // TODO add your handling code here:
        String AR = "";
        FileNameExtensionFilter typephoto = new FileNameExtensionFilter("Định dạng ảnh(*.jpg; *.png; *.jpeg)", "jpg", "png", "jpeg");
        JFileChooser file = new JFileChooser();
        file.addChoosableFileFilter(typephoto);
        file.setDialogTitle("Chọn ảnh");
        int window = file.showOpenDialog(null);
        if (window == JFileChooser.APPROVE_OPTION) {

            File ar = file.getSelectedFile();
            Image photo = getToolkit().getImage(String.valueOf(ar));
            AR = String.valueOf(ar);
            photo = photo.getScaledInstance(labelhienthihinh.getWidth(), labelhienthihinh.getHeight(), Image.SCALE_DEFAULT);
            labelhienthihinh.setIcon(new ImageIcon(photo));
            filename = ar.getAbsolutePath();
            try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }
                photo1 = bos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnchonhinhActionPerformed

    //thêm
    private void btnaddgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddgvActionPerformed
        // TODO add your handling code here:
        String id = txtidgiaovien.getText();
        String ten = txthotengiaovien.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(jDateChooser1.getDate());
        String gioitinh = null;
        if (nam.isSelected()) {
            gioitinh = "nam";
        }
        if (nu.isSelected()) {
            gioitinh = "nữ";
        }
        GiaoVienDTO giaoVienDTO = new GiaoVienDTO(id, ten, date, gioitinh, photo1);
        GiaoVienBLL giaoVienBLL = new GiaoVienBLL();
        if (giaoVienBLL.AddGiaoVien(giaoVienDTO) == true) {
            TableModel model = jTable1.getModel();
            showdata();
            JOptionPane.showConfirmDialog(null, "thành công");
        }
    }//GEN-LAST:event_btnaddgvActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        // TODO add your handling code here:
        if (nam.isSelected()) {
            nu.setSelected(false);
        }
    }//GEN-LAST:event_namActionPerformed

    private void nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuActionPerformed
        // TODO add your handling code here:
        if (nu.isSelected()) {
            nam.setSelected(false);
        }
    }//GEN-LAST:event_nuActionPerformed

    //xóa
    private void btndeletegvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletegvActionPerformed

        String id = txtidgiaovien.getText();
        GiaoVienDTO giaoVienDTO = new GiaoVienDTO(id, null, null, null, null);
        GiaoVienBLL giaoVienBLL = new GiaoVienBLL();
        if (giaoVienBLL.DEL(giaoVienDTO) == true) {
            TableModel model = jTable1.getModel();
            showdata();
            JOptionPane.showConfirmDialog(null, "thành công");

        }
    }//GEN-LAST:event_btndeletegvActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        //lấy mã giáo viên
        txtidgiaovien.setText(model.getValueAt(i, 0).toString());
        //lấy họ tên giáo viên
        txthotengiaovien.setText(model.getValueAt(i, 1).toString());
        //lấy ngyaf tháng
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 2));
            jDateChooser1.setDate(date);
        } catch (ParseException e) {
            JOptionPane.showConfirmDialog(null, "khong lay duoc gia tri ngay thang");
        }
        // lấy giá trị giới tính
        try {
            if ("nam".equals(model.getValueAt(i, 3).toString()) == true) {
                nam.setSelected(true);
                nu.setSelected(false);
            }
            if ("nữ".equals(model.getValueAt(i, 3).toString()) == true) {
                nam.setSelected(false);
                nu.setSelected(true);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "khong lay duoc gia tri gioi tinh");
        }
        // lấy hình ảnh

        if (jTable1.getValueAt(i, 4) != null) {
            ImageIcon image1 = (ImageIcon) jTable1.getValueAt(i, 4);
            Image image2 = image1.getImage().getScaledInstance(labelhienthihinh.getWidth(), labelhienthihinh.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image3 = new ImageIcon(image2);
            labelhienthihinh.setIcon(image3);
            // test laays hinh khi click vao table
            photo1=null;

        } else if (jTable1.getValueAt(i, 4) == null) {
            labelhienthihinh.setIcon(null);
        }


    }//GEN-LAST:event_jTable1MouseClicked

    //update giáo viên
    private void btnupdategvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdategvActionPerformed
        // TODO add your handling code here:
        String id = txtidgiaovien.getText();
        String ten = txthotengiaovien.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(jDateChooser1.getDate());
        String gioitinh = null;
        if (nam.isSelected()) {
            gioitinh = "nam";
        }
        if (nu.isSelected()) {
            gioitinh = "nữ";
        }
        GiaoVienDTO giaoVienDTO = new GiaoVienDTO(id, ten, date, gioitinh, photo1);
        GiaoVienBLL giaoVienBLL = new GiaoVienBLL();
        //update neu co thay doi hinh anh
        if (photo1 != null) {
            if (giaoVienBLL.UpdateGiaoVien(giaoVienDTO) == true) {
                TableModel model = jTable1.getModel();
                showdata();
                JOptionPane.showConfirmDialog(null, "thành công");
            }
        }
        //update neu k thay doi hinh
        if (photo1 == null) {
            if (giaoVienBLL.UpdateGiaoVien2(giaoVienDTO) == true) {
                TableModel model = jTable1.getModel();
                showdata();
                JOptionPane.showConfirmDialog(null, "thành công");
            }
        }
    }//GEN-LAST:event_btnupdategvActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code her1e:
//       
        TableModel model = jTable1.getModel();
        String search = txtsearch.getText();
        TableRowSorter<TableModel> trl = new TableRowSorter<>(model);
        jTable1.setRowSorter(trl);
        trl.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtsearchKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(F_GiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_GiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_GiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_GiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_GiaoVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddgv;
    private javax.swing.JButton btnchonhinh;
    private javax.swing.JButton btndeletegv;
    private javax.swing.JButton btnupdategv;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelhienthihinh;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nu;
    private javax.swing.JTextField txthotengiaovien;
    private javax.swing.JTextField txtidgiaovien;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
    byte[] photo1 = null;
    String filename = null;
    //File ar;
}
