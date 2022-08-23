/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1;

import java.awt.Color;
import javax.swing.JOptionPane;
import static proyecto1.principal.ArregloUsu;
//import static proyecto1.CrearCliente.ArregloUsu;
public class Login extends javax.swing.JFrame {
    //public static Usuarios [] ArregloUsu = new Usuarios [11];
    public Login() {
        initComponents();
        this.setSize(452,332);
        this.setLocationRelativeTo(null);
        //new principal().setVisible(true);
        // public static Usuarios [] ArregloUsu = new Usuarios [11];
       //ArregloUsu[0]= new Usuarios(1024, "admin","","root");
    }
public void validacion(long id, String Contraseña){
    //System.out.println(ArregloUsu[1].getId());
    //System.out.println(id +" "+ Contraseña);
    ArregloUsu[0]= new Usuarios(1024, "admin","","root"); 
   // System.out.println(ArregloUsu[0].getContraseña());
    for (int i = 0; i < ArregloUsu.length; i++) {
        if (ArregloUsu[i] != null) {
            if(ArregloUsu[i].getId() == id){
           //if(ArregloUsu[i].getId() == id){
             if(ArregloUsu[i].getContraseña().equals(Contraseña)){
            
                 //System.out.println("Contraseña correcta");
                 if(id == 1024){
                     System.out.println(ArregloUsu[0].getContraseña());
                    JOptionPane.showMessageDialog(null,"Bienvenido administrador","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    Pantalla1Admin admin = new Pantalla1Admin();
                    admin.setVisible(true);
                    this.setVisible(false);
                 }
                 else{
                  JOptionPane.showMessageDialog(null,"Bienvenido usuario","Bienvenido",JOptionPane.INFORMATION_MESSAGE); 
                    PantallaCliente clien = new PantallaCliente();
                    this.setVisible(false);
                    clien.setVisible(true);
                 }
             }
             else{
             System.out.println(ArregloUsu[i].getContraseña());   
             JOptionPane.showMessageDialog(null,"Contraseña incorrecta","Error de login",JOptionPane.ERROR_MESSAGE);

             }
            }
            //else{
            //JOptionPane.showMessageDialog(null,"Usuario no existe","Error de login",JOptionPane.ERROR_MESSAGE);
            
            //}
        }
        else {
        break;
        }
    }
    JOptionPane.showMessageDialog(null,"Usuario no existe","Error de login",JOptionPane.ERROR_MESSAGE);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        usu = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/astro.jpg"))); // NOI18N

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 444));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });

        Ingresar.setBackground(new java.awt.Color(115, 166, 217));
        Ingresar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(34, 49, 63));
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar sesión");

        min.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        Close.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("x");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(min)
                .addGap(18, 18, 18)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min)
                    .addComponent(Close))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Cancelar.setBackground(new java.awt.Color(255, 51, 51));
        Cancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pass)
                    .addComponent(usu, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Ingresar)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
//    String usuario = "admin";
//    String password = "password";
//    String root = "root";
//    if(usu.getText().equals(usuario)&&pass.getText().equals(password) || usu.getText().equals(usuario)&&pass.getText().equals(root) ){
//       Pantalla1Admin admin = new Pantalla1Admin();
//      admin.setVisible(true);
//    }
//    else if(usu.getText().equals(usuario)&& !pass.getText().equals(password)) {
// JOptionPane.showMessageDialog(null,"Contraseña invalida","Error de login",JOptionPane.ERROR_MESSAGE);
//    usu.setText("");
//    pass.setText("");
//    usu.requestFocus();
//    }
//    else {
//    JOptionPane.showMessageDialog(null,"Usuario no existe","Error de login",JOptionPane.ERROR_MESSAGE);
//    usu.setText("");
//    pass.setText("");
//    usu.requestFocus();
//    }
long idi = Long.parseLong(usu.getText());
String con = pass.getText().trim();
//System.out.println("con= "+con);
//System.out.println("idi= "+idi);
validacion(idi,con);

    }//GEN-LAST:event_IngresarActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
     System.exit(0);  
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
this.setState(Login.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_minMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
       Close.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseEntered

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
    this.setVisible(false);
    new principal().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(false);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Close;
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
}
