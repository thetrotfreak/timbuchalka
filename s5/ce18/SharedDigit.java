package s5.ce18;

public class SharedDigit {

    public static boolean hasSharedDigit(int p, int q) {

        if ((p < 10 || p > 99) || (q < 10 || q > 99))
            return false;

        int remP, remQ, qCopy = q;

        for (remP = p % 10; p != 0; remP = p % 10) {

            q = qCopy;

            for (remQ = q % 10; q != 0; remQ = q % 10) {

                if (remP == remQ)
                    return true;

                q = q / 10;
            }

            p = p / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }
}
