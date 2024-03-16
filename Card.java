public class Card {
    private String suit; // Palo: tréboles, corazones, picas o diamantes.
    private String color; // Color: rojo, negro.
    private String value; // Valor: 2 al 10, A, J, Q o K.

    // Constructor
    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }
}
