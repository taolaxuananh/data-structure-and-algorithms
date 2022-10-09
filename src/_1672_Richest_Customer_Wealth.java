public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        var totalMoney = 0;
        for (var account : accounts) {
            var currentMoney = 0;
            for (var money : account) {
                currentMoney += money;
            }
            if (currentMoney > totalMoney) totalMoney = currentMoney;
        }
        return totalMoney;
    }
}
