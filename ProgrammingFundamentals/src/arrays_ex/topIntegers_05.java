package arrays_ex;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= numbersArray.length - 1; i++) {
            int currentElement = numbersArray[i];

            boolean isTop = false;
            for (int j = i + 1; j <= numbersArray.length - 1; j++) {
                int nextElement = numbersArray[j];

                if (currentElement > nextElement) {
                    isTop = true;
                }

            }
            if (isTop) {
                System.out.print(currentElement + " ");
            }
        }
    }
}
