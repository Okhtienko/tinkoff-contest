package paper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        List<Long> values = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            int wight = 1;

            while (array[i] > 0) {
                int digit = array[i] % 10;
                long gain = (long) (9 - digit) * wight;
                values.add(gain);
                wight *= 10;
                array[i] /= 10;
            }
        }

        long afterSum = values.stream().sorted(Comparator.reverseOrder()).limit(k).reduce(0L, Long::sum);

        System.out.println(afterSum);

    }

}
