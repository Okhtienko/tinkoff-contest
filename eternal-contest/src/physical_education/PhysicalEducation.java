package physical_education;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhysicalEducation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        final List<Integer> evenElements = findIndexesOfEvenElements(array);
        final List<Integer> oddElements = findIndexesOfOddElements(array);

        if ((evenElements.size() == 1) && (oddElements.size() == 1)) {
            System.out.println(evenElements.get(0) + " " + oddElements.get(0));
        } else if ((evenElements.size() == 0) && (oddElements.size() == 0)) {
            System.out.print(n < 3 ? "-1 -1" : "1 3");
        } else {
            System.out.println("-1 -1");
        }

    }

    static List<Integer> findIndexesOfEvenElements(final int[] array) {
        List<Integer> evenElements = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 == 0) {
                evenElements.add(i + 1);
            }
        }
        return evenElements;
    }

    static List<Integer> findIndexesOfOddElements(final int[] array) {
        List<Integer> oddElements = new ArrayList<>();
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] % 2 == 1) {
                oddElements.add(i + 1);
            }
        }
        return oddElements;
    }

}
