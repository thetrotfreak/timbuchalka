package s5.l75;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number:");

            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    max = number;
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Min = " + min + ", " + "Max = " + max);
    }

}