package Complementaries.SecondLevel;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Crear una lista que contenga como elementos
 * la numeración de cartas de una baraja francesa
 * (solo los valores, no figuras). Se deberá cargar
 * el ArrayList (en orden), imprimir, imprimir en
 * orden inverso (reverse), desordenar (mezclar) el
 * arrayList y volver a imprimir.
 */
public class Cards {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cards.add("Carta " + (i + 1));
        }

        System.out.println("Orden normal");
        for (String card : cards) {
            System.out.println(card);
        }

        Collections.reverse(cards);
        System.out.println("Orden inverso");
        for (String card : cards) {
            System.out.println(card);
        }

        Collections.shuffle(cards);
        System.out.println("Orden aleatorio");
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
