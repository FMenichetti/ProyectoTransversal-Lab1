package Vistas;

import AccesoDatos.AlumnoData;
import AccesoDatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioCargaNotas extends javax.swing.JInternalFrame {

    //Atributos
    DefaultTableModel modeloTabla;
    AlumnoData alumnoData; //Instancia de la entidad AlumnoData
    InscripcionData inscripcionData; //Instancia de la entidad InscripcionData
    

    //Constructor
    public FormularioCargaNotas() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        alumnoData = new AlumnoData();
        inscripcionData = new InscripcionData();
    }

    //Metodos
    //Este metodo va a listar los alumnos en el combo box
    public void listarAlumnosEnComboBox() {
        AlumnoData ad = new AlumnoData();
        List<Alumno> alumnos = ad.listarAlumno();

        //Invocamos el metodo ordenarLista
        ordenarLista(alumnos);

        //Limpiamos el combo box antes de agregar los alumnos
        jComboNotas.removeAllItems();

        // Agregar cada alumno al combo box
        for (Alumno alumno : alumnos) {
            String nombreCompleto = alumno.getApellido() + ", " + alumno.getNombre();
            jComboNotas.addItem(nombreCompleto);
        }
    }

    //Este es para ordenar la lista de alumnos por nombre completo
    private void ordenarLista(List<Alumno> alumnos) {
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                String nombreCompleto1 = a1.getApellido() + ", " + a1.getNombre();
                String nombreCompleto2 = a2.getApellido() + ", " + a2.getNombre();
                return nombreCompleto1.compareTo(nombreCompleto2);
            }
        });
    }

    //Este metodo va a ordenar la lista de inscripciones por nombre de materia
    private void ordenarListaInscripciones(List<Inscripcion> inscripciones) {
        //Utilizamos un comparador personalizado para comparar las inscripciones por el nombre de la materia
        Collections.sort(inscripciones, new Comparator<Inscripcion>() {
            @Override
            public int compare(Inscripcion i1, Inscripcion i2) {
                //Comparamos las inscripciones por el nombre de la materia
                return i1.getMateria().getNombre().compareTo(i2.getMateria().getNombre());
            }
        });
    }

    //Este metodo es para obtener el ID del alumno dado su nombre completo
    private int obtenerIdAlumnoPorNombre(String nombreCompletoAlumno) {
        //Primero conseguimos la lista de alumnos
        List<Alumno> alumnos = alumnoData.listarAlumno(); //Mediante nuestro objeto alumnoData invocamos el metodo listarAlumno

        //Ahora con un bucle for vamos a recorrer la lista de alumnos y buscar el alumno por nombre completo
        for (Alumno alumno : alumnos) {
            //En este String construimos el nombre completo del alumno
            String nombreCompleto = alumno.getApellido() + ", " + alumno.getNombre();

            //En este paso compromabamos si el nombre completo coincide
            if (nombreCompleto.equals(nombreCompletoAlumno)) {
                //En caso de ser asi, devolvemos el ID del alumno
                return alumno.getIdAlumno();
            }
        }

        //devolvemos -1 si no se encuentra ningún alumno con el nombre completo 
        return -1;
    }

    // Método para actualizar la tabla con las inscripciones del alumno
    private void actualizarTablaConInscripciones(List<Inscripcion> inscripciones) {
        // Obtenemos el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) jTablaNotas.getModel();
        // Limpiamos el contenido de la tabla
        modeloTabla.setRowCount(0);

        // Recorremos la lista de inscripciones y las agregamos a la tabla
        inscripciones.forEach(inscripcion -> {
            Materia materia = inscripcion.getMateria();
            // Creamos un array con los datos de la materia
            Object[] rowData = {materia.getIdMateria(), materia.getNombre(), inscripcion.getNota()};

            // Agregamos la fila a la tabla
            modeloTabla.addRow(rowData);
        });
    }

    //Este metodo va a validar el ingreso correcto de numeros
    private boolean validaReal(String nro) {
        Pattern patron = Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboNotas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaNotas = new javax.swing.JTable();
        btnGuardarNota = new javax.swing.JButton();
        btnSalirNotas = new javax.swing.JButton();

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Carga de notas");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Seleccione un alumno:");

        jComboNotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNotasActionPerformed(evt);
            }
        });

        jTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaNotas);

        btnGuardarNota.setText("Guardar");
        btnGuardarNota.setEnabled(false);
        btnGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNotaActionPerformed(evt);
            }
        });

        btnSalirNotas.setText("Salir");
        btnSalirNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnGuardarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirNotas)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNota)
                    .addComponent(btnSalirNotas))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eventos
    private void btnSalirNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirNotasActionPerformed
        //Este boton solo va a cerrar el formulario
        dispose();
    }//GEN-LAST:event_btnSalirNotasActionPerformed

    private void jComboNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNotasActionPerformed
        //Desactivamos el botón guardar hasta que se seleccione una fila
        btnGuardarNota.setEnabled(false);

        //Rescatamos el nombre del alumno seleccionado en el combo box
        String nombreCompletoAlumno = (String) jComboNotas.getSelectedItem();

        //Buscamos el ID del alumno seleccionado
        int idAluSelec = obtenerIdAlumnoPorNombre(nombreCompletoAlumno);

        //Con este condicional vamos a verificar si se encontro el alumno seleccionado
        if (idAluSelec != -1) {
            //Si se encontro, vamos a buscar la lista de inscripciones del alumno utilizando su ID
            List<Inscripcion> inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(idAluSelec);

            //Una vez q tenemos la lista, llamamos al metodo que nos la va a ordenar
            ordenarListaInscripciones(inscripciones);

            //Actualizamos la tabla con las inscripciones ordenadas del alumno
            actualizarTablaConInscripciones(inscripciones);

        }
    }//GEN-LAST:event_jComboNotasActionPerformed

    private void btnGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNotaActionPerformed
        // Obtener la fila seleccionada
        int filaSeleccionada = jTablaNotas.getSelectedRow();

        // Verificar si se seleccionó una fila
        if (filaSeleccionada != -1) {
            //Rescatamos los datos de la fila seleccionada
            int idMateria = (int) jTablaNotas.getValueAt(filaSeleccionada, 0);
            //Rescatamos el nombre de la materia que esta en la fila seleccionada y en la columna 1
            String nombreMateria = (String) jTablaNotas.getValueAt(filaSeleccionada, 1);
            double nuevaNota = Double.parseDouble(jTablaNotas.getValueAt(filaSeleccionada, 2).toString());

            //Guardamos en esta variable el nombre completo del alumno
            String nombreCompletoAlumno = (String) jComboNotas.getSelectedItem();

            //Vamos a solicitar una confirmacion para hacer los cambios
            int opcion = JOptionPane.showOptionDialog(this,
                    "¿Actualizar nota de " + nombreCompletoAlumno + "?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, // Cambiamos el tipo de mensaje a QUESTION_MESSAGE
                    null, // Sin icono personalizado
                    new Object[]{"Sí", "No"}, //Botones q vamos a mostrar
                    "Sí"); //Boton predeterminado

            if (opcion == JOptionPane.YES_OPTION) {
                //Ahora actualizamos la nota en la db
                int idAlumno = obtenerIdAlumnoPorNombre(nombreCompletoAlumno);
                inscripcionData.actualizarNota(idAlumno, idMateria, nuevaNota);
                
                //Volvemos a cargar la lista pero actualizada desde la db 
                listarAlumnosEnComboBox();
                jComboNotas.setSelectedItem(nombreCompletoAlumno);

            }
        }
    }//GEN-LAST:event_btnGuardarNotaActionPerformed

    private void jTablaNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaNotasMouseClicked
        //Activamos el boton cuando escuchamos el click
        btnGuardarNota.setEnabled(true);
    }//GEN-LAST:event_jTablaNotasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarNota;
    private javax.swing.JButton btnSalirNotas;
    private javax.swing.JComboBox<String> jComboNotas;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaNotas;
    // End of variables declaration//GEN-END:variables
}
