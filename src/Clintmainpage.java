
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Clintmainpage extends javax.swing.JFrame {

    
    /**
     * Creates new form Clintmainpage
     */
    
    public Clintmainpage() {
        initComponents();
        scaleImage();
        scaleImageappoint();
        scaleImagecheckapoint();
        scaleImagemedicine();
        scaledrImage();
        scalelogImage();
    }
    public void scaleImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\26363.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(clintmainback.getWidth(), clintmainback.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 clintmainback.setIcon(scaledIcon);
 }
    public void scaleImageappoint() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\appointment-icon-16.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(appointicon.getWidth(), appointicon.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 appointicon.setIcon(scaledIcon);
 }
    public void scaleImagecheckapoint() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\checkapoint.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(checka.getWidth(), checka.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 checka.setIcon(scaledIcon);
 }
    public void scaleImagemedicine() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\meds.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(meds.getWidth(), meds.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 meds.setIcon(scaledIcon);
 }
     public void scaledrImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\dr.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(drimg.getWidth(), drimg.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 drimg.setIcon(scaledIcon);
     }
  
     public void scalelogImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\logout.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 logout.setIcon(scaledIcon);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showname1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ordermed = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appointicon = new javax.swing.JLabel();
        checka = new javax.swing.JLabel();
        meds = new javax.swing.JLabel();
        drimg = new javax.swing.JLabel();
        clintmainback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showname1.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        showname1.setForeground(new java.awt.Color(93, 44, 67));
        showname1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                showname1ComponentHidden(evt);
            }
        });
        getContentPane().add(showname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 350, 60));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 50, 50));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 36)); // NOI18N
        jLabel1.setText("Book Appointment");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 370, -1));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 3, 34)); // NOI18N
        jLabel4.setText("Check Booked Appointments");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 540, -1));

        ordermed.setFont(new java.awt.Font("Kristen ITC", 3, 32)); // NOI18N
        ordermed.setText("Order Or View Medicine");
        ordermed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordermedMouseClicked(evt);
            }
        });
        getContentPane().add(ordermed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 430, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mainpage");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));
        getContentPane().add(appointicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 60, 60));
        getContentPane().add(checka, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 60, 60));
        getContentPane().add(meds, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 60, 50));
        getContentPane().add(drimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 110));
        getContentPane().add(clintmainback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Appointment open= new Appointment();
        open.show();
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void showname1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_showname1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_showname1ComponentHidden

    private void ordermedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordermedMouseClicked
      clintmed showmedclint= new clintmed();
      showmedclint.show();
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ordermedMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
      ClintLogin logout=new ClintLogin();
      logout.show();
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         clintbookedappointment aptview=new clintbookedappointment();
         aptview.show();
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Clintmainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clintmainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clintmainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clintmainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clintmainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointicon;
    private javax.swing.JLabel checka;
    private javax.swing.JLabel clintmainback;
    private javax.swing.JLabel drimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel meds;
    private javax.swing.JLabel ordermed;
    public javax.swing.JLabel showname1;
    // End of variables declaration//GEN-END:variables
}
