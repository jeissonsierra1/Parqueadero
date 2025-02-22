/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueadero;
import java.time.LocalDateTime;
import java.util.Scanner;


/**
 *
 * @author Jeisson Sierra
 */
public class Parqueadero {
        private static Parqueadero1 parqueadero = Parqueadero1.getParqueadero();
    
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        boolean continuar = true;
        
        do{
            
        
        System.out.println("\n|| MENU PARQUEADERO ||");
        System.out.print("\nSeleccione una opcion:\n "); 
        System.out.println("\n[1]. Registrar entrada de vehiculo");
        System.out.println("\n[2]. Registrar salida de vehiculo");
        System.out.println("\n[3]. Consultar estado del parqueadero");
        System.out.println("\n[4]. Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        
        switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    LocalDateTime horaEntrada = LocalDateTime.now();
                    System.out.print("Tipo de vehiculo (1. Automovil, 2. Motocicleta, 3. Camion): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    Vehiculo vehiculo = null;
                    if (tipo == 1) {
                        System.out.print("Tipo de combustible: ");
                        String combustible = scanner.nextLine();
                        vehiculo = new Automovil(placa, marca, modelo, combustible, horaEntrada);
                    } else if (tipo == 2) {
                        System.out.print("Cilindraje: ");
                        int cilindraje = scanner.nextInt();
                        vehiculo = new Motocicleta(placa, marca, modelo, cilindraje, horaEntrada);
                    } else if (tipo == 3) {
                        System.out.print("Capacidad de carga (toneladas): ");
                        double carga = scanner.nextDouble();
                        vehiculo = new Camion(placa, marca, modelo, carga, horaEntrada);
                    }
                    if (vehiculo != null) {
                        parqueadero.registrarEntrada(vehiculo);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la placa del vehiculo a retirar: ");
                    String placaSalida = scanner.nextLine();
                    parqueadero.registrarSalida(placaSalida);
                    break;
                case 3:
                    parqueadero.consultarEstado();
                    break;
                    
                case 4:
                    
                    continuar = false;
                    break;
                default:
                     System.out.println("Opcion no válida. Intente de nuevo.");
            
        }        
        
                
            }
        
     
        while (continuar);

        System.out.println("Programa finalizado");
        }
}
    



