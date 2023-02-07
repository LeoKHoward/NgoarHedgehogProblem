import static java.lang.Math.max;

public class Garden {

    // Number of rows in garden matrix
    private int M;

    // Number of columns in garden matrix
    private int N;

    // Create multidimensional array
    private final int[][] numberOfApplesInEachSquare;

    public Garden(int M, int N, int[][] numberOfApplesInEachSquare) {
        this.M = M;
        this.N = N;
        this.numberOfApplesInEachSquare = numberOfApplesInEachSquare;
    }

    public int maximumNumberOfApples() {

        // Get dimensions of garden (how many rows and columns)
        M = numberOfApplesInEachSquare[0].length;
        N = numberOfApplesInEachSquare.length;

        // Stores maximum number of apples in each square of garden
        // sum[i][j] from garden square (0,0) (top left square)
        int[][] sum = new int[M + 1][N + 1];

        // Iterate over each square of garden to get the maximum apples path
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {

                // Update the maximum path sum
                sum[i][j] = max(sum[i - 1][j], sum[i][j - 1]) + numberOfApplesInEachSquare[i - 1][j - 1];

            }
        }

        // Output maximum number of apples that can possibly be obtained
        System.out.println(sum[M][N]);

        // Return the maximum number of apples possible
        return sum[M][N];
    }
}
