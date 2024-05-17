package Entidades;

import AccesoDatos.AlumnoData;
import java.time.LocalDate;


public class Main {
    
    public static void main(String[] args) {
        // CREAMOS ALUUMNOS
        Alumno a1 = new Alumno(42239754, "Arias", "Fabrizio", LocalDate.of(1999,5,11), true);
        Alumno a2 = new Alumno(3511123, "Lopez", "Eduardo", LocalDate.of(1988,3,1), true);
        Alumno a3 = new Alumno(3723123, "Menichetti", "Franco", LocalDate.of(1989,11,11), true);
        Alumno a4 = new Alumno(9923123, "Stieger", "Valentin", LocalDate.of(2020,9,30), true);
                
        // EMPEZAMOS A PROBAR LOS METODOS
        AlumnoData aluData = new AlumnoData();
        //aluData.guardarAlumno(a1);
        aluData.buscarAlumno(3);
        
    }
}
