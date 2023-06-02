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

    /**
     * Combineert drie string tot een geheel
     * @param str1 de eerste string
     * @param str2 de tweede string
     * @param str3 de derde string
     * @return combinatie van de 3 opgegeven strings
     * @throws IllegalArgumentException wanneer één van de opgegeven strings null is
     */
    public String combineerString(String str1, String str2, String str3) throws IllegalArgumentException {
        if (str1 == null || str2 == null || str3 == null) {
            throw new IllegalArgumentException("Geen van de opgegeven strings mag null zijn");
        }
        return str1 + str2 + str3;
    }
}





