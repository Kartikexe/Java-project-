
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Bookedappointments extends javax.swing.JFrame {

    /**
     * Creates new form Bookedappointments
     */
    public Bookedappointments() {
        initComponents();
        tabelmethod();
        scaleclmedImage();
        scaledrImage();
        scaleaptbckiconImage();
        scaleImage();
    }
    
    public void sortby(){
    try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();                        
                       if(sort.getSelectedItem().toString()=="Date"){
                           String sqltabel="SELECT * FROM `appointment` ORDER BY `Date`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          Bookedappoints.setModel(DbUtils.resultSetToTableModel(rs));
                                }
                       if(sort.getSelectedItem().toString()=="Id"){
                           String sqltabel="SELECT * FROM appointment ORDER BY `Uid`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          Bookedappoints.setModel(DbUtils.resultSetToTableModel(rs));
                                } 
                       if(sort.getSelectedItem().toString()=="Name"){
                           String sqltabel="SELECT * FROM appointment ORDER BY `Aname`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          Bookedappoints.setModel(DbUtils.resultSetToTableModel(rs));
                                }
                        
    }catch(Exception e){
    System.out.print(e);
    }
    }
    public void scaleImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\refresh.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(refresh.getWidth(), refresh.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 refresh.setIcon(scaledIcon);
 }
   public void scaleclmedImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\abook.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(bookaptback.getWidth(), bookaptback.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 bookaptback.setIcon(scaledIcon);
     } 
   
     public void scaleaptbckiconImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\back3.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(bkicon.getWidth(), bkicon.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 bkicon.setIcon(scaledIcon);
     }
    public void scaledrImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\dr.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(drlogo.getWidth(), drlogo.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 drlogo.setIcon(scaledIcon);
     }
    

     public void tabelmethod(){
     
         try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement(); 
         String sqltabel="select * from appointment ;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          Bookedappoints.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e){
        
System.out.println(e);
}
          
    
         
     }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Bookedappoints = new javax.swing.JTable();
        del = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backimg = new javax.swing.JLabel();
        drlogo = new javax.swing.JLabel();
        bkicon = new javax.swing.JLabel();
        sort = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bookaptback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bookedappoints.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Bookedappoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Problem", "Type", "Appointment Id"
            }
        ));
        jScrollPane1.setViewportView(Bookedappoints);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1470, 320));

        del.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 130, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Appointment Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 150, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 100, -1));

        backimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backimgMouseClicked(evt);
            }
        });
        getContentPane().add(backimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 40, 40));
        getContentPane().add(drlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 100));

        bkicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkiconMouseClicked(evt);
            }
        });
        getContentPane().add(bkicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 40));

        sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Date", "Id", "Name", " " }));
        getContentPane().add(sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 30, 30));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, -1));
        getContentPane().add(bookaptback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement(); 
         String sqltabel="DELETE FROM `appointment` WHERE Aid="+del.getText()+";";
          stmt.executeUpdate(sqltabel);
JOptionPane.showMessageDialog(this, "Appointment Deleted");
tabelmethod();
}
         catch(Exception e){
        JOptionPane.showMessageDialog(this, "Enter Appropriate Appointment id ");
System.out.println(e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backimgMouseClicked
        Adminmainpage back=new Adminmainpage();
        back.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backimgMouseClicked

    private void bkiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkiconMouseClicked
        Adminmainpage admain=new Adminmainpage();
        admain.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bkiconMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Bookedappoints.print();// TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(Bookedappointments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
sortby();        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

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
            java.util.logging.Logger.getLogger(Bookedappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookedappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookedappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookedappointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookedappointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bookedappoints;
    private javax.swing.JLabel backimg;
    private javax.swing.JLabel bkicon;
    private javax.swing.JLabel bookaptback;
    private javax.swing.JTextField del;
    private javax.swing.JLabel drlogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel refresh;
    private javax.swing.JComboBox<String> sort;
    // End of variables declaration//GEN-END:variables
}
