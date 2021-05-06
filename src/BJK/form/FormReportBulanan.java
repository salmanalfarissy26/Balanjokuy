/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJK.form;

import javax.swing.JComboBox;
import BJK.controler.ControllerReport;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Salman Alfarissy
 */
public class FormReportBulanan extends javax.swing.JFrame {
    private ControllerReport control;
    private FormHome home;
    private String namakasir;
    private String id_kasir;
    private FormLogin login;

    /**
     * Creates new form FormReportBulanan
     */
    public FormReportBulanan() {
        initComponents();
        
        ImageIcon icon = new ImageIcon("src/gambar/logo32.png");
        setIconImage(icon.getImage());
        control = new ControllerReport(this);
        this.setLocationRelativeTo(null);
    }

    public String getNamakasir() {
        return namakasir;
    }

    public void setNamakasir(String namakasir) {
        this.namakasir = namakasir;
    }

    public String getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(String id_kasir) {
        this.id_kasir = id_kasir;
    }

    public JComboBox<String> getC_thn() {
        return c_thn;
    }

    public JTable getTblreport() {
        return tblreport;
    }

    public JTextField getTxttot() {
        return txttot;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreport = new javax.swing.JTable();
        btnlogout = new javax.swing.JButton();
        txttot = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();
        c_thn = new javax.swing.JComboBox<>();
        btnfind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnhome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Iconhome.png"))); // NOI18N
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome);
        btnhome.setBounds(0, 0, 60, 60);

        tblreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Kasir", "Tahun/bulan", "Nama Menu", "Total Terjual", "Total Keuntungan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblreport);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 240, 700, 290);

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Iconlogout2.png"))); // NOI18N
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout);
        btnlogout.setBounds(730, 0, 150, 40);
        getContentPane().add(txttot);
        txttot.setBounds(610, 550, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 550, 40, 30);

        btnprint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/print.png"))); // NOI18N
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint);
        btnprint.setBounds(80, 550, 60, 60);

        c_thn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2000" }));
        getContentPane().add(c_thn);
        c_thn.setBounds(90, 190, 80, 30);

        btnfind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/iconfind.png"))); // NOI18N
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });
        getContentPane().add(btnfind);
        btnfind.setBounds(190, 170, 60, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ReportBulananbac.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 886, 631);

        setBounds(0, 0, 902, 669);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        home = new FormHome();
        home.getLbnamakasir().setText(namakasir);
        home.getLbidkasir().setText(id_kasir);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        login = new FormLogin();
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Logout ?");
        switch(opsi){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Logout");
                login.setVisible(true);
                dispose();
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Gagal Logout");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        control.printBulanan();

    }//GEN-LAST:event_btnprintActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        // TODO add your handling code here:
        control.tampil_ReportBulanan();
    }//GEN-LAST:event_btnfindActionPerformed

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
            java.util.logging.Logger.getLogger(FormReportBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReportBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReportBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReportBulanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormReportBulanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnprint;
    private javax.swing.JComboBox<String> c_thn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblreport;
    private javax.swing.JTextField txttot;
    // End of variables declaration//GEN-END:variables
}
