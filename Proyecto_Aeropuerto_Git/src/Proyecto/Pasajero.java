

package Proyecto;
/**
 * Clase pasajero del proyecto aeropuerto
 * @author Ruslan Tejerina
 * @version  1.0 Ruslan
 
 */

public class Pasajero {
    /**
     * Se definen los atributos privados de la clase Pasajero necessarios para registrar pasajeros
     */
    
    private String nombre;
    private String pasaporte;
    private String nacionalidad;
    
    /**
     * Constructor que nos permite inicializar el objeto y sirve para asegurarnos 
     * que los objetos siempre contengan valores válidos.
     * @param nombre
     * @param pasaporte
     * @param nacionalidad 
     */ 

    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }
    /**
     * Método getNombre 
     * @return - devuelve el nombre del pasajero
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * método getPassport 
     * @return - devuelve el pasaporte del viajero
     */

    public String getPasaporte() {
        return pasaporte;
    }
    /**
     * método getNacionalidad
     * @return - devuelve el pais de origen
     */

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
