/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MateriaData;
import Entidades.Materia;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author edulo
 */
public class FormularioMateria extends javax.swing.JInternalFrame {

    boolean matBuscada = false;

    public FormularioMateria() {
        initComponents();
        btnEliminarMateria.setEnabled(false);
        txtNombreMateria.setEnabled(false);
        txtAnio.setEnabled(false);
        jrbEstado2.setEnabled(false);
        txtCodigo.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jpFormAlumno1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtDni1 = new javax.swing.JTextField();
        jrbEstado1 = new javax.swing.JRadioButton();
        jdNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnBuscarCodigo = new javax.swing.JButton();
        btnNuevoMateria = new javax.swing.JButton();
        btnEliminarMateria = new javax.swing.JButton();
        btnGuardarMateria = new javax.swing.JButton();
        btnSalirMateria = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jrbEstado2 = new javax.swing.JRadioButton();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Documento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Apellido:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Alumno");

        btnBuscar1.setText("Buscar");

        btnNuevo1.setText("Nuevo");

        btnEliminar1.setText("Eliminar");

        btnGuardar1.setText("Guardar");

        btnSalir1.setText("Salir");

        jpFormAlumno1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(btnBuscar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(btnNuevo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(btnEliminar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(btnGuardar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(btnSalir1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(txtNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(txtApellido1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(txtDni1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jrbEstado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpFormAlumno1.setLayer(jdNacimiento1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpFormAlumno1Layout = new javax.swing.GroupLayout(jpFormAlumno1);
        jpFormAlumno1.setLayout(jpFormAlumno1Layout);
        jpFormAlumno1Layout.setHorizontalGroup(
            jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormAlumno1Layout.createSequentialGroup()
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnNuevo1)
                        .addGap(32, 32, 32)
                        .addComponent(btnEliminar1)
                        .addGap(45, 45, 45)
                        .addComponent(btnGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir1))
                    .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                                .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jdNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                                    .addComponent(jrbEstado1)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellido1)))))
                .addGap(43, 43, 43))
            .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormAlumno1Layout.setVerticalGroup(
            jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormAlumno1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(40, 40, 40)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1))
                .addGap(27, 27, 27)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstado1))
                .addGap(45, 45, 45)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFormAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo1)
                    .addComponent(btnEliminar1)
                    .addComponent(btnGuardar1)
                    .addComponent(btnSalir1))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFormAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFormAlumno1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Estado:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Materia");

        btnBuscarCodigo.setText("Buscar");
        btnBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoActionPerformed(evt);
            }
        });

        btnNuevoMateria.setText("Nuevo");
        btnNuevoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMateriaActionPerformed(evt);
            }
        });

        btnEliminarMateria.setText("Eliminar");
        btnEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMateriaActionPerformed(evt);
            }
        });

        btnGuardarMateria.setText("Guardar");
        btnGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMateriaActionPerformed(evt);
            }
        });

        btnSalirMateria.setText("Salir");
        btnSalirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMateriaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Código:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(btnNuevoMateria))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminarMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarMateria)
                                .addGap(30, 30, 30)
                                .addComponent(btnSalirMateria))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(btnBuscarCodigo))
                                            .addComponent(jrbEstado2)
                                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel18)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCodigo))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jrbEstado2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalirMateria)
                            .addComponent(btnNuevoMateria)
                            .addComponent(btnGuardarMateria)
                            .addComponent(btnEliminarMateria))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMateriaActionPerformed
        limpiar();
        jrbEstado2.setSelected(false);
        btnEliminarMateria.setEnabled(false);
        txtNombreMateria.setEnabled(true);
        jrbEstado2.setEnabled(true);
        txtAnio.setEnabled(true);
        matBuscada = false;
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoMateriaActionPerformed

    private void btnSalirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMateriaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirMateriaActionPerformed

    private void btnBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoActionPerformed
        Materia mat = null;
        if (!txtCodigo.isEnabled()) {
            txtCodigo.setEnabled(true);
            txtNombreMateria.setEnabled(false);
            jrbEstado2.setEnabled(false);
            txtAnio.setEnabled(false);
            limpiar();
            return;
        }

        String nombre;
        int anio;
        boolean estado;
        Integer codigo = null;
        if (validaReal(txtCodigo.getText())) {
            codigo = Integer.parseInt(txtCodigo.getText());
        } else {
            JOptionPane.showMessageDialog(null, "El código debe ser numérico de máximo 9 digitos");
            txtCodigo.setText("");
            txtCodigo.requestFocus();
            return;
        }
        MateriaData md = new MateriaData();
        mat = md.buscarMateria(codigo);
        if (mat != null) {
            matBuscada = true;
        } else {
            return;
        }
        txtNombreMateria.setText("" + mat.getNombre());
        txtAnio.setText("" + mat.getAnio());
        jrbEstado2.setSelected(mat.isEstado());
        btnEliminarMateria.setEnabled(true);
        txtNombreMateria.setEnabled(true);
        jrbEstado2.setEnabled(true);
        txtAnio.setEnabled(true);
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarCodigoActionPerformed

    private void btnEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMateriaActionPerformed
        String nombre;
        int anio;
        boolean estado;
        int codigo = Integer.parseInt(txtCodigo.getText());
        MateriaData md = new MateriaData();
        Materia mat = md.buscarMateria(codigo);
        md.eliminarMateria(codigo);
        mat.setEstado(false);
    }//GEN-LAST:event_btnEliminarMateriaActionPerformed

    private void btnGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMateriaActionPerformed
        if (matBuscada) {
            modificarMat();
        } else {
            Integer anio = null;
            Integer codigo = null;
            boolean estado = false;
            String nombre = "";

            if (!txtNombreMateria.getText().isEmpty()) {
                if (validaReal(txtAnio.getText())) {

                    anio = Integer.parseInt(txtAnio.getText());
                    estado = jrbEstado2.isSelected();
                } else {
                    JOptionPane.showMessageDialog(null, "recuerde que el año debe ser numerico");
                    txtAnio.setText("");
                    txtAnio.requestFocus();
                    return;
                }
                nombre = txtNombreMateria.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                txtNombreMateria.setText("");
                txtNombreMateria.requestFocus();
                return;
            }

            MateriaData md = new MateriaData();
            Materia mat = new Materia(nombre, anio, estado);
            md.guardarMateria(mat);
            limpiar();
        }
        matBuscada = false;
    }//GEN-LAST:event_btnGuardarMateriaActionPerformed

    // ------------------ METODO PARA VALIDAR REAL ------------------
    private boolean validaReal(String nro) {
        Pattern patron = Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher m = patron.matcher(nro);
        return m.matches();

    }

    public void modificarMat() {
        Integer anio = null;
        Integer codigo = null;
        boolean estado = false;
        String nombre = "";
        if (validaReal(txtCodigo.getText())) {
            codigo = Integer.parseInt(txtCodigo.getText());
            nombre = txtNombreMateria.getText();
            if (validaReal(txtAnio.getText())) {
                anio = Integer.parseInt(txtAnio.getText());
                estado = jrbEstado2.isSelected();
            } else {
                JOptionPane.showMessageDialog(null, "El anio debe ser numerico");
                txtAnio.setText("");
                txtAnio.requestFocus();
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo debe ser numerico");
            txtCodigo.setText("");
            txtCodigo.requestFocus();
            return;
        }

        MateriaData md = new MateriaData();
        Materia mat = new Materia(codigo, nombre, anio, estado);
        md.modificarMateria(mat);
        limpiar();

    }

    public void limpiar() {
        txtCodigo.setText("");
        txtNombreMateria.setText("");
        txtAnio.setText("");
        jrbEstado2.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscarCodigo;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminarMateria;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardarMateria;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnNuevoMateria;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalirMateria;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdNacimiento1;
    private javax.swing.JDesktopPane jpFormAlumno1;
    private javax.swing.JRadioButton jrbEstado1;
    private javax.swing.JRadioButton jrbEstado2;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
