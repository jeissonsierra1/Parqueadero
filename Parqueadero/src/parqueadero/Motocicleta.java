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
public class Motocicleta extends Vehiculo {
    private int cilindraje;
    
    // Constructor

    public Motocicleta(String placa, String marca, String modelo, int cilindraje, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.cilindraje = cilindraje;
    }
    
    // Getter

    public int getCilindraje() {
        return cilindraje;
    }
        // Setters

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
       
    
    
    public String getInfo() {
        return super.getInfo() + ", Cilindraje: " + cilindraje;
    }
    
    
}
