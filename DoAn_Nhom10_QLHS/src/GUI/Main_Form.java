/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author hunte
 */
public class Main_Form extends javax.swing.JFrame {

    /**
     * Creates new form Main_Form
     */
    public Main_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        navBar_bar = new javax.swing.JPanel();
        nav_item_qlhs = new javax.swing.JButton();
        nav_item_qld = new javax.swing.JButton();
        nav_item_tk = new javax.swing.JButton();
        nav_item_setting = new javax.swing.JButton();
        main_content = new javax.swing.JPanel();
        quanLyHS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quanLyDiem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        thongKe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setResizable(false);

        navBar.setBackground(new java.awt.Color(204, 255, 255));
        navBar.setPreferredSize(new java.awt.Dimension(1600, 45));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N

        navBar_bar.setBackground(new java.awt.Color(204, 204, 204));
        navBar_bar.setPreferredSize(new java.awt.Dimension(1346, 45));

        nav_item_qlhs.setBackground(new java.awt.Color(204, 204, 204));
        nav_item_qlhs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Quản lý hồ sơ.png"))); // NOI18N
        nav_item_qlhs.setToolTipText("");
        nav_item_qlhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_item_qlhsActionPerformed(evt);
            }
        });

        nav_item_qld.setBackground(new java.awt.Color(204, 204, 204));
        nav_item_qld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Quản lý điểm.png"))); // NOI18N
        nav_item_qld.setToolTipText("");
        nav_item_qld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_item_qldActionPerformed(evt);
            }
        });

        nav_item_tk.setBackground(new java.awt.Color(204, 204, 204));
        nav_item_tk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thống kê.png"))); // NOI18N
        nav_item_tk.setToolTipText("");
        nav_item_tk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_item_tkActionPerformed(evt);
            }
        });

        nav_item_setting.setBackground(new java.awt.Color(204, 204, 204));
        nav_item_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting.png"))); // NOI18N
        nav_item_setting.setToolTipText("");
        nav_item_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nav_item_settingMouseClicked(evt);
            }
        });
        nav_item_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nav_item_settingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navBar_barLayout = new javax.swing.GroupLayout(navBar_bar);
        navBar_bar.setLayout(navBar_barLayout);
        navBar_barLayout.setHorizontalGroup(
            navBar_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBar_barLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(nav_item_qlhs)
                .addGap(15, 15, 15)
                .addComponent(nav_item_qld)
                .addGap(15, 15, 15)
                .addComponent(nav_item_tk)
                .addGap(15, 15, 15)
                .addComponent(nav_item_setting)
                .addGap(1150, 1150, 1150))
        );
        navBar_barLayout.setVerticalGroup(
            navBar_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBar_barLayout.createSequentialGroup()
                .addGroup(navBar_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nav_item_qlhs)
                    .addComponent(nav_item_qld)
                    .addComponent(nav_item_tk))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(navBar_barLayout.createSequentialGroup()
                .addComponent(nav_item_setting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navBar_bar, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navBar_bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        main_content.setBackground(new java.awt.Color(204, 255, 255));
        main_content.setPreferredSize(new java.awt.Dimension(1600, 900));
        main_content.setLayout(new java.awt.CardLayout());

        quanLyHS.setBackground(new java.awt.Color(255, 255, 255));
        quanLyHS.setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel1.setText("Quản lý học sinh");

        javax.swing.GroupLayout quanLyHSLayout = new javax.swing.GroupLayout(quanLyHS);
        quanLyHS.setLayout(quanLyHSLayout);
        quanLyHSLayout.setHorizontalGroup(
            quanLyHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyHSLayout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLabel1)
                .addContainerGap(1662, Short.MAX_VALUE))
        );
        quanLyHSLayout.setVerticalGroup(
            quanLyHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyHSLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(605, Short.MAX_VALUE))
        );

        main_content.add(quanLyHS, "card2");

        quanLyDiem.setBackground(new java.awt.Color(204, 204, 255));
        quanLyDiem.setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel2.setText("Quản lý điểm");

        javax.swing.GroupLayout quanLyDiemLayout = new javax.swing.GroupLayout(quanLyDiem);
        quanLyDiem.setLayout(quanLyDiemLayout);
        quanLyDiemLayout.setHorizontalGroup(
            quanLyDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyDiemLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel2)
                .addContainerGap(1760, Short.MAX_VALUE))
        );
        quanLyDiemLayout.setVerticalGroup(
            quanLyDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyDiemLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel2)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        main_content.add(quanLyDiem, "card3");

        thongKe.setBackground(new java.awt.Color(255, 204, 255));
        thongKe.setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel3.setText("Thống kê");

        javax.swing.GroupLayout thongKeLayout = new javax.swing.GroupLayout(thongKe);
        thongKe.setLayout(thongKeLayout);
        thongKeLayout.setHorizontalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongKeLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel3)
                .addContainerGap(1778, Short.MAX_VALUE))
        );
        thongKeLayout.setVerticalGroup(
            thongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongKeLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel3)
                .addContainerGap(460, Short.MAX_VALUE))
        );

        main_content.add(thongKe, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, 2174, Short.MAX_VALUE)
            .addComponent(main_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_content, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //nav-item quản lý học sinh
    private void nav_item_qlhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_item_qlhsActionPerformed
        // TODO add your handling code here:
        //remove tất cả panel
        
        main_content.removeAll();
        main_content.repaint();
        main_content.revalidate();
        
        //add panel quản lý học sinh
        main_content.add(quanLyHS);
        main_content.repaint();
        main_content.revalidate();
             
    }//GEN-LAST:event_nav_item_qlhsActionPerformed

    private void nav_item_qldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_item_qldActionPerformed
        // TODO add your handling code here:
        //remove tất cả panel
        
        main_content.removeAll();
        main_content.repaint();
        main_content.revalidate();
        
        //add panel quản lý điểm
        main_content.add(quanLyDiem);
        main_content.repaint();
        main_content.revalidate();
    }//GEN-LAST:event_nav_item_qldActionPerformed

    private void nav_item_tkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_item_tkActionPerformed
        // TODO add your handling code here:
        //remove tất cả panel
        
        main_content.removeAll();
        main_content.repaint();
        main_content.revalidate();
        
        //add panel thống kê
        main_content.add(thongKe);
        main_content.repaint();
        main_content.revalidate();
    }//GEN-LAST:event_nav_item_tkActionPerformed

    //show dropdown menu
    private void nav_item_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nav_item_settingMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nav_item_settingMouseClicked

    private void nav_item_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nav_item_settingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nav_item_settingActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel main_content;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel navBar_bar;
    private javax.swing.JButton nav_item_qld;
    private javax.swing.JButton nav_item_qlhs;
    private javax.swing.JButton nav_item_setting;
    private javax.swing.JButton nav_item_tk;
    private javax.swing.JPanel quanLyDiem;
    private javax.swing.JPanel quanLyHS;
    private javax.swing.JPanel thongKe;
    // End of variables declaration//GEN-END:variables
}
