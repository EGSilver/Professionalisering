package org.example;

public class JavaDocExampleSeeAndLink {

    /**
     * Bereken het kwadraat van een getal met behulp van de Math-klasse.
     *
     * @param num Het getal waarvan het kwadraat moet worden berekend.
     * @return Het kwadraat van het opgegeven getal.
     */
    public int berekenKwadraatMetMath(int num) {
        return (int) Math.pow(num, 2);
    }

    /**
     * Bereken het kwadraat van een getal.
     *
     * @param num Het getal waarvan het kwadraat moet worden berekend.
     * @return Het kwadraat van het opgegeven getal.
     * @throws IllegalArgumentException als het getal negatief is.
     * @see <a href="https://example.com">Externe Documentatie</a>
     * @deprecated vervangen door {@link #berekenKwadraatMetMath}
     */
    public int berekenKwadraat(int num) throws IllegalArgumentException { // hoveren over functie om documentatie al te kunnen bekijken
        if (num < 0) {
            throw new IllegalArgumentException("Het getal mag niet negatief zijn.");
        }
        return num * num;
    }



}
