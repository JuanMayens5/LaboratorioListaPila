//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // --- PRUEBAS LISTA SIMPLE ---
    System.out.println("--- LISTA SIMPLE ---");
    ListaSimple<Integer> ls = new ListaSimple<>();
    ls.agregarInicio(10); ls.agregarInicio(5);
    System.out.println(ls.imprimir() + " | Size: " + ls.size());
    ls.agregarFinal(20);
    System.out.println(ls.imprimir());
    System.out.println("Buscar 10: " + ls.buscarValor(10));
    System.out.println("Remover: " + ls.removerInicio());
    System.out.println(ls.imprimir());

    // --- PRUEBAS LISTA DOBLE ---
    System.out.println("\n--- LISTA DOBLE ---");
    DobleLista<String> ld = new DobleLista<>();
    ld.agregarFinal("A"); ld.agregarFinal("B"); ld.agregarInicio("Z");
    System.out.println(ld.imprimir());
    System.out.println("Remover final: " + ld.removerFinal());
    System.out.println(ld.imprimir());

    // --- PRUEBAS PILA ---
    System.out.println("\n--- PILA ---");
    Pila<Integer> pila = new Pila<>();
    pila.push(1); pila.push(2); pila.push(3);
    System.out.println("Peek: " + pila.peek());
    System.out.println("Pop: " + pila.pop());
    System.out.println("IsEmpty: " + pila.isEmpty());
}
