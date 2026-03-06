class DobleLista<T> {
    private NodoDoble<T> cabeza, cola;
    private int tamano = 0;

    public void agregarInicio(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        tamano++;
    }

    public void agregarFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        tamano++;
    }

    public T removerFinal() {
        if (cola == null) throw new RuntimeException("Lista vacía");
        T valor = cola.dato;
        if (cabeza == cola) {
            cabeza = cola = null;
        } else {
            cola = cola.anterior;
            cola.siguiente = null;
        }
        tamano--;
        return valor;
    }

    public int size() { return tamano; }

    public String imprimir() {
        if (cabeza == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        NodoDoble<T> temp = cabeza;
        while (temp != null) {
            sb.append(temp.dato).append(temp.siguiente != null ? " <-> " : "");
            temp = temp.siguiente;
        }
        return sb.append("]").toString();
    }
}