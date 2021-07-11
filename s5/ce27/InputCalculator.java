package s5.ce27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int avg = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            sum += number;
            count++;
        }
        avg = Math.round(sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scan.close();
    }
}
