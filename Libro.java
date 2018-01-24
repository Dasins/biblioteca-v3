
/**
 * Almacena los detalles de un libro
 * como el titulo, isbn, autor y numero de paginas.
 * 
 * Inicio: 16:15
 * Ultimo Commit: 16:20
 *
 * @author Dasins
 * @version 24/01/2018
 */
public class Libro {
   // El isbn 
   private int isbn;
   // Titulo del libro.
   private String titulo;
   // Autor o autores del libro.
   private String autor;
   // Numero de paginas del libro.
   private int numPags;
   
   /**
    * Constructor de objetos de la clase Libro.
    * @param isbn El numero isbn.
    * @param titulo El titulo del libro.
    * @param autor El autor del libro.
    * @param numPags El numero de paginas del libro.
    */
   public Libro(int isbn, String titulo, String autor, int numPags) {
       this.isbn = isbn;
       this.titulo = titulo;
       this.autor = autor;
       this.numPags = numPags;
   }
}
