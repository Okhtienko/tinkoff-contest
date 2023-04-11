package roulade;

import java.util.Scanner;

public class Roll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(cut(n));

    }

    static int cut(int n) {
        int x = 0;

        if ((n & n - 1) == 0) {
            x = -1;
        }

        while (n != 0) {
            n >>= 1;
            x++;
        }

        return x;
    }

}
