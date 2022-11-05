import java.util.Arrays;

public class Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        long[] maxArray = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (var num : nums) {
            insert(maxArray, num);
        }
        System.out.println(Arrays.toString(maxArray));
        if (maxArray[2] == Long.MIN_VALUE) {
            return (int)maxArray[0];
        }
        return (int)maxArray[2];
    }

    private void insert(long[] maxArray, int num) {
        var i = 0;
        while (i < maxArray.length) {
            if (num == maxArray[i]) {
                return;
            } else if (num > maxArray[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i < maxArray.length) {
            if (maxArray.length - 1 - i >= 0) System.arraycopy(maxArray, i, maxArray, i + 1, maxArray.length - 1 - i);
            maxArray[i] = num;
        }
    }
}
