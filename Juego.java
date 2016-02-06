import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase Juego para nuestra partida de cartas
 *
 * @author (your name) 
 * @version (a version number or a date)
 * Clase Juego
 */
public class Juego
{
    // Atributo que guarda los jugadores del juego
    private ArrayList<Jugador> jugadores;
    // Atributo donde guardamos el mazo de cartas
    private Mazo mazoDeCartas;
    
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numJugadores)
    {
        mazoDeCartas = new Mazo();
        jugadores = new ArrayList<>();
        if (numJugadores < 2 || numJugadores > 8) {
            numJugadores = 4;
        }
        int index = 1;
        while (index <= numJugadores) {
            jugadores.add(new Jugador(index));
            index++;
        }
    }

    /**
     * Reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas, es decir, 
     * barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del mazo.
     */
    public void repartir()
    { 
        mazoDeCartas.barajar(); 
        int numeroJugadores = jugadores.size();
        while (mazoDeCartas.cartasContieneMazo() >= numeroJugadores) {
            int index = 0;
            while (index < numeroJugadores) {
                jugadores.get(index).recibirCarta(mazoDeCartas.tomarPrimera());
                index++;
            }
        }
    }

    /**
     * Muestra por pantalla el id de cada jugador junto con la cartas que tiene en la mano
     */
    public void mostrarCartasJugadores()
    {
        for (Jugador jugador : jugadores) {
            System.out.println("Id: " + jugador.getId());
            System.out.println("Cartas: " + jugador.cartasQueTieneEnLaMano());
        }
    }
}
