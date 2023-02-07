import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GardenTest {

    private final int M_ROWS = 3;
    private final int N_COLUMNS = 3;

    @Test
    public void testObtainMaximumNumberOfApples() {

        // Happy path with valid number of rows/columns for garden size
        // Maximum number of apples that can be obtained is 12

        // GIVEN
        int[][] testNumberOfApplesInEachSquare = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        // WHEN
        Garden testGarden = new Garden(M_ROWS, N_COLUMNS, testNumberOfApplesInEachSquare);
        int maximumNumberOfApples = testGarden.maximumNumberOfApples();

        // THEN
        assertEquals(maximumNumberOfApples, 12);
    }

    @Test
    public void testObtainMaximumNumberOfApplesWhenNumberOfApplesIsReversed() {

        // Happy path with valid number of rows/columns for garden size
        // Number of apples in multidimensional array is reversed
        // Maximum number of apples that can be obtained is still 12

        // GIVEN
        int[][] testNumberOfApplesInEachSquare = {
                {3, 2, 1},
                {3, 2, 1},
                {3, 2, 1}
        };

        // WHEN
        Garden testGarden = new Garden(M_ROWS, N_COLUMNS, testNumberOfApplesInEachSquare);
        int maximumNumberOfApples = testGarden.maximumNumberOfApples();

        // THEN
        assertEquals(maximumNumberOfApples, 12);
    }

    @Test
    public void testThrowsIndexOutOfBoundsExceptionWhenMoreRowsAreFoundThanExpected() {

        // Multidimensional array of garden has more rows than expected (3)
        // Row count set to fixed variable of M_ROWS which is 3 but there are 4 rows in array
        // IndexOutOfBoundsException thrown with message stating expected number of rows

        // GIVEN
        int[][] testNumberOfApplesInEachSquare = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        // WHEN
        Garden testGarden = new Garden(M_ROWS, N_COLUMNS, testNumberOfApplesInEachSquare);
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class,
                testGarden::maximumNumberOfApples);

        // THEN
        Assertions.assertEquals("Index 3 out of bounds for length 3", thrown.getMessage());
    }

    @Test
    public void testThrowsIndexOutOfBoundsExceptionWhenMoreColumnsAreFoundThanExpected() {

        // Multidimensional array of garden has more columns than expected (3)
        // Column count set to fixed variable of N_COLUMNS which is 3 but there are 4 columns in array
        // IndexOutOfBoundsException thrown with message stating expected number of columns

        // GIVEN
        int[][] testNumberOfApplesInEachSquare = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        // WHEN
        Garden testGarden = new Garden(M_ROWS, N_COLUMNS, testNumberOfApplesInEachSquare);
        IndexOutOfBoundsException thrown = Assertions.assertThrows(IndexOutOfBoundsException.class,
                testGarden::maximumNumberOfApples);

        // THEN
        Assertions.assertEquals("Index 3 out of bounds for length 3", thrown.getMessage());
    }
}
