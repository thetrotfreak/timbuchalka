package s5.ce24;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int weightedSum = (5 * bigCount) + smallCount;

        if (weightedSum == goal)
            return true;

        if (weightedSum < goal)
            return false;

        /*
         * express goal = (5 * big) + small => g = 5b + s which is basically normal
         * division
         */

        for (int big = bigCount; big >= 0; big--) {
            /*
             * check if we can put goal Kilos of flour or less in big bags integrally/fully
             * <= makes sure that big bags, if used, are being used fully, because if we
             * subtract a multiple of 5 from goal, then that means we're fully using that
             * many number of big bags
             */
            if ((5 * big) <= goal) {

                goal = goal - (5 * big);

                if (smallCount >= goal)
                    return true;
            }
        }
        return false;
    }
}
