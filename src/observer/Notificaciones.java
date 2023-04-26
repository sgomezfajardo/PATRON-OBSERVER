/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author TUF ASUS
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
class Notificaciones{

    List<Usuario> observerList = new ArrayList<>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }
    
     public void UsuarioRegistro(int codigo,String nombre){
        Usuario nuevo = new Usuario(codigo,nombre);
        observerList.add(nuevo);
    }
    public void verlista(){
        for (int i = 0; i < observerList.size(); i++) {
            System.out.println(observerList.get(i).getNombre());
            
        }
    
    }

    public void unregister(int codigo) {
        for (int i = 0; i < observerList.size(); i++) {
            if(codigo == observerList.get(i).getCodigo())
            observerList.remove(i);
            System.out.println("Su suscripcion al sistema ha sido cancelada D:");
        }
        
    }

    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
}