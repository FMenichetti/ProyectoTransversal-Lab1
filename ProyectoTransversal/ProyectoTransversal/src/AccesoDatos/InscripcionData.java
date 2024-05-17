package AccesoDatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    Connection con;
    MateriaData matData;
    AlumnoData aluData;

    public InscripcionData() {
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO (`nota`, `idAlumno`, `idMateria`) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno()); // VER SI VA setObject
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion registrada con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de la Inscripcion" + e.getMessage());
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones" + e.getMessage());
        }
        return inscripciones;

    }

//     public List<Inscripcion> obtenerInscripcionsPorAlumno(int id){
//        List<Inscripcion> inscripciones = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM inscripcion";
//            PreparedStatement ps = con.prepareCall(sql);
//            ResultSet rs = ps.executeQuery();
//            Inscripcion inscripcion;
//            while (rs.next()) {
//                inscripcion = new Inscripcion();
//                inscripcion.setNota(rs.getInt("nota"));
//                inscripcion.setAlumno(rs.getObject("idAlumno", Alumno.class));// ??????????
//                inscripcion.setMateria(rs.getObject("IdMateria", Materia.class)); // ?????????
//                inscripciones.add(inscripcion); 
//            }
//            ps.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones"+e.getMessage());
//        }
//        return inscripciones;
//    
//    }
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                    + " materia Where inscripcion.idMateria = materia.idMateria "
                    + "AND inscripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones" + e.getMessage());
        }
        System.out.println("hola");
        return materias;
        
    }
    

}
