import java.util.*;

public class _387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] array = new int[123];
        for (char c : chars) {
            if (array[c] > 1) continue;
            array[c]++;
        }
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (array[c] == 1) {
                return i;
            }
        }
        return -1;
    }
}
