public class _50_PowXN {
    public double myPow(double x, int n) {
        if (n == 0) {
            return  1;
        }
        var k = 0;
        if (n < 0) {
            k = n % 2 == 0 ? -(n / 2) : (-n - 1) / 2;
            x = 1/x;
        } else {
            k = n % 2 == 0 ? n/2 : (n - 1) / 2;
        }
        double t = myPow(x, k);
        return n % 2 == 0 ? t * t : x * t * t;
    }
}
