import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var mergeSortedArray = new _88_Merge_Sorted_Array();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        var m = 3;
        var n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
