
/**
 * Clase que se correponde a una carta de la baraja de poker
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Clase Carta
 */
public class Carta
{
    // Atributo que guarda el valor de la carta
    private int valor;
    // Atributo que guarda el nombre de la carta
    private String palo;
    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Devuelve una cadena con el nombre completo de la carta.
     */
    public String getNombre()
    {
        String nombre = valor + "";
        if (valor == 1) {
            nombre = "As";
        }
        else if (valor == 11) {
            nombre = "Sota";
        }
        else if (valor == 12) {
            nombre = "Reina";
        }
        else if (valor == 13) {
            nombre = "Rey";
        }
        String nombreCompleto = nombre + " de " + palo;
        return nombreCompleto;
    }
    
    /**
     * Devuelve e valor de la carta
     */
    public int getValor()
    {
        return valor;
    }
    
    /**
     * Devuleve el palo al que pertenece la carta
     */
    public String getPalo()
    {
        return palo;
    }
}
