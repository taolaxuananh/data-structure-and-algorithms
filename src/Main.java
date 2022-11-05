import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        extracted();
    }
    private static void extracted() {
        final Scanner NUMBER = new Scanner(System.in);
        int[] a = getInts(NUMBER);
        sum(a);
    }
    private static int[] getInts(final Scanner NUMBER) {
        var n = NUMBER.nextInt();
        int[] a = new int[n];
        for (var i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }
    private static void sum(int[] a) {
        print(a, 0, -1);
    }
    private static void print(int[] a, int n, int i) {
        if (n == a.length || n < 0) {
            return;
        }
        i++;
        String result = getFormat(a, n, i);
        if (i == 10) {
            i = 0;
        }
        System.out.print(result);
        print(a, n + 1, i);
    }
    private static String getFormat(int[] a, int n, int i) {
        return String.format(" %d %s%s", a[n], n == a.length - 1 ? "= " + sum(a, a.length - 1) : "+", i < 10 ? "" : "\n");
    }
    private static int sum(int[] a, int index) {
        if (index < 0) {
            return 0;
        }
        return a[index] += sum(a, index - 1);
    }
}
