import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards; // Usaremos ArrayList para almacenar las cartas

    // Constructor
    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck();
    }

    // Método para inicializar el Deck con 52 cartas
    private void initializeDeck() {
        String[] suits = {"tréboles", "corazones", "picas", "diamantes"};
        String[] colors = {"negro", "rojo"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : suits) {
            for (String color : colors) {
                for (String value : values) {
                    cards.add(new Card(suit, color, value));
                }
            }
        }
    }

    // Método para mezclar el Deck
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // Método para mostrar y remover la primera carta del Deck
    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println("Carta mostrada: " + card.getSuit() + "," + card.getColor() + "," + card.getValue());
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    // Método para seleccionar una carta al azar del Deck
    public void pick() {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println("Carta seleccionada al azar: " + card.getSuit() + "," + card.getColor() + "," + card.getValue());
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    // Método para obtener una mano de cinco cartas del Deck
    public void hand() {
        if (cards.size() >= 5) {
            System.out.println("Mano de cinco cartas:");
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card.getSuit() + "," + card.getColor() + "," + card.getValue());
            }
            System.out.println("Quedan " + cards.size() + " cartas en deck");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Deck deck = new Deck();
        // Mezclar el mazo al inicio
        deck.shuffle();
        
        // Ejemplo: Mostrar la primera carta
        deck.head();
        
        // Ejemplo: Seleccionar una carta al azar
        deck.pick();
        
        // Ejemplo: Repartir una mano de cinco cartas
        deck.hand();
    }
}
