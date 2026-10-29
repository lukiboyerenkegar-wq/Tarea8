package Tarea8;

public class Cola {

    // Clase estática interna que representa un documento en la cola de impresión.
    private static class Nodo {
        String nombreDocumento; 
        Nodo siguiente;       

        Nodo(String nombreDocumento) {
            this.nombreDocumento = nombreDocumento;
            this.siguiente = null;
        }
    }

    private Nodo frente; 
    private Nodo fin;    

    // Constructor para inicializar una cola vacía.
    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    // Verifica si la cola de impresión está vacía.
    // Retorna true si no hay documentos en espera, false en caso contrario.
    public boolean estaVacia() {
        return frente == null;
    }

    // Añade un nuevo documento al final de la cola de impresión.
    // Recibe nombreDocumento: El nombre del archivo a imprimir.
    public void encolar(String nombreDocumento) {
        Nodo nuevo = new Nodo(nombreDocumento);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }
        fin.siguiente = nuevo;
        fin = nuevo;
    }

    // Envía a imprimir (saca) el documento que está al frente de la cola.
    // Retorna el nombre del documento impreso.
    // Lanza IllegalStateException si la cola está vacía.
    public String desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola de impresión está vacía");
        }
        String valor = frente.nombreDocumento;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; 
        }
        return valor;
    }

    // Consulta el nombre del documento que está al frente sin retirarlo.
    // Retorna el nombre del documento en el frente.
    // Lanza IllegalStateException si la cola está vacía.
    public String verFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola de impresión está vacía");
        }
        return frente.nombreDocumento;
    }

    // Cuenta el número total de documentos esperando en la cola.
    // Retorna la cantidad de documentos.
    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Imprime todos los documentos en la cola desde el frente hasta el final.
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La cola de impresión está vacía.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print("(" + actual.nombreDocumento + ")");
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}