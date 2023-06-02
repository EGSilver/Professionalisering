public class Test {

    /**
     * Combineer drie strings tot een geheel.
     *
     * @param str1 De eerste string.
     * @param str2 De tweede string.
     * @param str3 De derde string.
     * @return Een nieuwe string die de drie gegeven strings combineert.
     * @throws IllegalArgumentException als een van de gegeven strings null is.
     */
    public String combineerStrings(String str1, String str2, String str3) throws IllegalArgumentException {
        if (str1 == null || str2 == null || str3 == null) {
            throw new IllegalArgumentException("Geen van de gegeven strings mag null zijn.");
        }
        return str1 + str2 + str3;
    }

    /**
     * Bereken het kwadraat van een getal.
     *
     * @param num Het getal waarvan het kwadraat moet worden berekend.
     * @return Het kwadraat van het opgegeven getal.
     * @throws IllegalArgumentException als het getal negatief is.
     * @see <a href="https://example.com">Externe Documentatie</a>
     * @deprecated vervangen door {@link #berekenKwadraatNieuw}
     */
    public int berekenKwadraat(int num) throws IllegalArgumentException { // hoveren over functie om documentatie al te kunnen bekijken
        if (num < 0) {
            throw new IllegalArgumentException("Het getal mag niet negatief zijn.");
        }
        return num * num;
    }

    /**
     * Bereken het kwadraat van een getal met behulp van de Math-klasse.
     *
     * @param num Het getal waarvan het kwadraat moet worden berekend.
     * @return Het kwadraat van het opgegeven getal.
     */
    public int berekenKwadraatMath(int num) {
        return (int) Math.pow(num, 2);
    }

}
