import java.util.ArrayList;
/**
 * Clase Jugador para nuestra partida de cartas
 */
public class Jugador
{
    // Atributo que almacena el identificador del jugador
    private int id;
    // Atributo que almacena las cartas que tiene el jugador en su poder
    private ArrayList<Carta> cartas;
    
    /**
     * Constructor de la clase Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartas = new ArrayList<>();
    }

    /**
     * Este método devuelve el identificador del jugador
     */
    public int getId()
    {
        return id;
    }

    /**
     * Método que agrega la carta a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);
    }

    /**
     * Este método devuelve una colección de cadenas con los nombres de las cartas
     */
    public ArrayList<String> cartasQueTieneEnLaMano()
    {
        ArrayList<String> cartasTiene = new ArrayList<>();
        for (Carta carta : cartas) {
            cartasTiene.add(carta.getNombre());
        }
        return cartasTiene;
    }
}
