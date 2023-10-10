
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class medicinesadminview extends javax.swing.JFrame {

    
    public medicinesadminview() {
        initComponents();
        showmed();
        scaleImage();
    scaledrImage();
        scaleaptbckiconImage();
        scalelogImage();
        scalebackImage();
    }
         
    public void sortby(){
    try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();                        
                       if(sort.getSelectedItem().toString()=="Date"){
                           String sqltabel="SELECT * FROM clintmeds ORDER BY `Place on`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          showmedicines.setModel(DbUtils.resultSetToTableModel(rs));
                                }
                       if(sort.getSelectedItem().toString()=="Id"){
                           String sqltabel="SELECT * FROM clintmeds ORDER BY `Transaction id`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          showmedicines.setModel(DbUtils.resultSetToTableModel(rs));
                                } 
                       if(sort.getSelectedItem().toString()=="Name"){
                           String sqltabel="SELECT * FROM clintmeds ORDER BY `Medicine Name`;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          showmedicines.setModel(DbUtils.resultSetToTableModel(rs));
                                }
                        
    }catch(Exception e){
    System.out.print(e);
    }
    }
        public void clintmedsdatdeupdate(){
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        if(mname.getText()=="Paracetamol"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
                            String fetchmedicinetabelEXP="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
                        }
if(mname.getText()=="Dolo"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
                            String fetchmedicinetabelEXP="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
                        }                        
                        
if(mname.getText()=="Crocin"){
                            String fetchmedicinetabelMFD="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
java.sql.ResultSet rs=stmt.executeQuery(fetchmedicinetabelMFD);
rs.next();
String a=rs.getString(1);
String fetchclintmedMFD="UPDATE `clintmeds` SET `MFD`='"+a+"';";
                            String fetchmedicinetabelEXP="SELECT `MFD` FROM `medicine` WHERE `Medicine Name`='Paracetamol';";
                            rs=stmt.executeQuery(fetchmedicinetabelEXP);
rs.next();
String b=rs.getString(1);
String fetchclintmedEXP="UPDATE `clintmeds` SET `EXP`='"+b+"';";
                        }
                        
        }
        catch(Exception e){
        System.out.println(e);
        }
        
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
     
     public void scalebackImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\adminviewmed.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 jLabel1.setIcon(scaledIcon);
     }
    
    
    public void clear(){
    
        medid.setText(null);
        mname.setText(null);
        medprice.setText(null);
        medstock.setText(null);
        ((JTextField)mfd.getDateEditor().getUiComponent()).setText(null);
        ((JTextField)exp.getDateEditor().getUiComponent()).setText(null);
        
    }
    
    public void scaleImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\refresh.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(imagel.getWidth(), imagel.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 imagel.setIcon(scaledIcon);
 }
    
    public void showmed(){
    try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement(); 
         String sqltabel="select * from medicine ;";
          java.sql.ResultSet rs=stmt.executeQuery(sqltabel);
          showmedicines.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e){
        
System.out.println(e);
}
}
    public void clintmedstabelupdate(){
    try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        if("Paracetamol".equals(mname.getText())){
                        String medupdate="UPDATE `clintmeds` SET `MFD`='"+((JTextField)mfd.getDateEditor().getUiComponent()).getText()+"', `EXP`='"+((JTextField)exp.getDateEditor().getUiComponent()).getText()+"' WHERE `Medicine Name`='"+mname.getText()+"';";
                        stmt.executeUpdate(medupdate);
                        System.out.println(mname.getText());
                        }
                        if("Dolo".equals(mname.getText())){
                        String medupdate="UPDATE `clintmeds` SET `MFD`='"+((JTextField)mfd.getDateEditor().getUiComponent()).getText()+"', `EXP`='"+((JTextField)exp.getDateEditor().getUiComponent()).getText()+"' WHERE `Medicine Name`='"+mname.getText()+"';";
                        stmt.executeUpdate(medupdate);
                        }
                        if("Crocin".equals(mname.getText())){
                        String medupdate="UPDATE `clintmeds` SET `MFD`='"+((JTextField)mfd.getDateEditor().getUiComponent()).getText()+"', `EXP`='"+((JTextField)exp.getDateEditor().getUiComponent()).getText()+"' WHERE `Medicine Name`='"+mname.getText()+"';";
                        stmt.executeUpdate(medupdate);
                        }
                        
                        
    }catch(Exception e){
        System.out.println(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        showmedicines = new javax.swing.JTable();
        logout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        medprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        medstock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        imagel = new javax.swing.JLabel();
        bkicon = new javax.swing.JLabel();
        drlogo = new javax.swing.JLabel();
        mfd = new com.toedter.calendar.JDateChooser();
        exp = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sort = new javax.swing.JComboBox<>();
        sortlabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showmedicines.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        showmedicines.setModel(new javax.swing.table.DefaultTableModel(
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
        showmedicines.setRowHeight(25);
        jScrollPane1.setViewportView(showmedicines);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1460, 200));

        logout.setText("logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 40, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Medicine Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        medid.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(medid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Medicine");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        mname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, -1));

        medprice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(medprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        medstock.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(medstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 140, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        imagel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagelMouseClicked(evt);
            }
        });
        getContentPane().add(imagel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 520, 30, 30));

        bkicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkiconMouseClicked(evt);
            }
        });
        getContentPane().add(bkicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 50));
        getContentPane().add(drlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        mfd.setDateFormatString("y-MM-dd");
        getContentPane().add(mfd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 200, 40));

        exp.setDateFormatString("y-MM-dd");
        getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 240, 190, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Manufacture Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Expirey Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, -1, -1));

        sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Date", "Id", "Name" }));
        getContentPane().add(sort, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        sortlabel.setText("View orders");
        sortlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortlabelMouseClicked(evt);
            }
        });
        getContentPane().add(sortlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 70, 20));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        AdminLogin logout=new AdminLogin();
      logout.show();
      dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if(medstock.getText().matches("^[0-9]*$") && medid.getText().matches("^[0-9]*$") && mname.getText().matches("^[a-zA-Z]*$") && medprice.getText().matches("[-+]?[0-9]*\\.?[0-9]+"))
        {    
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String medicineid=medid.getText();
String medicinename=mname.getText();
String medicineprice=medprice.getText();
String medicinestock=medstock.getText();

String sql="INSERT INTO `medicine`(`Medicine Id`, `Medicine Name`, `Price/piece`, `Stock`,`MFD`, `EXP`) VALUES ('"+medicineid+"','"+medicinename+"','"+medicineprice+"','"+medicinestock+"','"+((JTextField)mfd.getDateEditor().getUiComponent()).getText()+"','"+((JTextField)exp.getDateEditor().getUiComponent()).getText()+"');";
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(this, "Medicine is added");
showmed();
clintmedstabelupdate();
clintmedsdatdeupdate();
clear();


        } catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "Enter all details");
            System.out.print(e);
        
        }
}
        else if(!medid.getText().matches("^[0-9]*$")){
              JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Medicine Id");
        }
        else if(!mname.getText().matches("^[a-zA-Z]*$")){
             JOptionPane.showMessageDialog(this, "Use Alphabets values to Enter Medicine Name");}
        else if(!medprice.getText().matches("[-+]?[0-9]*\\.?[0-9]+")){
         JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Stock");
        }
        else if(!medstock.getText().matches("^[0-9]*$"))
        {
              JOptionPane.showMessageDialog(this, "Use Numeric values to Enter stock");
        }
        // TODO add your handling code here:
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String c=mname.getText();
        if(medstock.getText().matches("^[0-9]*$") && medid.getText().matches("^[0-9]*$") && mname.getText().matches("^[a-zA-Z]*$") && medprice.getText().matches("[-+]?[0-9]*\\.?[0-9]+"))
        {         try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String medicineid=medid.getText();
String medicinename=mname.getText();
String medicineprice=medprice.getText();
String medicinestock=medstock.getText();

String sql="UPDATE `medicine` SET `Medicine Id`='"+medicineid+"',`Medicine Name`='"+medicinename+"',`Price/piece`='"+medicineprice+"',`Stock`='"+medicinestock+"',`MFD`='"+
((JTextField)mfd.getDateEditor().getUiComponent()).getText()+"', `EXP`='"+
((JTextField)exp.getDateEditor().getUiComponent()).getText()+"' WHERE `Medicine Name`='"+medicinename+"' OR `Medicine Id`="+medicineid+";";
stmt.executeUpdate(sql);
clintmedstabelupdate();
JOptionPane.showMessageDialog(this, "Medicine is updated");
showmed();
clintmedsdatdeupdate();



        } catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "Enter all details");
            System.out.print(e);
        
        }
        }
