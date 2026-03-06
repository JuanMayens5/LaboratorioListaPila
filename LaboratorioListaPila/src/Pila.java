class Pila<T> {
    private Nodo<T> tope;
    private int tamano = 0;

    public void push(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        T valor = tope.dato;
        tope = tope.siguiente;
        tamano--;
        return valor;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Pila vacía");
        return tope.dato;
    }

    public boolean isEmpty() { return tope == null; }
    public int size() { return tamano; }

    public String imprimir() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> temp = tope;
        while (temp != null) {
            sb.append(temp.dato).append(temp.siguiente != null ? ", " : "");
            temp = temp.siguiente;
        }
        return sb.append("] <- Tope").toString();
    }
}