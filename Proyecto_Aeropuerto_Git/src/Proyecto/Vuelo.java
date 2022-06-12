
package Proyecto;
/**
 * Clase Vuelo del proyecto aeropuerto
 * @author Ruslan Tejerina 
 * @version 1.0 Ruslan
 */

public class Vuelo {
    /**
     * Atributos privados de la clase Vuelo
     * los atributos son: id, origen, destino, precio billete, numMaxpasajeros y numActualPasajeros
     * atributos necesarios para adquirir un billete de vuelo.
     * Un array para guardar listado de pasajeros
     */
    
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    
    private Pasajero listaPasajeros[]; 
    
    /**
     * Constructor para inicializar el objeto y asegurar que los valores de los objetos sean válidos
     * @param identificador
     * @param ciudadOrigen
     * @param ciudadDestino
     * @param precio
     * @param numMaxPasajeros 
     */
    
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
    
        this.numActualPasajeros=0; //Al principio no tenemos pasajeros como es lógico.
        this.listaPasajeros=new Pasajero[numMaxPasajeros];
    }
    /**
     * Método para insertar o pedir un nuevo pasajero en el vuelo
     * @param pasajero - permite insertar el objeto pasajero en nuestro array listaPasajeros
     */
    
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros]= pasajero; //Usamos como iterador el numActualPasajeros
        numActualPasajeros++; //Incrementamos los pasajeros cada vez que insertamos uno nuevo.
    }
    /**
     * Método id del pasajero
     * @return - devuelve el identificador del pasajero
     */

    public String getIdentificador() {
        return identificador;
    }
    /**
     * Método ciudad origen
     * @return - devuelve la ciudad de salida del pasajero
     */

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    /**
     * Método ciudad destino
     * @return - devuelve la ciudad de llegada del pasajero
     */

    public String getCiudadDestino() {
        return ciudadDestino;
    }
    /**
     * Método de coste vuelo
     * @return - devuelve el precio del vuelo
     */

    public double getPrecio() {
        return precio;
    }
    /**
     * Método del num. max. de pasajeros de un vuelo
     * @return - devuelve el num. max de plazas de un vuelo
     */

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }
    /**
     * Método que indica el num. actual de pasajeros
     * @return - devuelve el num. de pasajeros hasta el momento
     */
    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    //Queremos que nos retorne una variable de tipo Pasajero
    /**
     * Método devuelve el objeto pasajero según el num de la posición del indice del array.
     * @param i num del indice del array listaPasajeros, indica el num del pasajero que queremos mostrar sus datos
     * @return - muestra los datos del pasajero según el indice que indique el usuario de nuestro array listaPasajeros
     */
    public Pasajero getPasajero(int i){
        return listaPasajeros[i]; //Mostrar un pasajero según el num. del indice del array.
    }
    //Falta por comentar este método get
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado=false;
        int i=0;
        Pasajero pass=null; //Comienza con null para ver después si hemos encontrado algo. 
        
        while((encontrado==false)&&(i<listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){ //Si el pasaporte es igual a algun pasaporte de la listaPasajeros entonces:
                
                encontrado=true;
                pass = listaPasajeros[i];
            }
             i++;
        }
        return pass;
    }   
    
}
