package elevator;

import java.util.Arrays;
import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] floors = new int[n];

        for (int i = 0; i < floors.length; i++) {
            floors[i] = scanner.nextInt();
        }

        int i = scanner.nextInt();
        int x = floors[i-1];

        int max = Arrays.stream(floors).max().getAsInt();
        int min = Arrays.stream(floors).min().getAsInt();
        int div = max - min;

        int maxX = max - t;
        int minX = min - t;

        int toUp = div + max - x;
        int toDown = div + x - min;

        if (minX >= x || maxX <= x) {
            System.out.println(div);
        } else {
            System.out.println(Math.min(toDown, toUp));
        }

    }
}
