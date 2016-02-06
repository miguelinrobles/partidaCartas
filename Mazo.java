import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * Esta clase equivale a un mazo de cartas de la baraja de poker
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Clase Mazo
 */
public class Mazo
{
    // Atributo que guarda todas la cartas de nuestro mazo
    private ArrayList<Carta> mazoDeCartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        ArrayList<String> palos = new ArrayList<>(Arrays.asList("picas","corazones","tréboles","diamantes"));
        mazoDeCartas = new ArrayList<>();
        
        for (String palo : palos) {
            int index = 1;
            while (index <= 13) {
                mazoDeCartas.add(new Carta(index, palo));
                index++;
            }
        }
    }

    /**
     * Método que baraja el mazo de cartas
     */
    public void barajar()
    {
        Collections.shuffle(mazoDeCartas);
    }

    /**
     * Devuelve la primera carta del mazo y la elimina del mazo.
     */
    public Carta tomarPrimera()
    {
        Carta primera = null;
        if (!mazoDeCartas.isEmpty()) {
            primera = mazoDeCartas.get(0);
            mazoDeCartas.remove(0);
        }
        return primera;
    }
    
    /**
     * Devuelve el número de cartas que quedan en el mazo.
     */
    public int cartasContieneMazo()
    {
        return mazoDeCartas.size();
    }
}
