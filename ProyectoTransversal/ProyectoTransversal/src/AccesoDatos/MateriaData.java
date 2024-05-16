package AccesoDatos;

import Entidades.Materia;

import java.sql.*;


public class MateriaData {

    private Connection con = null;

    public MateriaData( ) {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria( Materia materia){
        
    }
    public void buscarMateria( int id){
        
    }
    public void modificarMateria( Materia materia){
        
    }
    public void eliminarMateria( int id ){
        
    }
    public List<Materia> listarMateria (){
        
    }
}
