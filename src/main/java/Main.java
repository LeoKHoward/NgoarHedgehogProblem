public class Main {
    public static void main(String[] args) {

        // Declare number of apples in each square of garden
        int[][] garden = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        // Create garden size
        int m = 3;
        int n = 3;

        // Create object of Garden
        Garden testGarden = new Garden(m, n, garden);

        // Output maximum number of apples that can possibly be obtained
        System.out.println(testGarden.maximumNumberOfApples());

    }
}
