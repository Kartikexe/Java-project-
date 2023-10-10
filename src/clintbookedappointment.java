
import com.mysql.jdbc.ResultSetMetaData;
import java.awt.Image;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class clintbookedappointment extends javax.swing.JFrame {

    /**
     * Creates new form clintbookedappointment
     */
    public clintbookedappointment() {
        initComponents();
        
        vieworders();
        scaledrImage();
        scaleaptbckiconImage();
        scaleclbookaptImage();
    }
    
    public final void vieworders(){
    try{  
			//Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/medicalservices","root","");  
			//here btech is database name, root is username and password  
			Statement stmt=con.createStatement();
                        
                        String clintidstore="SELECT `Uid` FROM `user` WHERE `Uname`='"+ClintLogin.clintloginusername.getText()+"';";
                        java.sql.ResultSet as=stmt.executeQuery(clintidstore);
                        as.next();
                        String ids;
                        String storeid=as.getString(1);
                        int convertid=Integer.parseInt(storeid);
                        int j=convertid;
                        java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM `appointment` WHERE `Uid`='"+j+"'");
            ResultSetMetaData rsmd=(ResultSetMetaData)rs.getMetaData();
            DefaultTableModel model=(DefaultTableModel)clintbookedapt.getModel();
            int cols=rsmd.getColumnCount();
                        
            String[] colName=new String[cols];
            for(int q=0;q<cols;q++){
                colName[q]=rsmd.getColumnName(q+1);
            }
                model.setColumnIdentifiers(colName);                        
                        String a,b,c,d,e,f,g,h,i;
            while (rs.next()) {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+
                        rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getInt(7)+"  "+rs.getFloat(8)+"  "+rs.getString(9)+"  "); 
//            model.addRow(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getInt(7)+"  "+rs.getFloat(8)+"  "+rs.getString(9)+"  ");
            a=rs.getString(1);
            b=rs.getString(2);
            c=rs.getString(3);
            d=rs.getString(4);
            e=rs.getString(5);
            f=rs.getString(6);
            g=rs.getString(7);
            h=rs.getString(8);
            i=rs.getString(9);
            String[] row={a,b,c,d,e,f,g,h,i};
            model.addRow(row);
            }
//                        System.out.println("val of book apt"+convertid);
////                        String clintpastrecords="SELECT * FROM `appointment` WHERE `Uid`='"+j+"';";
////                        String querypass=clintpastrecords;
//                        java.sql.ResultSet ss=stmt.executeQuery("SELECT * FROM `appointment` WHERE `Uid`='"+j+"';");                        
//                        ss.next();                        
//                        clintbookedapt.setModel(DbUtils.resultSetToTableModel(ss));
////                        System.out.println("result of package "+clintpastrecords);
//                        System.out.println("appoint print id"+convertid);
                        
                        con.close();
    }catch(Exception e){
    System.out.println(e);
    }
    }

    public void scaledrImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\dr.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 jLabel1.setIcon(scaledIcon);
     }
     
     public void scaleaptbckiconImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\back3.png");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(bkicon.getWidth(), bkicon.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 bkicon.setIcon(scaledIcon);
     }
     
     public void scaleclbookaptImage() {
 ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\java project\\clcheckbookapt.jpg");

 Image img = icon.getImage();
 Image imgScale = img.getScaledInstance(clbookapt.getWidth(), clbookapt.getHeight(), Image.SCALE_SMOOTH);
 ImageIcon scaledIcon = new ImageIcon(imgScale);
 clbookapt.setIcon(scaledIcon);
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
        clintbookedapt = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bkicon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clbookapt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clintbookedapt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clintbookedapt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Gender", "Dpt", "Problem", "Aid", "Phone no", "Doctor", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clintbookedapt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 1460, -1));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 100, 120));

        bkicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkiconMouseClicked(evt);
            }
        });
        getContentPane().add(bkicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 51, 47));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Booked Appointments");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 480, 80));
        getContentPane().add(clbookapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
             Clintmainpage open=new Clintmainpage();
             open.show();
             dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bkiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkiconMouseClicked
         Clintmainpage a=new Clintmainpage();
         a.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bkiconMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clintbookedappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new clintbookedappointment().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkicon;
    private javax.swing.JLabel clbookapt;
    private javax.swing.JTable clintbookedapt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
