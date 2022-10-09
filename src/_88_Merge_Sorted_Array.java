
public class _88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var size = nums1.length - 1;
        m--;
        n--;
        while (size >= 0) {
            if (n < 0) {
                nums1[size] = nums1[m];
                m--;
            } else if (m < 0) {
                nums1[size] = nums2[n];
                n--;
            } else if (nums1[m] > nums2[n]) {
                nums1[size] = nums1[m];
                m--;
            } else {
                nums1[size] = nums2[n];
                n--;
            }
            size--;
        }
    }
}
