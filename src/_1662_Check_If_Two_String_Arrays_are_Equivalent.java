public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        int i = 0;
        int j = 0;
        do {
            if (i < word1.length) {
                w1.append(word1[i]);
                i++;
            }
            if (j < word2.length) {
                w2.append(word2[j]);
                j++;
            }
        } while (i < word1.length || j < word2.length);
        return w1.toString().equals(w2.toString());
    }
}
