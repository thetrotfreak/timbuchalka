package s5.ce16;

import java.math.BigInteger;
import java.util.Scanner;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(BigInteger number) {

        if (number.compareTo(BigInteger.ZERO) <= 0)
            return -1;

        String numInText = number.toString(10);

        int fd = Integer.parseInt(numInText, 0, 1, 10);
        int ld = Integer.parseInt(numInText, numInText.length() - 1, numInText.length(), 10);
        return fd + ld;
    }

    public static void main(String[] args) {

        BigInteger bi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Number?");
        bi = scan.nextBigInteger();
        scan.close();

        System.out.println(sumFirstAndLastDigit(bi));
    }

}