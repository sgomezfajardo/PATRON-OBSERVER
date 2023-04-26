/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author TUF ASUS
 */
public class interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Notificaciones listadecliente = new Notificaciones();
       Observador observer = new Observador();
       int opcion2;

       do{
                     System.out.println("Opcion 1 para Registrarse en el sistema");
                     System.out.println("Opcion 2 para Desregistrarse en el sistema");
       
                     opcion2 = sc.nextInt();
                     switch(opcion2){
                     case 1:
                     sc.nextLine();
                     int codigo;
                     System.out.println("Digite su nombre: ");
                     String nombre = sc.nextLine();
                     System.out.println("Digite el codigo que desea tener: ");
                     codigo =sc.nextInt();
                     listadecliente.UsuarioRegistro(codigo, nombre);
                     System.out.println("Usted ha sido registrado exitosamente :D");
                     observer.update();
                     break;
                     case 2:
                     System.out.println("Digite el codigo para hacer la cancelacion de sus suscripcion");
                     codigo=sc.nextInt();
                     listadecliente.unregister(codigo);
                     observer.update();
                     break;
       }
 
    }while(true);
     
    
    }
    
}
