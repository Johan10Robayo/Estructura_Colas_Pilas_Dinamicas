/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaD;

/**
 *
 * @author JOHAN
 */
public class Nodo {
    private String info;
    private Nodo siguiente ;
    
    
    public Nodo(String info){
        this.info=info;
        siguiente=null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
