package PilaDinamica;

public class Main {

    public static void main(String[] args) {

        PilaDinamica<Integer> pilaNumeros = new PilaDinamica<>();

        System.out.println("¿La pila esta vacia? (inicio) " + pilaNumeros.isEmpty());

        pilaNumeros.push(5);
        pilaNumeros.push(10);
        pilaNumeros.push(15);
        pilaNumeros.push(20);
       
        System.out.println("¿La pila esta vacia? (despues de agregar) " + pilaNumeros.isEmpty());

        System.out.println("El tamaño ahora es de " + pilaNumeros.size());

        System.out.println("El top es " + pilaNumeros.top());

        int elemento = pilaNumeros.pop();

        System.out.println("He sacado el numero " + elemento);
        System.out.println("El tamaño ahora es de " + pilaNumeros.size());
        
        System.out.println("El top es " + pilaNumeros.top());

        
        System.out.println(pilaNumeros);        
        
    }
}
