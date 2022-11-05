public class _1694_Reformat_Phone_Number {
    public String reformatNumber(String number) {
        number = number.replaceAll("[- ]", "");
        StringBuilder result = new StringBuilder();
        var n = number.length();
        while (n > 0) {
            if (n == 2 || n == 3) {
                result.append(number);
                n = 0;
            } else if (number.length() == 4) {
                result.append(number, 0, 2).append("-").append(number.substring(2));
                n = 0;
            } else {
                result.append(number, 0, 3).append("-");
                number = number.substring(3);
                n-=3;
            }
        }
        return result.toString();
    }

    public String reformatNumber2(String number) {
        number = number.replaceAll("[- ]", "");
        if (number.length() < 2 || number.length() == 3) {
            return number;
        }
        if (number.length() == 4) {
            return number.substring(0,2) + "-" + number.substring(2);
        }
        return number.substring(0,3) + "-" + reformatNumber2(number.substring(3));
    }
}
