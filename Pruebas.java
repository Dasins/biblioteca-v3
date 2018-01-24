import java.util.ArrayList;

public class Pruebas{
    ArrayList<String> coleccion;
    
    public Pruebas() {
        coleccion = new ArrayList<>();
    }
    
    public void addCadena() {
        coleccion.add("e");
        coleccion.add("b");
        coleccion.add("c");
        coleccion.add("a");
        coleccion.add("d");
        coleccion.add("h");
        coleccion.add("d");
        coleccion.add("d");
        coleccion.add("f");
        coleccion.add("h");
        coleccion.add("g");
        coleccion.add("a");
        coleccion.add("a");
    }
    
    public void letraMasAlta(){
        ArrayList<String> copiaColeccion = coleccion;
        String primerElemento = "zzzzzz";
        for(int i = 0; i < copiaColeccion.size(); i++) {
            String elementoActual = copiaColeccion.get(i);
            if(elementoActual.compareToIgnoreCase(primerElemento) < 0) {
                primerElemento = elementoActual;
            } 
        }
        copiaColeccion.remove(primerElemento);
        System.out.println(primerElemento);
    }
    
    public void ordenarAlfabeticamente() {
        ArrayList<String> copiaColeccion = coleccion;
        for(int j = 0; j < copiaColeccion.size(); j = 0) {
            String primerElemento = "zzzzzz";
            for(int i = 0; i < copiaColeccion.size(); i++) {
                String elementoActual = copiaColeccion.get(i);
                if(elementoActual.compareToIgnoreCase(primerElemento) < 0) {
                    primerElemento = elementoActual;
                } 
            }
            copiaColeccion.remove(primerElemento);
            System.out.println(primerElemento);
        }
    }
}
