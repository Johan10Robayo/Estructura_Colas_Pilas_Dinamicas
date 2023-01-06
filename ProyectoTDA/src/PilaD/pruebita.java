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
public class pruebita {
    public static void main(String[] args) {
        PilaD p=new PilaD();
        p.apilar("johan");
        p.apilar("jhon");
        p.apilar("carlos");
        p.mostrar();
        System.out.println(p.getNelementos());
        p.desapilar();
        p.mostrar();
         p.desapilar();
        p.mostrar();
            
          p.desapilar();
        p.mostrar();
          p.desapilar();
        p.mostrar();
        }
}
