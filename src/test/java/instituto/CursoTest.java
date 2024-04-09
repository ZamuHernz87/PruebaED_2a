/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author zamuh
 */
public class CursoTest {
    
    private Curso curso;
    private Persona alumno1;
    private Persona alumno2;
    
    /*Introducción de los datos deseados a probar*/
    @BeforeEach
    public void setUp() {
        curso = new Curso("4ºEso");
        alumno1 = new Persona(18186879, "Samuel", 'M', 8,11, 2005);
        alumno2 = new Persona(19196979, "Juan", 'M', 19, 2, 1978);
    }
    
    /*Prueba de adición de dos alumnos al proyecto para comprobar 
    si los datos se almacenan correctamente en curso*/
    
    @Test
    public void testAniadirAlumno() {
        
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);

        // Verificar que los alumnos están en la descripción del curso
        assertTrue(curso.toString().contains(alumno1.toString()));
        assertTrue(curso.toString().contains(alumno2.toString()));
    }
}