else if(!medid.getText().matches("^[0-9]*$")){
              JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Medicine Id");
        }
        else if(!mname.getText().matches("^[a-zA-Z]*$")){
             JOptionPane.showMessageDialog(this, "Use Alphabets values to Enter Medicine Id");}
        else if(!medprice.getText().matches("[-+]?[0-9]*\\.?[0-9]+")){
         JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Stock");
        }
        else if(!medstock.getText().matches("^[0-9]*$"))
        {
              JOptionPane.showMessageDialog(this, "Use Numeric values to Enter stock");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void imagelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagelMouseClicked
        showmed();   
        
// TODO add your handling code here:
    }//GEN-LAST:event_imagelMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String medicineid=medid.getText();
String medicinename=mname.getText();


String sql="DELETE FROM `medicine` WHERE `Medicine Name`='"+medicinename+"' OR `Medicine Id`="+medicineid+";";
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(this, "Medicine is Deleted");
showmed();


        } catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "Enter all details");
            System.out.print(e);
        
        }        // TO        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
             clear();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bkiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkiconMouseClicked
         Adminmainpage back=new Adminmainpage();
            back.show();
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bkiconMouseClicked

    private void sortlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortlabelMouseClicked
sortby();        // TODO add your handling code here:
    }//GEN-LAST:event_sortlabelMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            showmedicines.print();// TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(Bookedappointments.class.getName()).log(Level.SEVERE, null, ex);
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(medicinesadminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicinesadminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicinesadminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicinesadminview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicinesadminview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkicon;
    private javax.swing.JLabel drlogo;
    private com.toedter.calendar.JDateChooser exp;
    private javax.swing.JLabel imagel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField medid;
    private javax.swing.JTextField medprice;
    private javax.swing.JTextField medstock;
    private com.toedter.calendar.JDateChooser mfd;
    private javax.swing.JTextField mname;
    private javax.swing.JTable showmedicines;
    private javax.swing.JComboBox<String> sort;
    private javax.swing.JLabel sortlabel;
    // End of variables declaration//GEN-END:variables
}
