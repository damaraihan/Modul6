/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanjutan4Uji;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tinggi = new javax.swing.JTextField();
        D2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdL = new javax.swing.JRadioButton();
        rdP = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        lagi = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bbi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        D1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Jenis Kelamin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 190, 90, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 70, 40, 30);

        jLabel4.setText("cm");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 110, 40, 30);

        jLabel5.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 310, 180, 30);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(150, 110, 60, 30);
        getContentPane().add(D2);
        D2.setBounds(60, 400, 350, 30);

        jLabel6.setText("Tinggi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 110, 40, 30);
        getContentPane().add(Berat);
        Berat.setBounds(150, 150, 60, 30);

        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 150, 40, 30);

        rdL.setBackground(new java.awt.Color(102, 102, 255));
        rdL.setText("Laki-Laki");
        getContentPane().add(rdL);
        rdL.setBounds(260, 190, 107, 25);

        rdP.setBackground(new java.awt.Color(102, 102, 255));
        rdP.setText("Perempuan");
        getContentPane().add(rdP);
        rdP.setBounds(160, 190, 93, 25);

        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(340, 230, 69, 25);

        lagi.setText("Coba Lagi");
        lagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagiActionPerformed(evt);
            }
        });
        getContentPane().add(lagi);
        lagi.setBounds(180, 230, 100, 25);

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung);
        hitung.setBounds(60, 230, 69, 25);

        jLabel8.setText("Berat Badan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 150, 80, 30);
        getContentPane().add(bbi);
        bbi.setBounds(260, 270, 60, 30);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 270, 40, 30);

        jLabel10.setText("Berat Badan Ideal Anda adalah ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 270, 180, 30);
        getContentPane().add(Nama);
        Nama.setBounds(150, 70, 260, 30);
        getContentPane().add(D1);
        D1.setBounds(60, 360, 350, 30);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 500);

        setBounds(0, 0, 478, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
      double ti, bt, jk = 0;
     try{
       ti = Double.valueOf(Tinggi.getText());
       bt = Double.valueOf(Berat.getText());
      if(rdP.isSelected()){
          jk = (ti-100)*1;
      }else if(rdL.isSelected()){
          jk = (ti-104)*1;
      }
               
        String temp = Double.toString(jk);
      if(jk<bt) {
          bbi.setText(temp);
          D1.setText("Maaf "+ Nama.getText()+ " , Sepertinya anda Overweight :( ");
          D2.setText("Banyaklah berolahraga dan hidari makanan berkolesterol");
      }else if(jk>bt) {
          bbi.setText(temp);
          D1.setText("Maaf "+ Nama.getText()+ " , Sepertinya anda UnderWeight :( ");
          D2.setText("Banyaklah mengkonsumsi makanan berkarbohidrat");
      }else{
          bbi.setText(temp);
          D1.setText("Hallo "+ Nama.getText()+ " , Berat badan anda sudah ideal loh :) ");
          D2.setText("Lanjutkan pola makan yang teratur dan gaya hidup yang sehat yaa :)) ");
      }
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Lengkapi dulu!!" );
     }
       
    }//GEN-LAST:event_hitungActionPerformed

    private void lagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagiActionPerformed
       Nama.setText("");
       Tinggi.setText("");
       Berat.setText("");
       bbi.setText("");
       D1.setText("");
       D2.setText("");
    }//GEN-LAST:event_lagiActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JTextField D1;
    private javax.swing.JTextField D2;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JTextField bbi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exit;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lagi;
    private javax.swing.JRadioButton rdL;
    private javax.swing.JRadioButton rdP;
    // End of variables declaration//GEN-END:variables
}
