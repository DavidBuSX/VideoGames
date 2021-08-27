package ventanas;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegistroGames extends javax.swing.JFrame {


    public RegistroGames() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        n_Juego = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        n_Consola = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        n_Edicion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        n_Buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Juego");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        n_Juego.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(n_Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 192, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consola");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        n_Consola.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(n_Consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 38, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edicion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 77, -1, -1));

        n_Edicion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(n_Edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 97, 43, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 145, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 145, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa el codigo del video juego");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, -1, -1));

        n_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(n_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, 36, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, -1, -1));

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 356, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consolas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 0, -1, 25));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1.- Nintendo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 31, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("2.- GameBoy");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 51, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("3.- Nintendo 64");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 71, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("4.- Nintendo DS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 91, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nintendo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/videogames", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into games values(?,?,?,?)");
            
            pst.setString(1,"0");
            pst.setString(2,n_Juego.getText().trim());
            pst.setString(3,n_Edicion.getText().trim());
            pst.setString(4,n_Consola.getText().trim());
            pst.executeUpdate();
            
            n_Juego.setText("");
            n_Edicion.setText("");
            n_Consola.setText("");
            label_status.setText("Se ha registrado exitosamente");
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/videogames", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from games where idJuego = ?");
            
            pst.setString(1, n_Buscar.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                n_Juego.setText(rs.getString("nombre"));
                n_Edicion.setText(rs.getString("edicion"));
                n_Consola.setText(rs.getString("idConsola"));
            }else{
                JOptionPane.showMessageDialog(null, "Juego no registrado.");
            }
            
         
         }catch(Exception e){
         
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{
            String ID = n_Buscar.getText().trim();
            Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost/videogames", "root", "");
            PreparedStatement pst = cn.prepareStatement("update games set nombre = ?, edicion = ?, idConsola = ? where idJuego = " + ID);
            
            pst.setString(1, n_Juego.getText().trim());
            pst.setString(2, n_Edicion.getText().trim());
            pst.setString(3, n_Consola.getText().trim());
            pst.executeUpdate();
            
            n_Juego.setText("");
            n_Edicion.setText("");
            n_Consola.setText("");
            n_Buscar.setText("");
            
            label_status.setText("Modificacion exitosa");
            
         
         }catch(Exception e){
         
         }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/videogames", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from games where idJuego = ?");
            
            pst.setString(1, n_Buscar.getText().trim());
            pst.executeUpdate();
            
            n_Juego.setText("");
            n_Edicion.setText("");
            n_Consola.setText("");
            n_Buscar.setText("");
            
            label_status.setText("Registro eliminado.");
        
        }catch(Exception e){
        
        
        }
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
            java.util.logging.Logger.getLogger(RegistroGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroGames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField n_Buscar;
    private javax.swing.JTextField n_Consola;
    private javax.swing.JTextField n_Edicion;
    private javax.swing.JTextField n_Juego;
    // End of variables declaration//GEN-END:variables
}
