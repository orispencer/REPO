
package Ventanas;

import Clases.ListadoPersonas;
import Clases.Persona;
import java.util.List;
import javax.swing.DefaultListModel;


public class CrearPersona extends javax.swing.JFrame {
  
    private ListadoPersonas lp=new ListadoPersonas();
    private List<Persona> listadoPersonas;  
    /**
     * Creates new form CrearPersona
     */
    public CrearPersona() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ed = new javax.swing.JSpinner();
        crearPersona = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        verListado = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Cédula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciKeyTyped(evt);
            }
        });
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Edad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, -1, 20));

        ed.setModel(new javax.swing.SpinnerNumberModel());
        getContentPane().add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));

        crearPersona.setBackground(new java.awt.Color(204, 204, 255));
        crearPersona.setText("Crear Persona");
        crearPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearPersonaMouseClicked(evt);
            }
        });
        crearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(crearPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Raavi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Datos para Crear una Persona");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        verListado.setBackground(new java.awt.Color(204, 204, 255));
        verListado.setText("Ver Listado");
        verListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListadoActionPerformed(evt);
            }
        });
        getContentPane().add(verListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, -1));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grupoP.gif"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearPersonaMouseClicked
       
    }//GEN-LAST:event_crearPersonaMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciKeyTyped
        char c= evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_ciKeyTyped

    private void crearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPersonaActionPerformed
        Persona p1 = new Persona();
        p1.setNombre(name.getText());
        p1.setCedula(ci.getText());
        p1.setEdad(Integer.parseInt(""+ed.getValue()));
        listadoPersonas=lp.CargarDatos(p1);
        System.out.println("agregaste 1"+p1.getNombre());
        System.out.println("el tamaño aumento"+listadoPersonas.size());
    }//GEN-LAST:event_crearPersonaActionPerformed

    private void verListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListadoActionPerformed
        DefaultListModel dlm = new DefaultListModel();
        
        for (int i = 0; i <listadoPersonas.size() ; i++) {
            Persona p=listadoPersonas.get(i);
            dlm.addElement(p.getNombre()+"--"+p.getCedula()+"--"+p.getEdad()); 
        }
        
        VentanaListadoPersonas Vlp= new VentanaListadoPersonas(dlm);
        this.dispose();
        Vlp.setVisible(true);
    }//GEN-LAST:event_verListadoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public static javax.swing.JTextField ci;
    private javax.swing.JButton crearPersona;
    public static javax.swing.JSpinner ed;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField name;
    private javax.swing.JButton verListado;
    // End of variables declaration//GEN-END:variables
}
