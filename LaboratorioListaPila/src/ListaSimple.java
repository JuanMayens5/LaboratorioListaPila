class ListaSimple<T> {
    private Nodo<T> cabeza;
    private int tamano = 0;

    public void agregarInicio(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamano++;
    }

    public void agregarFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> temp = cabeza;
            while (temp.siguiente != null) temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
        tamano++;
    }

    public T removerInicio() {
        if (cabeza == null) throw new RuntimeException("Lista vacía");
        T valor = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamano--;
        return valor;
    }

    public boolean buscarValor(T valor) {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            if (temp.dato.equals(valor)) return true;
            temp = temp.siguiente;
        }
        return false;
    }

    public int size() { return tamano; }

    public String imprimir() {
        if (cabeza == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> temp = cabeza;
        while (temp != null) {
            sb.append(temp.dato).append(temp.siguiente != null ? " -> " : "");
            temp = temp.siguiente;
        }
        return sb.append("]").toString();
    }
}