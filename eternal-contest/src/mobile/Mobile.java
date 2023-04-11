package mobile;

import java.util.Scanner;

public class Mobile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(billing(a, b, c, d));

    }

    static int billing(final int a, final int b, final int c, final int d) {
        if (d <= b) {
            return a;
        }

        return a + (d - b) * c;
    }

}
