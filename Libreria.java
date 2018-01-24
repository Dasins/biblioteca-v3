import java.util.ArrayList;

/**
 * Almacena la informacion de una coleccion de libros
 *
 * Inicio: 16:47
 * Ultimo commit:16:53
 *
 * @author Dasins
 * @version 24/01/2018
 */
public class Libreria {
    // Coleccion de libros
    private ArrayList<Libro> libros;
    // Identificador unico de cada libro.
    int id;
    
    /**
     * Constructor de objetos de la clase Libreria.
     */
    public Libreria() {
        libros = new ArrayList<>();
        id = 0;
    }
    
    /**
     * Anade un libro a la coleccion. 
     * Cada nuevo libro lleva un id distinto y consecutivo al anterior.
     * @param isbn El isbn.
     * @param titulo El titulo del libro.
     * @param autor El autor/autores del libro.
     * @param numPags El numero de paginas del libro.
     */
    public void addLibro(int isbn, String titulo, String autor, int numPags) {
        libros.add(new Libro(id, isbn, titulo, autor, numPags));
        id++;
    }
}
