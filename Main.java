package Tarea8;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE PILA (Libros Apilados) ===");
        Pila pilaLibros = new Pila();
        System.out.println("¿Pila vacía? " + pilaLibros.estaVacia()); 

        pilaLibros.push("Matemáticas");
        pilaLibros.push("Física");
        pilaLibros.push("Programación Java");

        System.out.print("Libros apilados: ");
        pilaLibros.imprimir(); 

        System.out.println("Libro en el tope (peek): " + pilaLibros.peek()); 
        System.out.println("Retirar libro superior (pop): " + pilaLibros.pop()); 

        System.out.print("Pila tras retirar el libro: ");
        pilaLibros.imprimir(); 
        System.out.println("Cantidad de libros restantes: " + pilaLibros.tamaño()); 

        System.out.println("\n=== PRUEBAS DE COLA (Cola de Impresión) ===");
        Cola colaImpresion = new Cola();
        System.out.println("¿Cola vacía? " + colaImpresion.estaVacia()); 

        colaImpresion.encolar("Contrato.pdf");
        colaImpresion.encolar("Reporte.docx");
        colaImpresion.encolar("Factura.pdf");

        System.out.print("Documentos en cola: ");
        colaImpresion.imprimir(); 

        System.out.println("Siguiente a imprimir (verFrente): " + colaImpresion.verFrente()); 
        System.out.println("Imprimiendo (desencolar): " + colaImpresion.desencolar()); 

        System.out.print("Cola tras imprimir documento: ");
        colaImpresion.imprimir(); 
        System.out.println("Documentos restantes en cola: " + colaImpresion.tamaño()); 
    }
}