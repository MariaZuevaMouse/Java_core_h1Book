package java_core.syntax3.lotteryArray;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        int[][] odds = new int[NMAX +1][];
        for(int n = 0; n<=NMAX; n++){
            odds[n] = new int[n+1];
        }

        for(int i = 0; i<odds.length; i++){
            for(int j =0; j<odds[i].length; j++){
                int lotteryOdds = 1;
                for(int k = 1; k<=j; k++)
                    lotteryOdds = lotteryOdds*(i-k+1)/k;

                odds[i][j] = lotteryOdds;
            }
            for(int[] row : odds){
                for(int odd : row)
                    System.out.printf("%4d", odd);
                System.out.println();
            }
        }
    }
}
