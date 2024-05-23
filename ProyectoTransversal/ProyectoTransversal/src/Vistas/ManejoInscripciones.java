/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.AlumnoData;
import AccesoDatos.InscripcionData;
import AccesoDatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edulo
 */
public class ManejoInscripciones extends javax.swing.JInternalFrame {

    InscripcionData iData = new InscripcionData();
    MateriaData mData = new MateriaData();
    AlumnoData aData = new AlumnoData();
    Alumno alumno;

    private DefaultTableModel tabla = new DefaultTableModel();

    public ManejoInscripciones() {
        initComponents();
        cargaAlumnosJCombo();
        pintarColumnasTabla();
        limpiarTabla();
        alumno = (Alumno) jComboInscrip.getSelectedItem();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboInscrip = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jrbMatNoInscrip = new javax.swing.JRadioButton();
        jrbMatInscrip = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaInscrip = new javax.swing.JTable();
        btnInscribir = new javax.swing.JButton();
        btnAnularInscrip = new javax.swing.JButton();
        btnSalirInscrip = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Formulario de Inscripción");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Seleccione un alumno:");

        jComboInscrip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboInscripItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Listado de Materias");

        buttonGroup1.add(jrbMatNoInscrip);
        jrbMatNoInscrip.setText("Materias no Inscriptas");
        jrbMatNoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatNoInscripActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbMatInscrip);
        jrbMatInscrip.setSelected(true);
        jrbMatInscrip.setText("Materias Inscriptas");
        jrbMatInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatInscripActionPerformed(evt);
            }
        });

        jTablaInscrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaInscrip);

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnAnularInscrip.setText("Anular Inscripción");

        btnSalirInscrip.setText("Salir");
        btnSalirInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInscripActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jrbMatNoInscrip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbMatInscrip)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(51, 51, 51)
                                .addComponent(jComboInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInscribir)
                                    .addGap(88, 88, 88)
                                    .addComponent(btnAnularInscrip)
                                    .addGap(86, 86, 86)
                                    .addComponent(btnSalirInscrip))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboInscrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMatNoInscrip)
                    .addComponent(jrbMatInscrip))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnAnularInscrip)
                    .addComponent(btnSalirInscrip))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarTabla(List<Materia> materias) {
        limpiarTabla();
//Depende el RB ejecuto la instruccion
        if (jrbMatInscrip.isSelected()) {
            for (Materia m : materias) {
                tabla.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
            }

        } else if (jrbMatNoInscrip.isSelected()) {
            for (Materia m : materias) {
                tabla.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
            }
        }
    }


    private void btnSalirInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInscripActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirInscripActionPerformed

    private void jrbMatNoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatNoInscripActionPerformed
        // TODO add your handling code here:
        //Materias no inscriptas
        List<Materia> materias = new ArrayList<>();
        limpiarTabla();
        alumno = (Alumno)jComboInscrip.getSelectedItem();
        if (jrbMatNoInscrip.isSelected()) {
            materias = iData.obtenerMateriasNOCursadas(alumno.getIdAlumno());
        }

        listarTabla(materias);
    }//GEN-LAST:event_jrbMatNoInscripActionPerformed

    private void jComboInscripItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboInscripItemStateChanged
        // TODO add your handling code here:
        limpiarTabla();
    }//GEN-LAST:event_jComboInscripItemStateChanged

    private void jrbMatInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatInscripActionPerformed
        // TODO add your handling code here:
        List<Materia> materias = new ArrayList<>();
        limpiarTabla();
        alumno = (Alumno)jComboInscrip.getSelectedItem();
        if (jrbMatInscrip.isSelected()) {
            materias = iData.obtenerMateriasCursadas(alumno.getIdAlumno());
        }

        listarTabla(materias);
    }//GEN-LAST:event_jrbMatInscripActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
        alumno = (Alumno)jComboInscrip.getSelectedItem();
        
        Inscripcion i = new Inscripcion();
        iData.guardarInscripcion(i);
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void cargaAlumnosJCombo() {

        // Despliegue de lista de alumnos
        List<Alumno> lista = aData.listarAlumno();
        for (Alumno alumno : lista) {
            jComboInscrip.addItem(alumno);
        }
    }

    //Limpieza de la tabla
    public void limpiarTabla() {
        int filas = tabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tabla.removeRow(i);
        }
    }

    private void pintarColumnasTabla() {
        jTablaInscrip.setModel(tabla);
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Año");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularInscrip;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalirInscrip;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox jComboInscrip;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaInscrip;
    private javax.swing.JRadioButton jrbMatInscrip;
    private javax.swing.JRadioButton jrbMatNoInscrip;
    // End of variables declaration//GEN-END:variables
}
