package Proyecto;

/**
 *
 * @author Ruslan
 */
public class Compania {

    private String nombre;
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo = 0;

    //Constructor inicializamos el nombre
    public Compania(String nombre) {
        this.nombre = nombre;
    }

    //Segundo constructor, inicializamos el nombre y la lista vuelos que el usuario nos va pasar
    public Compania(String nombre, Vuelo v[]) { //Array de los vuelos
        this.nombre = nombre;
        listaVuelos = v; //los vuelos los guardo en mi array listaVuelos
        numVuelo = v.length; //Nos indica la dimensión, es decir cuantos vuelos hay
    }

    //Método para insertar un vuelo, solo uno
    public void insertarVuelo(Vuelo vuelo) {
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    //Obtener nombre y numero de vuelos con Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    //Dependiendo del iterador que el usuario introduzca por parametro le devuelvo dicho vuelo   
    public Vuelo getVuelo(int i) {
        return listaVuelos[i];
    }

    //Sobrecarga de métodos 
    public Vuelo getVuelo(String id) {
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null; //Inicializamos en null
        //Busqueda del vuelo
        while ((!encontrado) && (i < listaVuelos.length)) { //Mientras no lo hemos encontrado y ademas el iterador es menor a la cantidad en la listaVuelos
            if (id.equals(listaVuelos[i].getIdentificador())) { //Comprobar si existe el identificador que el usuario ha introducido.
                encontrado = true;
                v = listaVuelos[i]; //Guardamos el vuelo si se ha encontrado, para despues mostrar en otra clase los datos del vuelo.
            }
            i++;
        }
        return v;
    }
}
