
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class FmLogin extends javax.swing.JFrame {

    /**
     * Creates new form LoginProcess
     */
    public FmLogin() {
        initComponents();
    }

    int xMouse, yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        UsernameSeparator = new javax.swing.JSeparator();
        ProgramTitle = new javax.swing.JLabel();
        PasswordTitle = new javax.swing.JLabel();
        UsernameSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        logginButton = new javax.swing.JToggleButton();
        passTxt = new javax.swing.JPasswordField();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginTitle.setText("LOGIN");
        jPanel1.add(LoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 98, -1));

        UsernameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(204, 204, 204));
        UsernameField.setText("Ingress username");
        UsernameField.setBorder(null);
        UsernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsernameFieldMousePressed(evt);
            }
        });
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 457, -1));
        jPanel1.add(UsernameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 457, 10));

        ProgramTitle.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        ProgramTitle.setText("AIRLINE RESERVATION SYSTEM");
        jPanel1.add(ProgramTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        PasswordTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PasswordTitle.setText("PASSWORD");
        jPanel1.add(PasswordTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 140, -1));
        jPanel1.add(UsernameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 457, 10));

        logginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logginButton.setText("ENTER");
        logginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 160, 40));

        passTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 460, -1));

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 750, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void UsernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameFieldMousePressed
        if (UsernameField.getText().equals("Ingress username")) {
            UsernameField.setText("");
            UsernameField.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsernameFieldMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (UsernameField.getText().isEmpty()) {
            UsernameField.setText("Ingress username");
            UsernameField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void logginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logginButtonActionPerformed
        String user = "JulioBlacio";
        String password = "julio0308";
        String pass = new String(passTxt.getPassword());
       if(UsernameField.getText().equals(user)&& pass.equals(password)){  
        FmAirlineReservationSystem fmAirlineReservationSystem = new FmAirlineReservationSystem();
        this.setVisible(false);
        fmAirlineReservationSystem.setVisible(true);
        }else{
           JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrectos por favor intentelo de nuevo");
       }   
    }//GEN-LAST:event_logginButtonActionPerformed

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

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
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel PasswordTitle;
    private javax.swing.JLabel ProgramTitle;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JSeparator UsernameSeparator;
    private javax.swing.JSeparator UsernameSeparator1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton logginButton;
    private javax.swing.JPasswordField passTxt;
    // End of variables declaration//GEN-END:variables
}
