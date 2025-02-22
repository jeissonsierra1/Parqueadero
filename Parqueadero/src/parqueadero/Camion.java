/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;

import java.time.LocalDateTime;

/**
 *
 * @author sierr
 */
public class Camion extends Vehiculo {
    
     private double capacidadCarga;
     
         // Constructor

    public Camion(String placa, String marca, String modelo, double capacidadCarga, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.capacidadCarga = capacidadCarga;
    }

        // Getter

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

            // Setters

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    
    public String getInfo() {
        return super.getInfo() + ", Capacidad de Carga: " + capacidadCarga + " toneladas";
    }
    
}
