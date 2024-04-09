/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 * 
 * Clase que representa un curso.
 * Esta clase contiene un nombre y una lista de 
 * alumnos inscritos en el curso.
 */
 
public class Curso {

    //datos del curso
    private String nombre;
    private TreeSet<Persona> listaAlumnos;
    
    /*
     * Devuelve el nombre del curso.
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }
    
    //constructor de la clase
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    
    // Implementación del método toString
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    
    /*
     * Añade un alumno al curso.
     * @param p La persona que se va a añadir como alumno al curso.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
