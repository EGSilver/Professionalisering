package org.example;

/**
 * Dit is een voorbeeld klasse
 * om het gebruik van java doc uit te leggen
 */
public class JavaDocExample {

    /**
     * Lege constructor
     */
    public JavaDocExample() {
    }

    /**
     * Bereken het kwadraat van een getal.
     *
     * @param num Het getal waarvan het kwadraat moet worden berekend.
     * @return Het kwadraat van het opgegeven getal.
     * @throws IllegalArgumentException als het getal negatief is.
     */
    public int berekenKwadraat(int num) throws IllegalArgumentException { // hover
        if (num < 0) {
            throw new IllegalArgumentException("Het getal mag niet negatief zijn.");
        }
        return num * num;
    }

}





