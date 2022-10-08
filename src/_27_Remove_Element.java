import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (var j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
