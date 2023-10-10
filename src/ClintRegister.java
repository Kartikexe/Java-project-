

import com.mysql.jdbc.ResultSet;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ClintRegister extends javax.swing.JFrame {

    /**
     * Creates new form ClintRegister
     */
    public ClintRegister() {
        initComponents();
        crfname.setBackground(new java.awt.Color(0,0,0,1));
        crpwd.setBackground(new java.awt.Color(0,0,0,1));
        crans.setBackground(new java.awt.Color(0,0,0,1));       
        crphno.setBackground(new java.awt.Color(0,0,0,1));       
        scaleImage() ;
    }

    public void scaleImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\clrback.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(clrback.getWidth(), clrback.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 clrback.setIcon(scaledIcon);
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
        jLabel5 = new javax.swing.JLabel();
        crfname = new javax.swing.JTextField();
        crphno = new javax.swing.JTextField();
        crpwd = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        crans = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clrback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 255, 0));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 236, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security Question");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        crfname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        crfname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(crfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 170, -1));

        crphno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        crphno.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(crphno, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 170, -1));

        crpwd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        crpwd.setForeground(new java.awt.Color(255, 255, 255));
        crpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crpwdActionPerformed(evt);
            }
        });
        getContentPane().add(crpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 170, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "What was your School name", "What Car you like", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        crans.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        crans.setForeground(new java.awt.Color(255, 255, 255));
        crans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cransActionPerformed(evt);
            }
        });
        getContentPane().add(crans, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 170, -1));

        jButton2.setText("Go back to Homepage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 41, -1, -1));

        jButton3.setText("Go back to User Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 103, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1053, 327, -1, -1));

        register.setBackground(new java.awt.Color(51, 153, 0));
        register.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("          Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 240, 50));

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 200, 50));

        clrback.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(clrback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Homepage crhomep= new Homepage();
crhomep.show();

dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ClintLogin crclientp= new ClintLogin();
crclientp.show();

dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void crpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crpwdActionPerformed

    private void cransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cransActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
if(crphno.getText().matches("^[0-9]*$") && crfname.getText().matches("^[a-zA-Z]*$"))
        {
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String crname=crfname.getText();
String crpass=crpwd.getText();
String cans=crans.getText();
String crphone=crphno.getText();

String sql="INSERT INTO `user` (`Uname`, `Uanswer`, `Uphone`, `Upwd`) VALUES ('"+crname+"', '"+cans+"', '"+crphone+"', '"+crpass+"');";
        stmt.executeUpdate(sql);
String crjpane="select Uid from user where Uname='"+crname+"';";
    java.sql.ResultSet rs=stmt.executeQuery(crjpane);
 rs.next();
 String i=rs.getString(1);
    JOptionPane.showMessageDialog(this, "You are registered as User your id is"+i+" go to User login");
 con.close();
}catch(Exception e){
        JOptionPane.showMessageDialog(this, "Fill all the mentioned details");
System.out.println(e);
}  } 

else if(!crfname.getText().matches("^[a-zA-Z]*$")){              
    JOptionPane.showMessageDialog(this, "Use Aplhabets values to Enter Name");
        }
else if(!crphno.getText().matches("^[0-9]*$") ){              
    JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Phone No.");
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

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
            java.util.logging.Logger.getLogger(ClintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClintRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClintRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clrback;
    private javax.swing.JTextField crans;
    private javax.swing.JTextField crfname;
    private javax.swing.JTextField crphno;
    private javax.swing.JTextField crpwd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel register;
    // End of variables declaration//GEN-END:variables
}