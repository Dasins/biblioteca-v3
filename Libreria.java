import java.util.ArrayList;

/**
 * Almacena la informacion de una coleccion de libros
 *
 * Inicio: 17:03
 * Ultimo commit: 17:11
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
    public void addLibro(String isbn, String titulo, String autor, int ano, int numPags) {
        libros.add(new Libro(id, isbn, titulo, autor, ano, numPags));
        id++;
    }
    
    /**
     * Muestra en la terminal de texto los datos de todos los libros.
     * Si no hay libros, no hace nada.
     */
    public void mostrarTodos() {
        if(libros.size() > 0){
            System.out.println("ID\tISBN\t\tAutor/es\t\tPags\tTitulo");
            for(Libro libro : libros){
                System.out.println(libro.getInfo());
            }
        }
    }
    
    /**
     * Metodo temporal para testing. Anade libros a la coleccion.
     */
    public void test() {
        addLibro("9788431615345","El Conde Lucanor","Don Juan Manuel", 2014, 208);
        addLibro("9788431635176","Zalacain el Aventurero","Pio Baroja", 2014, 272);
        addLibro("9788441421745","La Dama del Alba","Alex Casona", 2006, 144);
        addLibro("9788441421745","La Dama del Alba","Alex Casona", 2006, 144);
        addLibro("9788441421745","La Dama del Alba","Alex Casona", 2006, 144);
        addLibro("9788466716802","Flor de Leyendas","Alex Casona", 2004, 224);
        addLibro("9788441421523","La Barca Sin Pescador","Alex Casona", 2009, 104);
        addLibro("9788437605227","El Arbol de la Ciencia","Pio Baroja", 2004, 304);
        addLibro("9788401019180","Las Brumas del Miedo","Rafael Abalos", 2017, 480);
        addLibro("9788401019180","Las Brumas del Miedo","Rafael Abalos", 2017, 480);
        addLibro("9788401019180","Las Brumas del Miedo","Rafael Abalos", 2017, 480);
        addLibro("9788401019180","Las Brumas del Miedo","Rafael Abalos", 2017, 480);
        addLibro("9788401019180","Las Brumas del Miedo","Rafael Abalos", 2017, 480);
    }
}
