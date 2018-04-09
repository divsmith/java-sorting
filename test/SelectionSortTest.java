import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/8/18.
 */
class SelectionSortTest {

    @Test
    void test_sort_works()
    {
        int[] unsorted = {7, 9, 8, 2, 1, 3, 5, 4, 6};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assertions.assertEquals(sorted, SelectionSort.sort(unsorted));
    }
}