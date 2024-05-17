package AccesoDatos;

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InscripcionData {
    Connection con;
    MateriaData matData;
    AlumnoData aluData;

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO (`nota`, `idAlumno`, `idMateria`) VALUES (?,?,?) ";
        try {
            PreparedStatement ps = con.prepareStatement(sql,0); // ver si va el 0 en vez de Statement.RETURN_GERERATED_KEYS
            ps.setDouble(1, insc.getNota());
            ps.setObject(2, insc.getAlumno()); // VER SI VA setObject
            ps.setObject(3, insc.getMateria());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                JOptionPane.showMessageDialog(null, "Inscripcion aniadida con exito");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de la Inscripcion"+e.getMessage());
        }
        
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            // probar instanciando alumno y materia para traer los id
            while (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(rs.getObject("idAlumno", Alumno.class));// ??????????
                inscripcion.setMateria(rs.getObject("IdMateria", Materia.class)); // ?????????
                inscripciones.add(inscripcion); 
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones"+e.getMessage());
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
    
     public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                    +" materia Where inscripcion.idMateria = materia.idMateria "
                    +"AND inscripcion.idAlumno = ?;";
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
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones"+e.getMessage());
        }
        return materias;
    
    }
     
}
