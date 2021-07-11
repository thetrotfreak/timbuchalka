package s5.ce23;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(1001);
    }

    public static int getReverse(int number) {

        int lastDigit;
        int reverse = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse;
    }

    public static int countOfDigits(int number) {

        if (number < 0)
            return -1;

        if (number == 0)
            return 1;

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0)
            System.out.println("Invalid Value");

        if (number == 0)
            System.out.println("Zero");

        int reverse = getReverse(number);
        int digitsInNumber = countOfDigits(number);
        int digitsInReverse = countOfDigits(reverse);
        int digit;
        /*
         * n:1233 r:3321 n:1230, l:4 r:321, l:3 n:100, r=1, d=2
         */

        while (reverse != 0) {

            digit = reverse % 10;

            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            reverse /= 10;
        }

        /*
         * catches the case when arguemnts to numberToWords() has zeroes in the end in
         * other words, digits in number != digits in its reverse eg: number = 100,
         * reverse = 1 therefore, digits(100) != digits(reverse) => 3 != 1 =>
         * zeroes:3-1=2
         */
        while (digitsInReverse < digitsInNumber) {
            System.out.print("Zero ");
            digitsInReverse++;
        }

    }
}