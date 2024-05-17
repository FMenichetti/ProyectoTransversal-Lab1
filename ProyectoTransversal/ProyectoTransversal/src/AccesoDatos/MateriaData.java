package AccesoDatos;

import Entidades.Alumno;
import Entidades.Materia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MateriaData {

    private Connection con = null;

    public MateriaData( ) {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria( Materia materia){
        
        String sql = "INSERT INTO materia (nombre,anio,estado) "
                + "VALUES (?,?,?)";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString (1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Materia añadida con exito");

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la DB");

        } catch (Exception e) {
            System.out.println("error general");
        }

    }
    public Materia buscarMateria( int id){
         Materia materia = null;

        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria = ? AND estado = 1 ";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();

                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "no existe la materia");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

        return materia;
    }
    public void modificarMateria( Materia materia){
        
         String sql = "UPDATE materia SET nombre = ? , anio = ?, estado = ? WHERE idMateria =  ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnio());
            ps.setBoolean(4, materia.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            } else {

                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

        
    }
    public void eliminarMateria( int id ){
        
        try {

            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");

            }
            ps.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
        
    }
    public List<Materia> listarMateria (){
          List<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(true);
                materias.add(materia);

            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }

        return materias;
    }
}
