public class _704_Binary_Search {
    public int search(int[] nums, int target) {
        var iLeft = 0;
        var iRight = nums.length - 1;
        while (iLeft <= iRight) {
            var iMid = (iLeft + iRight) / 2;
            if (nums[iMid] == target) {
                return iMid;
            } else if (target > nums[iMid]) {
                iLeft = iMid + 1;
            } else {
                iRight = iMid - 1;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        var iLeft = 0;
        var iRight = nums.length - 1;
        return binarySearch(nums, iLeft, iRight, target);
    }

    private int binarySearch(int[] nums, int iLeft, int iRight, int target) {
        if (iLeft > iRight) {
            return -1;
        }
        var iMid = (iLeft + iRight) / 2;
        if (nums[iMid] == target) {
            return iMid;
        } else if (target > nums[iMid]) {
            return binarySearch(nums, iMid + 1, iRight, target);
        } else {
            return binarySearch(nums, iLeft, iMid - 1, target);
        }
    }
}
