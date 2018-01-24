
/**
 * Almacena los detalles de un libro
 * como el titulo, isbn, autor y numero de paginas.
 * 
 * Inicio: 16:37
 * Ultimo Commit: 16:39
 *
 * @author Dasins
 * @version 24/01/2018
 */
public class Libro {
   // ID del libro. Clave primaria, autonumerica (no se puede modificar).
   private int id; 
   // El isbn 
   private String isbn;
   // Titulo del libro.
   private String titulo;
   // Autor o autores del libro.
   private String autor;
   // Ano publicacion.
   private int ano;
   // Numero de paginas del libro.
   private int numPags;
   
   /**
    * Constructor de objetos de la clase Libro.
    * @param isbn El numero isbn.
    * @param titulo El titulo del libro.
    * @param autor El autor del libro.
    * @param numPags El numero de paginas del libro.
    */
   public Libro(int id, String isbn, String titulo, String autor, int ano, int numPags) {
       this.id = id;
       this.isbn = isbn;
       this.titulo = titulo;
       this.autor = autor;
       this.ano = ano;
       this.numPags = numPags;
   }
   
   /**
    * @return Devuelve el isbn del libro.
    */
   public String getIsbn() {
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
    * @return Devuelve el anode publicacion del libro.
    */
   public int getAno() {
       return ano;
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
       String info = id + ".\t" + isbn + "\t" +  autor + "\t\t" + numPags + "\t" + titulo;
       return info;
   }
   
   /**
    * Modifica el isbn del libro.
    * @param isbn El nuevo isbn.
   */
   public void setIsbn(String isbn) {
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
    * Modifica el ano de publicacion del libro.
    * @param numPags El nuevo ano de publicacion.
   */
   public void setAno(int ano) {
       this.ano = ano;
   }
   
   /**
    * Modifica el numero de paginas del libro.
    * @param numPags El nuevo numero de paginas.
   */
   public void setNumPags(int numPags) {
       this.numPags = numPags;
   }
}
