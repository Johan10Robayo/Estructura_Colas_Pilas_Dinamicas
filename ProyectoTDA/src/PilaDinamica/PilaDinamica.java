package PilaDinamica;

public class PilaDinamica<T> {

    private Nodo<T> top;
    private int tam;

    public PilaDinamica() {
        top = null;
        this.tam = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return this.tam;
    }

    public void setTop(Nodo<T> top) {
        this.top = top;
    }

    public Nodo<T> getTop() {
        return top;
    }

    public int getTam() {
        return tam;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tam--;
            return elemento;
        }
    }

    public T push(T elemento) {
        Nodo<T> aux = new Nodo<T>(elemento, top);
        top = aux;
        this.tam++;
        return elemento;
    }

    public String toString() {
        if (isEmpty()) {
           return null;
        } else {
            String resultado = "";
            Nodo<T> aux = top;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            return resultado;}
            return null;
            
        }
    }
}
