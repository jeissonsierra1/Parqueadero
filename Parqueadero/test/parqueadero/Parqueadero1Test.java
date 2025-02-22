/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package parqueadero;

import java.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para Parqueadero1
 */
public class Parqueadero1Test {

private Parqueadero1 parqueadero = Parqueadero1.getParqueadero();

    
    
    @Before
    public void setUp() {
        parqueadero = Parqueadero1.getParqueadero();
        parqueadero.limpiarParqueadero();  // Limpia la lista antes de cada prueba
    }

    @Test
    public void testRegistrarEntrada() {
        System.out.println("registrarEntrada");

        Vehiculo auto = new Automovil("Gasolina", "ABC123", "Toyota", "Corolla", LocalDateTime.now());

        parqueadero.registrarEntrada(auto);

        assertTrue(parqueadero.vehiculoEstaRegistrado("ABC123"));
    }
    
        @Test
    public void testRegistrarSalida() {
        System.out.println("registrarSalida");

        // Registrar primero el vehículo antes de eliminarlo
        Vehiculo auto = new Automovil("Gasolina", "XYZ789", "Honda", "Civic",  LocalDateTime.now());
        parqueadero.registrarEntrada(auto);

        // Ahora sí probar la salida
        double costo = parqueadero.registrarSalida("XYZ789");

        // Como el tiempo es mínimo, el costo debe ser al menos la tarifa mínima
        assertTrue(costo >= 2000); // Para un automóvil
    }


}