package Tarea8;

public class Pila {

    // Clase estática interna que representa un nodo con el título de un libro.
    private static class Nodo {
        String tituloLibro;       
        Nodo siguiente;   

        Nodo(String tituloLibro) {
            this.tituloLibro = tituloLibro;
            this.siguiente = null;
        }
    }

    private Nodo tope; 

    // Constructor para inicializar una pila vacía.
    public Pila() {
        this.tope = null;
    }

    // Verifica si la pila de libros está vacía.
    // Retorna true si no hay libros, false en caso contrario.
    public boolean estaVacia() {
        return tope == null;
    }

    // Coloca un nuevo libro en la parte superior de la pila.
    // Recibe tituloLibro: Nombre del libro a apilar.
    public void push(String tituloLibro) {
        Nodo nuevo = new Nodo(tituloLibro);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    // Retira y devuelve el libro que está en la parte superior (tope) de la pila.
    // Retorna el título del libro retirado.
    // Lanza IllegalStateException si la pila está vacía.
    public String pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila de libros está vacía");
        }
        String valor = tope.tituloLibro;
        tope = tope.siguiente;
        return valor;
    }

    // Muestra el título del libro que está en el tope sin retirarlo.
    // Retorna el título del libro superior.
    // Lanza IllegalStateException si la pila está vacía.
    public String peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila de libros está vacía");
        }
        return tope.tituloLibro;
    }

    // Cuenta cuántos libros hay almacenados en la pila.
    // Retorna la cantidad total de libros.
    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Imprime todos los libros desde el tope hasta la base de la pila.
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La pila de libros está vacía.");
            return;
        }
        Nodo actual = tope;
        while (actual != null) {
            System.out.print("[" + actual.tituloLibro + "]");
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}