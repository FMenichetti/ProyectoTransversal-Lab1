package Entidades;

import AccesoDatos.AlumnoData;
import AccesoDatos.InscripcionData;
import AccesoDatos.MateriaData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // CREAMOS ALUUMNOS
        Alumno a1 = new Alumno(42239754, "Arias", "Fabrizio", LocalDate.of(1999, 5, 11), true);
        Alumno a2 = new Alumno(3511123, "Lopez", "Eduardo", LocalDate.of(1988, 3, 1), true);
        Alumno a3 = new Alumno(3723123, "Menichetti", "Franco", LocalDate.of(1989, 11, 11), true);
        Alumno a4 = new Alumno(9923123, "Stieger", "Valentin", LocalDate.of(2020, 9, 30), true);

        // EMPEZAMOS A PROBAR LOS METODOS
        // ENTREGA 1
        AlumnoData aluData = new AlumnoData();
//        aluData.guardarAlumno(a1);
//        aluData.guardarAlumno(a2);
//        aluData.guardarAlumno(a3);
//        aluData.guardarAlumno(a4);
//        Alumno a5 = aluData.buscarAlumno(3);
//        System.out.println(a5.toString());

//        Alumno a5 = aluData.buscarAlumnoPorDni(3723123);
//        System.out.println(a5.toString());
//        for (Alumno alumno : aluData.listarAlumno()) {
//            System.out.println(alumno);
//        }
//        Alumno a5 = aluData.buscarAlumnoPorDni(3723123);
//        a5.setNombre("Eduardo Abel");
//        aluData.modificarAlumno(a5);
//        System.out.println(a5.getNombre());

//        Alumno a5 = aluData.buscarAlumnoPorDni(3723123);
//        aluData.eliminarAlumno(a5.getIdAlumno());

        // ENTREGA 2
        Materia m1 = new Materia("Matematicas", 1, true);
        Materia m2 = new Materia("EDA", 1, true);
        Materia m3 = new Materia("Laboratorio 1", 1, true);
        Materia m4 = new Materia("Ingenieria de Software", 3, true);
        
        //EMPEZAMOS A PROBAR LOS METODOS
        MateriaData md = new MateriaData();
        //md.guardarMateria(m1);
        //md.guardarMateria(m2);
        //md.guardarMateria(m3);
        //md.guardarMateria(m4);
        
        //System.out.println("Materia buscada: " + md.buscarMateria(3));
        
        
        
        //Materia m5 = md.buscarMateria(4);
        //m5.setNombre("Ingles");
        //md.modificarMateria(m5);
        
        //md.eliminarMateria(3);
        
//        for (Materia materia : md.listarMateria()) {
//            System.out.println(materia);
//        }
        
//        Alumno a6 = aluData.buscarAlumno(1);
//        Materia m6 = md.buscarMateria(4);
//        
//        Inscripcion i1 = new Inscripcion(a6, m6, 5);
          InscripcionData iData1 = new InscripcionData();
        
        //iData1.guardarInscripcion(i1);
        

//        for (Inscripcion ob : iData1.obtenerInscripciones()) {
//            System.out.println(ob);
//        }

//        for (Inscripcion oba2 : iData1.obtenerInscripcionesPorAlumno(1)) {
//            System.out.println(oba2);
//        }

         
//        for (Materia oba3 : iData1.obtenerMateriasCursadas(5)) {
//             System.out.println(oba3);
//        }
//        System.out.println("///////////");
//          for (Materia oba4 : iData1.obtenerMateriasNOCursadas(5)) {
//             System.out.println(oba4);
//        }

//        for (Inscripcion oba5 : iData1.obtenerInscripciones()) {
//             if (oba5.getIdInscripcion() == 17) {
//                iData1.borrarInscripcionMateriaAlumno(oba5.getAlumno().getIdAlumno(), oba5.getMateria().getIdMateria());
//                break;
//            }
//        }

//        for (Inscripcion oba6 :iData1.obtenerInscripciones()) {
//             if (oba6.getIdInscripcion() == 18) {
//                iData1.actualizarNota(oba6.getAlumno().getIdAlumno(), oba6.getMateria().getIdMateria(), 7.5);
//                break;
//            }
//        }
        
//          for (Alumno oba7 : iData1.obtenerAlumnosXMaterias(1)) {
//              System.out.println(oba7);
//            }
        }
        
    
}
