import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (var num2 : nums2) {
            insertElementToArray(num2, m, nums1);
            m++;
        }
    }

    private void insertElementToArray(int num2, int m, int[] nums1) {
        var index = -1;
        for (var i = 0; i < m; i++) {
            if (num2 > nums1[i]) {
                continue;
            }
            index = i;
            break;
        }
        if (index == -1) {
            nums1[m] = num2;
        } else {
            for (var i = m; i > index; i--) {
                nums1[i] = nums1[i - 1];
            }
            nums1[index] = num2;
        }
    }
}
