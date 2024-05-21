
package Vistas;

/**
 *
 * @author edulo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormMateria = new javax.swing.JMenuItem();
        jmAdmin = new javax.swing.JMenu();
        jmiManejoInscrip = new javax.swing.JMenuItem();
        jmiManipNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiAlumnosMat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(62, 67, 76));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");

        jmiFormAlumno.setText("Formulario de Alumno");
        jmiFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiFormMateria.setText("Formulario de Materia");
        jmiFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiFormMateria);

        jMenuBar1.add(jmMateria);

        jmAdmin.setText("Administración");

        jmiManejoInscrip.setText("Manejo de Inscripciones");
        jmiManejoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoInscripActionPerformed(evt);
            }
        });
        jmAdmin.add(jmiManejoInscrip);

        jmiManipNotas.setText("Manipulación de notas");
        jmiManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipNotasActionPerformed(evt);
            }
        });
        jmAdmin.add(jmiManipNotas);

        jMenuBar1.add(jmAdmin);

        jmConsultas.setText("Consultas");

        jmiAlumnosMat.setText("Alumnos por Materia");
        jmiAlumnosMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnosMatActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiAlumnosMat);

        jMenuBar1.add(jmConsultas);

        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormAlumnoActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll(); //Removemos todo lo que tenga nuestro escritorio
        escritorio.repaint(); //Volvemos a repintar el escritorio
        FormularioAlumno fa = new FormularioAlumno(); //Instancia de la ventana formulario alumno
        fa.setVisible(true); //La hacemos visible
        escritorio.add(fa); //Agregamos nuestra ventana al escritorio
        escritorio.moveToFront(fa); //Le decimos al escritorio que traiga al frente nuestra ventana
    }//GEN-LAST:event_jmiFormAlumnoActionPerformed

    private void jmiFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormMateriaActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll(); //Removemos todo lo que tenga nuestro escritorio
        escritorio.repaint(); //Volvemos a repintar el escritorio
        FormularioMateria fm = new FormularioMateria(); //Instancia de la ventana formulario materia
        fm.setVisible(true); //La hacemos visible
        escritorio.add(fm); //Agregamos nuestra ventana al escritorio
        escritorio.moveToFront(fm); //Le decimos al escritorio que traiga al frente nuestra ventana
    }//GEN-LAST:event_jmiFormMateriaActionPerformed

    private void jmiManejoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoInscripActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll(); //Removemos todo lo que tenga nuestro escritorio
        escritorio.repaint(); //Volvemos a repintar el escritorio
        ManejoInscripciones mi = new ManejoInscripciones(); //Instancia de la ventana ManejoInscripciones
        mi.setVisible(true); //La hacemos visible
        escritorio.add(mi); //Agregamos nuestra ventana al escritorio
        escritorio.moveToFront(mi); //Le decimos al escritorio que traiga al frente nuestra ventana
    }//GEN-LAST:event_jmiManejoInscripActionPerformed

    private void jmiManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipNotasActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll(); //Removemos todo lo que tenga nuestro escritorio
        escritorio.repaint(); //Volvemos a repintar el escritorio
        FormularioCargaNotas fcn = new FormularioCargaNotas(); //Instancia de la ventana FormularioCargaNotas
        fcn.setVisible(true); //La hacemos visible
        escritorio.add(fcn); //Agregamos nuestra ventana al escritorio
        escritorio.moveToFront(fcn); //Le decimos al escritorio que traiga al frente nuestra ventana
    }//GEN-LAST:event_jmiManipNotasActionPerformed

    private void jmiAlumnosMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnosMatActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll(); //Removemos todo lo que tenga nuestro escritorio
        escritorio.repaint(); //Volvemos a repintar el escritorio
        AlumnosMateria am = new AlumnosMateria(); //Instancia de la ventana Alumnos Materia
        am.setVisible(true); //La hacemos visible
        escritorio.add(am); //Agregamos nuestra ventana al escritorio
        escritorio.moveToFront(am); //Le decimos al escritorio que traiga al frente nuestra ventana
    }//GEN-LAST:event_jmiAlumnosMatActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu jmAdmin;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenuItem jmiAlumnosMat;
    private javax.swing.JMenuItem jmiFormAlumno;
    private javax.swing.JMenuItem jmiFormMateria;
    private javax.swing.JMenuItem jmiManejoInscrip;
    private javax.swing.JMenuItem jmiManipNotas;
    // End of variables declaration//GEN-END:variables
}
