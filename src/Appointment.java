
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
public class Appointment extends javax.swing.JFrame {

    
     String gender;
    /**
     * Creates new form Appointment
     */
    public Appointment() {
        initComponents();
        scalebackImage();
        scaledrImage();
        scaleaptImage();
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
                        
    }catch(Exception e){
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
  
     public void scalebackImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\back3.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(bkicon.getWidth(), bkicon.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 bkicon.setIcon(scaledIcon);
     }
     
     public void scaleaptImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\clbookapt.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(claback.getWidth(), claback.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 claback.setIcon(scaledIcon);
     }

     public void clear(){
    
        CAname.setText(null);
        CAage.setText(null);
        CAproblem.setText(null);
        CAphno.setText(null);      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        CAname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tproblem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        gmale = new javax.swing.JRadioButton();
        gfemale = new javax.swing.JRadioButton();
        bkicon = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        CAage = new javax.swing.JTextField();
        CAphno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CAproblem = new javax.swing.JTextArea();
        drlogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        claback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Enter Full Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        CAname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CAname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAnameActionPerformed(evt);
            }
        });
        getContentPane().add(CAname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Type of problem");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        tproblem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tproblem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bones", "Skin", "Dentist" }));
        tproblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tproblemActionPerformed(evt);
            }
        });
        getContentPane().add(tproblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Problem");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Phone No. ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jButton1.setBackground(new java.awt.Color(223, 97, 138));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        groupGender.add(gmale);
        gmale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gmale.setText("Male");
        gmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmaleActionPerformed(evt);
            }
        });
        getContentPane().add(gmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        groupGender.add(gfemale);
        gfemale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gfemale.setText("Female");
        gfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gfemaleActionPerformed(evt);
            }
        });
        getContentPane().add(gfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        bkicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkiconMouseClicked(evt);
            }
        });
        getContentPane().add(bkicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 50, 40));

        jButton2.setBackground(new java.awt.Color(223, 97, 138));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, -1, -1));

        jPanel2.setBackground(new java.awt.Color(223, 97, 138));
        jPanel2.setForeground(new java.awt.Color(223, 97, 138));

        CAage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CAage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAageActionPerformed(evt);
            }
        });

        CAphno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        CAproblem.setColumns(20);
        CAproblem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CAproblem.setRows(5);
        jScrollPane1.setViewportView(CAproblem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAphno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(CAage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CAphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 710, 510));
        getContentPane().add(drlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Book Appoitnment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 310, 60));

        claback.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(claback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tproblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tproblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tproblemActionPerformed

    private void CAageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(CAage.getText().matches("^[0-9]*$") && CAphno.getText().matches("^[0-9]*$") && CAname.getText().matches("^[a-zA-Z]*$"))
{
        try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
String aname=CAname.getText();
String aage=CAage.getText();
String caproblem=CAproblem.getText();
String caphone=CAphno.getText();
String typeofp=tproblem.getSelectedItem().toString();

if(typeofp=="Bones"){
String doc="Dr Prabhakar";
String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
String sql="INSERT INTO `appointment`(`Uid`,`Aname`, `Aage`, `Agender`, `Related to`, `Aproblem`, `aphone no`, `Doctor`) VALUES('"+convertid+"','"+aname+"', '"+aage+"', '"+gender+"','"+typeofp+"','"+caproblem+"','"+caphone+"','"+doc+"');";
stmt.executeUpdate(sql);
String ajpane="select Aid from `appointment` where Aname='"+aname+"';";
     rs=stmt.executeQuery(ajpane);
 if(rs.next()){
 String i=rs.getString(1);
    JOptionPane.showMessageDialog(this, "Your appointment has been registered Your Appointment id is "+i);
 }}
if(typeofp=="Skin"){
String doca="Dr Khanna";

String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
String sql="INSERT INTO `appointment`(`Uid`,`Aname`, `Aage`, `Agender`, `Related to`, `Aproblem`, `aphone no`, `Doctor`) VALUES('"+convertid+"','"+aname+"', '"+aage+"', '"+gender+"','"+typeofp+"','"+caproblem+"','"+caphone+"','"+doca+"');";
stmt.executeUpdate(sql);
String ajpane="select Aid from `appointment` where Aname='"+aname+"';";
     rs=stmt.executeQuery(ajpane);
 if(rs.next()){
 String i=rs.getString(1);
    JOptionPane.showMessageDialog(this, "Your appointment has been registered Your Appointment id is "+i);
 }}
if(typeofp=="Dentist"){
String docb="Dr Vikram";

String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet rs=stmt.executeQuery(clintidstore);
                        rs.next();
                        String storeid=rs.getString(1);
                        int convertid=Integer.parseInt(storeid);
String sql="INSERT INTO `appointment`(`Uid`,`Aname`, `Aage`, `Agender`, `Related to`, `Aproblem`, `aphone no`, `Doctor`) VALUES('"+convertid+"','"+aname+"', '"+aage+"', '"+gender+"','"+typeofp+"','"+caproblem+"','"+caphone+"','"+docb+"');";
stmt.executeUpdate(sql);
String ajpane="select Aid from `appointment` where Aname='"+aname+"';";
 rs=stmt.executeQuery(ajpane);
 if(rs.next()){
 String i=rs.getString(1);
    JOptionPane.showMessageDialog(this, "Your appointment has been registered Your Appointment id is "+i);
 }}
clear();
  
    
    clintbookedappointment appointview= new clintbookedappointment();
appointview.show();
dispose();

con.close();
}catch(Exception e){
        JOptionPane.showMessageDialog(this, "Fill all the mentioned details");
System.out.println(e);
}
}
else if(!CAage.getText().matches("^[a-zA-Z]*$")){
             JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Age");}
else if(!CAphno.getText().matches("^[a-zA-Z]*$")){
             JOptionPane.showMessageDialog(this, "Use Numeric values to Enter Phone No.");}
        else if(!CAname.getText().matches("[-+]?[0-9]*\\.?[0-9]+")){
         JOptionPane.showMessageDialog(this, "Use Aplhabet values to Enter Name");
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmaleActionPerformed
      gender="Male";
        // TODO add your handling code here:
    }//GEN-LAST:event_gmaleActionPerformed

    private void gfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gfemaleActionPerformed
        gender="Female";// TODO add your handling code here:
    }//GEN-LAST:event_gfemaleActionPerformed

    private void bkiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkiconMouseClicked
       Clintmainpage open=new Clintmainpage();
       open.show();
       dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_bkiconMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
clear();              // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CAnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAnameActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAage;
    private javax.swing.JTextField CAname;
    private javax.swing.JTextField CAphno;
    private javax.swing.JTextArea CAproblem;
    private javax.swing.JLabel bkicon;
    private javax.swing.JLabel claback;
    private javax.swing.JLabel drlogo;
    private javax.swing.JRadioButton gfemale;
    private javax.swing.JRadioButton gmale;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tproblem;
    // End of variables declaration//GEN-END:variables


}