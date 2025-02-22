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
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private LocalDateTime horaEntrada;
    
       /// Constructor


    public Vehiculo(String placa, String marca, String modelo, LocalDateTime horaEntrada) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }
    
   
    
    
   /// Getters
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }
    
    
       /// Setters

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

        
    public String getInfo() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Hora de Entrada: " + horaEntrada;
    }
    public String toString() {
    return "Vehiculo{" +
            "placa='" + placa + '\'' +
            ", marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            '}';}
    
}
