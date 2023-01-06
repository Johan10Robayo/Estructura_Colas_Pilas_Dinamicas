package ColaDinamica;

public class Main {

    public static void main(String[] args) {
        ColaDinamica<Integer> cola = new ColaDinamica<>();

        System.out.println("El tamaño es: " + cola.size());
        System.out.println("¿Esta vacia? (inicio) " + cola.isEmpty());

        cola.encolar(5);
        cola.encolar(10);
        cola.encolar(15);
        cola.encolar(20);
       

        System.out.println("El tamaño es: " +cola.size());
        System.out.println("¿Esta vacia? (despues de agregar) " +cola.isEmpty());
        
        System.out.println("El primero es: "+cola.primero());
        
        System.out.println("Desencolo el primero (5) "+cola.desencolar());
        System.out.println("Desencolo el primero (10) "+cola.desencolar());
        System.out.println("Desencolo el primero (15) "+cola.desencolar());
        System.out.println("Desencolo el primero (20) "+cola.desencolar());
        System.out.println("Desencolo el primero (null) "+cola.desencolar());
     
        
        System.out.println("El tamaño es: "+cola.size());
        System.out.println("¿Esta vacia? (despues de quitar) "+cola.isEmpty());
    }
}
