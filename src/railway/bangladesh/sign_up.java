/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railway.bangladesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yusha
 */
public class sign_up extends javax.swing.JFrame {

    /**
     * Creates new form sign_up
     */
    public sign_up() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
    }

    String url = "jdbc:sqlserver://LAPTOP-3GFO49NI\\SQLEXPRESS:1433;databaseName=RailwayBangladesh";
    String sql_user = "sqlyusha";
    String sql_password = "123456789";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sign_up_title = new javax.swing.JLabel();
        last_name_label = new javax.swing.JLabel();
        last_name_jtext = new javax.swing.JTextField();
        first_name_label = new javax.swing.JLabel();
        first_name_jtext = new javax.swing.JTextField();
        email_name_label = new javax.swing.JLabel();
        email_jtext = new javax.swing.JTextField();
        phone_name_label1 = new javax.swing.JLabel();
        phone_jtext = new javax.swing.JTextField();
        gender_label = new javax.swing.JLabel();
        gender_jtext = new javax.swing.JTextField();
        age_label = new javax.swing.JLabel();
        age_jtext = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        sign_up_password_field = new javax.swing.JPasswordField();
        password_label1 = new javax.swing.JLabel();
        sign_up_confirm_password_field = new javax.swing.JPasswordField();
        sign_up_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_up_title.setFont(new java.awt.Font("Calisto MT", 1, 40)); // NOI18N
        sign_up_title.setText("Railway Bangladesh");
        jPanel1.add(sign_up_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 373, 57));

        last_name_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        last_name_label.setText("Last Name");
        jPanel1.add(last_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 109, 136, 30));

        last_name_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        last_name_jtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_jtextActionPerformed(evt);
            }
        });
        jPanel1.add(last_name_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 146, 300, 39));

        first_name_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        first_name_label.setText("First Name");
        jPanel1.add(first_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 112, 136, 24));

        first_name_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(first_name_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 146, 300, 39));

        email_name_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        email_name_label.setText("Email");
        jPanel1.add(email_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 136, 24));

        email_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(email_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 221, 300, 39));

        phone_name_label1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        phone_name_label1.setText("Phone ");
        jPanel1.add(phone_name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 136, 24));

        phone_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(phone_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 221, 300, 39));

        gender_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        gender_label.setText("Gender");
        jPanel1.add(gender_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 271, 136, 24));

        gender_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(gender_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 301, 300, 39));

        age_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        age_label.setText("Age");
        jPanel1.add(age_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 271, 136, 24));

        age_jtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(age_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 301, 300, 39));

        password_label.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        password_label.setText("Password");
        jPanel1.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 351, 136, 24));

        sign_up_password_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(sign_up_password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 386, 300, 42));

        password_label1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        password_label1.setText("Confirm Password");
        jPanel1.add(password_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 351, 167, 24));

        sign_up_confirm_password_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(sign_up_confirm_password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 386, 300, 42));

        sign_up_button.setBackground(new java.awt.Color(3, 169, 252));
        sign_up_button.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        sign_up_button.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_button.setText("Sign Up");
        sign_up_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(sign_up_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 162, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void last_name_jtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_jtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_name_jtextActionPerformed

    private void sign_up_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_buttonActionPerformed

        try {
            //if any field is empty
            if (last_name_jtext.getText().isEmpty() || first_name_jtext.getText().isEmpty() || email_jtext.getText().isEmpty() || phone_jtext.getText().isEmpty() || gender_jtext.getText().isEmpty() || age_jtext.getText().isEmpty() || sign_up_password_field.getText().isEmpty() || sign_up_confirm_password_field.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill the informations correctly!");
            }
            //password not matched
            else if (sign_up_password_field.getText().equals(sign_up_confirm_password_field.getText()) == false) {
                JOptionPane.showMessageDialog(this, "Password not matched!");
            }
            //11 digit phone number check
            else if (phone_jtext.getText().length() < 11 || phone_jtext.getText().length() > 11) {
                JOptionPane.showMessageDialog(this, "Provide valid Phone Number!");
            }
            //database input for customer
            else {

                String last_name = last_name_jtext.getText();
                String first_name = first_name_jtext.getText();
                String email = email_jtext.getText();
                String phone = phone_jtext.getText();
                String gender = gender_jtext.getText();
                String age = age_jtext.getText();
                String sign_up_password = new String(sign_up_password_field.getPassword());
                String sign_up_confirm_password = new String(sign_up_confirm_password_field.getPassword());
                int booking_count = 0;

                Connection connection = DriverManager.getConnection(url, sql_user, sql_password);
                String sql = "INSERT INTO CUSTOMER VALUES ('" + last_name + "', '" + first_name + "', '" + email + "', '" + sign_up_confirm_password + "','" + age + "','" + gender + "','" + phone + "','"+booking_count+"')";
                String sql4 = "Select * from CUSTOMER where Email = '" + email + "' ";

                Statement statement = connection.createStatement();

                String sql3 = "SELECT * FROM LogInUser WHERE Email = '" + email + "' ";
                ResultSet rs = statement.executeQuery(sql3);
                //if account already exists
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Email already used!");
                } else {
                    int rows = statement.executeUpdate(sql);

                    if (rows > 0) {
                        ResultSet rs2 = statement.executeQuery(sql4);
                        int CustomerId=0;
                        if (rs2.next()) {
                            CustomerId = rs2.getInt("CustomerId");
                        }
                        String UserId = String.valueOf(CustomerId);

                        String sql2 = "INSERT INTO LogInUser VALUES ('"+UserId+"','" + email + "','" + sign_up_confirm_password + "')";
                        JOptionPane.showMessageDialog(this, "User Created Successfully!");
                        statement.executeUpdate(sql2);
                        this.setVisible(false);
                        log_in ob = new log_in();
                        ob.setVisible(true);
                    }
                }

            }

        } catch (SQLException e) {
            System.out.println("database connection failed");
            e.printStackTrace();
        }


    }//GEN-LAST:event_sign_up_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_jtext;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField email_jtext;
    private javax.swing.JLabel email_name_label;
    private javax.swing.JTextField first_name_jtext;
    private javax.swing.JLabel first_name_label;
    private javax.swing.JTextField gender_jtext;
    private javax.swing.JLabel gender_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last_name_jtext;
    private javax.swing.JLabel last_name_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel password_label1;
    private javax.swing.JTextField phone_jtext;
    private javax.swing.JLabel phone_name_label1;
    private javax.swing.JButton sign_up_button;
    private javax.swing.JPasswordField sign_up_confirm_password_field;
    private javax.swing.JPasswordField sign_up_password_field;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
