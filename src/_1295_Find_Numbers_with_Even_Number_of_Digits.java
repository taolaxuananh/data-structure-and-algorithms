public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        var mount = 0;
        for(var num : nums){
            if (String.valueOf(num).length() % 2 == 0) {
                mount++;
            }
        }
        return mount;
    }
}
