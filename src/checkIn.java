
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * checkIn.java
 *
 * Created on 15 Mar, 2021, 9:43:09 PM
 */

/**
 *
 * @author rajat
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class checkIn extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    Statement st;
    String q;
    int k;
    
    /** Creates new form checkIn */
    public checkIn() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocation(50, 118);
        Class.forName("java.sql.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
        st=con.createStatement();
       
        jTextField2.setEditable(false);
        
        SimpleDateFormat m = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Calendar c=Calendar.getInstance();
        jTextField2.setText(m.format(c.getTime()));
        
        String h="select * from cust";
            rs=st.executeQuery(h);
            while(rs.next()){
                k++;
            }
            k++;
        jLabel7.setText(""+k);
    
       
    }
   
    public void roomdetails() {
        try {
            String beds;
            String rty;
            jComboBox1.removeAllItems();
            jLabel8.setText("");
            beds = (String) jComboBox3.getSelectedItem();
            rty = (String) jComboBox4.getSelectedItem();
            String gb = "select * from room where rt = '" + rty + "' and bed = '" + beds + "' and status = 'Not Booked'  ";
            rs = st.executeQuery(gb);
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("rno"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("CUSTOMER CHECK IN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 340, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 40, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("EMAIL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 80, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setText("MOBILE NO.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 260, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 260, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 233, 260, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setText("NATIONALITY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 80, 30));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 323, 260, 30));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 260, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 90, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 160, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel9.setText("ADDRESS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 80, 30));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 143, 260, 30));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 260, 30));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 260, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel10.setText("ID PROOF");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel11.setText("BED");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 80, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel12.setText("ROOM TYPE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 100, 30));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE", "OTHER" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 30));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE", "DOUBLE", "TRIPLE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 260, 30));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "NON AC" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 260, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel13.setText("ROOM NO.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 100, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel14.setText("PRICE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 60, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 150, 30));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ALLOCATE ROOM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 190, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel16.setText("NAME");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel17.setText("ID (HOSTEL)");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 90, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("CHECK IN DATE AND TIME(TODAY)");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 250, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        int a=JOptionPane.showConfirmDialog(null, "Do you really want to close it ?" , "select" , JOptionPane.YES_NO_OPTION );
        if (a==0) {
            this.setVisible(false);
        } else {

        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            new checkIn().setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
       
            // TODO add your handling code here:
            roomdetails();
            
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String bed,rt,price;
    String rno;
        rno=    (String) jComboBox1.getSelectedItem();
        q="select * from room where rno = '"+rno+"' ";
        try {
            rs=st.executeQuery(q);
            while (rs.next()) {
                jLabel8.setText(rs.getString("price"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        roomdetails();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     
       
        
        
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() ||jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Fill it Properly ");
        }

        else{


        String f=(String) jComboBox2.getSelectedItem();
        String rno=(String) jComboBox1.getSelectedItem();
        String rt=(String) jComboBox4.getSelectedItem();
        String bed=(String) jComboBox3.getSelectedItem();
        Calendar calendar = Calendar.getInstance();
       
        q="insert into cust values (  "+jLabel7.getText()+", '"+jTextField5.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+f+"','"+jTextField1.getText()+"' ,'"+jTextField6.getText()+"' ,'"+jTextField7.getText()+"' ,'"+jTextField2.getText()+"' ,'"+rno+"','"+bed+"','"+rt+"', "+jLabel8.getText()+" ,0,'NULL','NULL'  )  ;   ";
        try {
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Room Allocate SucessFully");
          
            
            
            new checkIn().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(!jLabel8.getText().equals("")){
            String y="update room set status = 'Booked' where rno = '"+rno+"'";
            try {
                st.executeUpdate(y);
            } catch (SQLException ex) {
                Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


       }



    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new checkIn().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(checkIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
