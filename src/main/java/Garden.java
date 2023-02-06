import static java.lang.Math.max;

public class Garden {

    private int m;
    private int n;

    // Create multi-dimensional array
    private final int[][] garden;

    public Garden(int m, int n, int[][] garden) {
        this.m = m;
        this.n = n;
        this.garden = garden;
    }

    public int maximumNumberOfApples() {

        // Work out dimensions of garden (how many rows and columns)
        m = garden[0].length;
        n = garden.length;

        // Stores maximum number of apples in each square of garden
        // Sum of i + j from garden square sum [0,0] (top left square)
        int[][] sum = new int[m + 1][n + 1];

        // Iterate over each square of garden to get the maximum apples path
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // Update the maximum path sum
                sum[i][j] = max(sum[i - 1][j], sum[i][j - 1]) + garden[i - 1][j - 1];

            }
        }

        // Return the maximum number of apples possible
        return sum[m][n];
    }
}
