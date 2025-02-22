/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author sierr
 */
public class Parqueadero1 {
    
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private static final double TARIFA_AUTOMOVIL = 2000;
    private static final double TARIFA_MOTOCICLETA = 1000;
    private static final double TARIFA_CAMION = 5000;
    
    private static Parqueadero1 parqueadero;

   

        public Parqueadero1() {
            this.vehiculos = new ArrayList<>();
        }
    
    
    
    
    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo ingresado: " + vehiculo.getPlaca());
        System.out.println("Vehículo ingresado: " + vehiculo.getPlaca());
    System.out.println("Lista de vehículos tras entrada: " + vehiculos);
        
    }
    

   public static Parqueadero1 getParqueadero() {
    if (parqueadero == null) {
        parqueadero = new Parqueadero1();
    }
    return parqueadero;
}
    public static void setParqueadero(Parqueadero1 parqueadero) {
        Parqueadero1.parqueadero = parqueadero;
    }
    
    
    public double registrarSalida(String placa) {
        
          for (Vehiculo v : vehiculos) {
        if (v.getPlaca().equals(placa)) {
            vehiculos.remove(v);
            
            // Obtener la hora de entrada y salida en horas y minutos
            LocalDateTime entrada = v.getHoraEntrada();
            LocalDateTime salida = LocalDateTime.now();
            
            int horasEntrada = entrada.getHour();
            int minutosEntrada = entrada.getMinute();
            int horasSalida = salida.getHour();
            int minutosSalida = salida.getMinute();
            
            // Calcular la diferencia en minutos
            int totalMinutos = (horasSalida * 60 + minutosSalida) - (horasEntrada * 60 + minutosEntrada);
            
            // Convertir a horas, asegurando al menos 1 hora
            int horasCobradas = Math.max(1, (totalMinutos + 59) / 60); // Redondea hacia arriba

            // Determinar la tarifa según el tipo de vehículo
            double tarifa = (v instanceof Automovil) ? TARIFA_AUTOMOVIL :
                           (v instanceof Motocicleta) ? TARIFA_MOTOCICLETA : TARIFA_CAMION;

            double costo = horasCobradas * tarifa;
            System.out.println("Salida registrada. Costo: $" + costo);
            return costo;
        }
    }
    System.out.println("Vehículo no encontrado.");
    return 0;
}
        
          public void limpiarParqueadero() {
    vehiculos.clear();
    System.out.println("Parqueadero limpiado.");
}
    
      public void consultarEstado() {
        System.out.println("Vehículos en el parqueadero:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getInfo());
        }
    }
      
      public boolean vehiculoEstaRegistrado(String placa) {
    for (Vehiculo v : vehiculos) {
        if (v.getPlaca().equals(placa)) {
            return true;
        }
    }
    return false;
}
    
}
