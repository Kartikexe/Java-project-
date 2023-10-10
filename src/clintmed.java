
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class clintmed extends javax.swing.JFrame {

    /**
     * Creates new form clintmed
     */
    
    String importuserid;
    
    public clintmed() {
        initComponents();
        
    scaledrImage();
        scaleaptbckiconImage();
        scalelogImage();
        scaleclmedImage(); 
        clintmedsdatdeupdate();
        showavailibility();
    }
    
    public void vieworders(){
    try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
                        
                        String clintpastrecords="SELECT `Transaction id`, `Uid`, `Medicine Name`, `Medicine price`, `Medicine Quantity`,`Place on` FROM `clintmeds` WHERE `Uid`='"+convertid+"';";
                         rs=stmt.executeQuery(clintpastrecords);
                        rs.next();                        
                        availability.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void calculatetotal(){
        System.out.print("calculatetotal");
           try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
    if(                 "Paracetamol   (50/-)".equals(medname.getSelectedItem().toString())){
                        String fetchmedicinetabelMFD="SELECT `Price/piece` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
float b=Float.parseFloat(a);
 String quantity=qty.getText();
 float convertquantity=Float.parseFloat(a);
 float total = b*convertquantity;
System.out.println(b);
 JOptionPane.showMessageDialog(this, "Your Total bill is "+total);
    }
    if(                 "Dolo   (60/-)".equals(medname.getSelectedItem().toString())){
                        String fetchmedicinetabelMFD="SELECT `Price/piece` FROM `medicine` WHERE `Medicine Name`='Dolo';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
float b=Float.parseFloat(a);
 String quantity=qty.getText();
 float convertquantity=Float.parseFloat(a);
 float total = b*convertquantity;
System.out.println(b);
 JOptionPane.showMessageDialog(this, "Your Total bill is "+total);
    }
    if(                 "Crocin  (80/-)".equals(medname.getSelectedItem().toString())){
                        String fetchmedicinetabelMFD="SELECT `Price/piece` FROM `medicine` WHERE `Medicine Name`='Crocin';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
float b=Float.parseFloat(a);
 String quantity=qty.getText();
 float convertquantity=Float.parseFloat(a);
 float total = b*convertquantity;
 System.out.println(b);
JOptionPane.showMessageDialog(this, "Your Total bill is "+total);
    }
    
    }
           catch(Exception e){
               System.out.print(e);
    }
    }

    public void showavailibility(){
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        String showavailable="SELECT `Medicine Name`, `Price/piece`, `Stock` FROM `medicine`;";
                        java.sql.ResultSet rs=stmt.executeQuery(showavailable);
          availability.setModel(DbUtils.resultSetToTableModel(rs));
          
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void clintmedsdatdeupdate(){
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        if(medname.getSelectedItem().toString()=="Paracetamol   (50/-)"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
stmt.executeUpdate(fetchclintmedMFD);
                            String fetchmedicinetabelEXP="SELECT `EXP` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
stmt.executeUpdate(fetchclintmedEXP);
                        }
if(medname.getSelectedItem().toString()=="Dolo   (60/-)"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Dolo';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
stmt.executeUpdate(fetchclintmedMFD);
                            String fetchmedicinetabelEXP="SELECT `EXP` FROM `medicine` WHERE `Medicine Name`='Dolo';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
stmt.executeUpdate(fetchclintmedEXP);
                        }                        
                        
if(medname.getSelectedItem().toString()=="Crocin  (80/-)"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Crocin';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
stmt.executeUpdate(fetchclintmedMFD);
                            String fetchmedicinetabelEXP="SELECT `EXP` FROM `medicine` WHERE `Medicine Name`='Crocin';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
stmt.executeUpdate(fetchclintmedEXP);
}
                        
        }
        catch(Exception e){
        System.out.println(e);
        }
        
    }
    public void scaleclmedImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\medsbackground.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(clmedsback.getWidth(), clmedsback.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 clmedsback.setIcon(scaledIcon);
     }
    public void scaledrImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\dr.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(drlogo.getWidth(), drlogo.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 drlogo.setIcon(scaledIcon);
     }
     
     public void scaleaptbckiconImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\back3.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(bkicon.getWidth(), bkicon.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 bkicon.setIcon(scaledIcon);
     }
    public void scalelogImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\logout.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 logout.setIcon(scaledIcon);
     }
     
    public void medicineconversion(String medname){
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
        
                        
 String quantity=qty.getText();
         
String admintabelcorrection="SELECT `Stock` FROM `medicine` WHERE `Medicine Name`='"+medname+"';";
java.sql.ResultSet rs=stmt.executeQuery(admintabelcorrection);
rs.next();
String a=rs.getString(1);
int converta=Integer.parseInt(a);                       //result of stock medicine
int convertquantity=Integer.parseInt(quantity);         //result of stock clintmeds
int sumofquery=converta-convertquantity;
System.out.print(sumofquery);
String medicinestock="UPDATE `medicine` SET `Stock`='"+sumofquery+"' WHERE `Medicine Name`='"+medname+"';"; 
stmt.executeUpdate(medicinestock);
        
        }
        catch(Exception e){
                
                }
    }
    
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bkicon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        medname = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        drlogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        availability = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        clmedsback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bkicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkiconMouseClicked(evt);
            }
        });
        getContentPane().add(bkicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 56, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Medicine (price)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        qty.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 143, -1));

        medname.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        medname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paracetamol   (50/-)", "Dolo   (60/-)", "Crocin  (80/-)" }));
        medname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mednameActionPerformed(evt);
            }
        });
        getContentPane().add(medname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1562, 6, 47, 40));

        drlogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drlogoMouseClicked(evt);
            }
        });
        getContentPane().add(drlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 93, 103));

        availability.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        availability.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(availability);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1460, 210));

        jButton2.setText("View Orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 460, -1, -1));

        jButton3.setText("Show Medicines");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 500, -1, -1));
        getContentPane().add(clmedsback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(qty.getText().matches("^[0-9]*$")){                 
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String medName=medname.getSelectedItem().toString();
String quantity=qty.getText();


if(medName=="Paracetamol   (50/-)"){
     
     
     String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
                        System.out.println("convertd value "+convertid);
     
    calculatetotal();
     String datechange="SELECT `Stock` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
                        rs=stmt.executeQuery(datechange);
                        rs.next();
String b=rs.getString(1);
int convertb=Integer.parseInt(b); 
    if(convertb>0){
        medName="Paracetamol";
    int price=50;
String sql="INSERT INTO `clintmeds` (`Uid`,`Medicine Name`, `Medicine Price`, `Medicine Quantity`) VALUES ('"+convertid+"','"+medName+"', "+price+", '"+quantity+"');";
stmt.executeUpdate(sql);

         //
         medicineconversion(medName); 
         clintmedsdatdeupdate();
         
    }
    else{
               JOptionPane.showMessageDialog(this, "Medicine is not available");

    }
}
if(medName=="Dolo   (60/-)"){
    
    String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
                        System.out.println("convertd value "+convertid);
    
    String datechange="SELECT `Stock` FROM `medicine` WHERE `Medicine Name`='Dolo';";
                        rs=stmt.executeQuery(datechange);
                        rs.next();
String b=rs.getString(1);
System.out.println(b);
int convertb=Integer.parseInt(b); 
    if(convertb>0){
    medName="Dolo";
    int price=60;
    
String sql="INSERT INTO `clintmeds` (`Uid`,`Medicine Name`, `Medicine Price`, `Medicine Quantity`) VALUES ('"+convertid+"','"+medName+"', "+price+", '"+quantity+"');";
stmt.executeUpdate(sql);

         calculatetotal();
         medicineconversion(medName);
         clintmedsdatdeupdate();
         

}
    else{
            JOptionPane.showMessageDialog(this, "Medicine is not available");

    }
}

if(medName=="Crocin  (80/-)"){
    String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
                        System.out.println("convertd value "+convertid);
    
    String datechange="SELECT `Stock` FROM `medicine` WHERE `Medicine Name`='Crocin';";
                         rs=stmt.executeQuery(datechange);
                        rs.next();
String b=rs.getString(1);
int convertb=Integer.parseInt(b); 
    if(convertb>0){
    medName="Crocin";
    int price=80;
    
String sql="INSERT INTO `clintmeds` (`Uid`,`Medicine Name`, `Medicine Price`, `Medicine Quantity`) VALUES ('"+convertid+"','"+medName+"', "+price+", '"+quantity+"');";
stmt.executeUpdate(sql);

         calculatetotal();
         medicineconversion(medName);
         clintmedsdatdeupdate();
         
}
    else{
        JOptionPane.showMessageDialog(this, "Medicine is not available");

    }
}

clintmedsdatdeupdate();
         }
         catch(Exception e){
             System.out.println(e);
         
         }
}
else if(!qty.getText().matches("^[0-9]*$")){
JOptionPane.showMessageDialog(this, "Enter Numeric values to place Order");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
      ClintLogin logout=new ClintLogin();
      logout.show();
      dispose();
      // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void drlogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drlogoMouseClicked
        Clintmainpage mp=new Clintmainpage();
        mp.show();
        dispose();
                 // TODO add your handling code here:
    }//GEN-LAST:event_drlogoMouseClicked

    private void mednameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mednameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mednameActionPerformed

    private void bkiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkiconMouseClicked
         Clintmainpage clbk=new Clintmainpage();
         clbk.show();
         dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_bkiconMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     vieworders();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     showavailibility();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(clintmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clintmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clintmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clintmed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clintmed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availability;
    private javax.swing.JLabel bkicon;
    private javax.swing.JLabel clmedsback;
    private javax.swing.JLabel drlogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> medname;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}
