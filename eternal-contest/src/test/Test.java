package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long count = 0;

        for (long i = 1; i < 10; i++) {
          for(long j = i; j <= r; j = 10 * j + i) {
              if(j < l) {
                  continue;
              }
              count++;
          }
        }

        System.out.println(count);
    }

}
