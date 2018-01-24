
/**
 * Almacena los detalles de un libro
 * como el titulo, isbn, autor y numero de paginas.
 * 
 * Inicio: 16:33
 * Ultimo Commit: 16:35
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
   
   /**
    * @return Devuelve el isbn del libro.
    */
   public int getIsbn() {
       return isbn;
   }
   
   /**
    * @return Devuelve el titulo del libro.
    */
   public String getTitulo() {
       return titulo;
   }
   
   /**
    * @return Devuelve el autor/autores del libro.
    */
   public String getAutor() {
       return autor;
   }
   
   /**
    * @return Devuelve el numero de paginas del libro.
    */
   public int getNumPags() {
       return numPags;
   }
   
   /**
    * @return Devuelve toda la informacion del libro como cadena.
    */
   public String getInfo() {
       String info = "ISBN: " + isbn + " Titulo: " + titulo + " Autor/es: " +  autor + " Pags: " + numPags;;
       return info;
   }
   
   /**
    * Modifica el isbn del libro.
    * @param isbn El nuevo isbn.
   */
   public void setIsbn(int isbn) {
       this.isbn = isbn;
   }
   
   /**
    * Modifica el titulo del libro.
    * @param titulo El nuevo titulo.
   */
   public void setTitulo(String titulo) {
       this.titulo = titulo;
   }
   
   /**
    * Modifica el autor/autores del libro.
    * @param autor El nuevo autor o autores.
   */
   public void setAutor(String autor) {
       this.autor = autor;
   }
   
   /**
    * Modifica el numero de paginas del libro.
    * @param numPags El nuevo numero de paginas.
   */
   public void setNumPags(int numPags) {
       this.numPags = numPags;
   }
}
