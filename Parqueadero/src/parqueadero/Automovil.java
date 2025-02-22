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
public class Automovil extends Vehiculo {
    private String tipoCombustible;
    
        // Constructor

    public Automovil(String tipoCombustible, String placa, String marca, String modelo, LocalDateTime horaEntrada) {
        super(placa, marca, modelo, horaEntrada);
        this.tipoCombustible = tipoCombustible;
    }


  

    
        // Getter

    public String getTipoCombustible() {
        return tipoCombustible;
    }

            // Setters

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
    
     public String getInfo() {
        return super.getInfo() + ", Tipo de Combustible: " + tipoCombustible;
    }
     
    
}
    

