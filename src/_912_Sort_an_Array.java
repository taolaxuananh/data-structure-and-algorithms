import java.util.PriorityQueue;

public class _912_Sort_an_Array {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        var key = nums[(l + r) / 2];

        var il = partition(nums, l, r, key);

        quickSort(nums, l, il - 1);
        quickSort(nums, il, r);
    }

    private int partition(int[] nums, int l, int r, int key) {
        while (l <= r) {
            while (nums[l] < key) {
                l++;
            }
            while (nums[r] > key) {
                r--;
            }
            if (l <= r) {
                var temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
        return l;
    }


    private int[] mergeSort(int[] nums, int l, int r) {
        if (l > r) {
            return new int[0];
        }
        if (l == r) {
            return new int[]{nums[l]};
        }
        int k = (l + r) / 2;
        return merge(mergeSort(nums, l, k), mergeSort(nums, k + 1, r));
    }

    private int[] merge(int[] a1, int[] a2) {
        var n = a1.length + a2.length;
        var result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public int[] sortArray3(int[] nums) {
        var pq = new PriorityQueue<Integer>();
        for (int a : nums) {
            pq.add(a);
        }
        var ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
