/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zamuh
 */
public class PersonaTest {
    
   @Test
    public void testGetEdad() {
        
        // Crear una persona con fecha de nacimiento hace 20 años
        LocalDate fechaNacimiento = LocalDate.now().minusYears(20);
        Persona persona = new Persona(19185823, "Hector", 'M', fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());

        // Verificar que la edad es 20
        assertEquals(20, persona.getEdad());
    }

    @Test
    public void testEquals() {
        // Crear dos personas con el mismo NIF
        Persona persona1 = new Persona(12345678, "Pepe", 'M', 1, 1, 2000);
        Persona persona2 = new Persona(12345678, "Flavio", 'F', 1, 1, 2000);

        // Verificar que las personas son iguales
        assertTrue(persona1.equals(persona2));
    }

    @Test
    public void testCompareTo() {
        // Crear dos personas con NIFs diferentes
        Persona persona1 = new Persona(12345678, "Lucia", 'F', 13, 12, 2005);
        Persona persona2 = new Persona(87654321, "María", 'F', 13, 12, 2005);

        // Verificar que persona1 es menor que persona2 según el orden natural (comparación de NIFs)
        assertTrue(persona1.compareTo(persona2) < 0);
    }
}
