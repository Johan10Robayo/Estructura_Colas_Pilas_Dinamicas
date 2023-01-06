/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaD;

import javax.swing.JOptionPane;

/**
 *
 * @author JOHAN
 */
public class PilaD {
    private Nodo cima;
    private Nodo inicio;
    private int nelementos;
    
    public PilaD(){
        inicio=cima=null;
        nelementos=0;
     }
    public boolean vacia(){
        if(inicio==null){
            return true;
        }else return false;
            
    }
    
    public Nodo apilar(String info){
        Nodo n=new Nodo(info);
        if(inicio==null){
            inicio=cima=n;
            nelementos++;
        }else{
            cima.setSiguiente(n);
            cima=cima.getSiguiente();
            nelementos++;
        }
        return n ;
    }
     public void desapilar(){
         Nodo aux =inicio;
         if(!vacia()){
             
             while(aux.getSiguiente()!=cima &&aux.getSiguiente()!=null){
                 aux=aux.getSiguiente();
             }
             if(aux.getSiguiente()==null){
                 cima=inicio=null;
             }
             cima=aux;
             cima.setSiguiente(null);
             nelementos--;
         }else{
             JOptionPane.showMessageDialog(null,"pila vacia");
         }
     }

     public void mostrar(){
         Nodo aux=inicio;
         while(aux!=null){
             System.out.println(aux.getInfo());
             aux=aux.getSiguiente();
         }System.out.println();
     }
    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getNelementos() {
        return nelementos;
    }

    public void setNelementos(int nelementos) {
        this.nelementos = nelementos;
    }
     
     
            
    
}
