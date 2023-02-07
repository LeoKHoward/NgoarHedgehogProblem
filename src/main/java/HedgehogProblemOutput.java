public class HedgehogProblemOutput {

    // Dummy test data that can be changed to set new parameters for rows/columns/apples
    public HedgehogProblemOutput() {

        // Create 2D garden matrix by setting number of rows and number of columns
        int M = 3;
        int N = 3;

        // Declare number of apples in each square of garden
        int[][] numberOfApplesInEachSquare = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        // Create object of Garden
        Garden newGarden = new Garden(M, N, numberOfApplesInEachSquare);

        // Run functionality in Garden class based on above rows/columns/apples parameters
        newGarden.maximumNumberOfApples();
    }
}
