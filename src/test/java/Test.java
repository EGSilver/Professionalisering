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
}
