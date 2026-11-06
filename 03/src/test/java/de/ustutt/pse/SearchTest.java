package de.ustutt.pse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import de.ustutt.pse.util.TestScore;
import de.ustutt.pse.util.TestScoreListener;

import static de.ustutt.pse.Searching.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestScoreListener.class)
@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
public class SearchTest {

    @TestScore(1)
    @Test
    public void binarySearchSome() {
        int[] array = {0,1,5,10,25,91,100};
        int idx = binarySearch(array, 0);
        assertEquals(0, idx, "return index is incorrect");

        idx = binarySearch(array, 1);
        assertEquals(1, idx, "return index is incorrect");

        idx = binarySearch(array, 5);
        assertEquals(2, idx, "return index is incorrect");

        idx = binarySearch(array, 10);
        assertEquals(3, idx, "return index is incorrect");

        idx = binarySearch(array, 25);
        assertEquals(4, idx, "return index is incorrect");

        idx = binarySearch(array, 91);
        assertEquals(5, idx, "return index is incorrect");

        idx = binarySearch(array, 100);
        assertEquals(6, idx, "return index is incorrect");
    }

    @TestScore(1)
    @Test
    public void binarySearchNone() {
        int[] array = {0,1,5,10,25,91,100};

        int idx = binarySearch(array, 2);
        assertEquals(-1, idx, "return index is incorrect");

        idx = binarySearch(array, -1);
        assertEquals(-1, idx, "return index is incorrect");

        idx = binarySearch(array, 200);
        assertEquals(-1, idx, "return index is incorrect");
    }

    @TestScore(1)
    @Test
    public void binarySearchEmpty() {
        int[] array = {};
        int idx = binarySearch(array, 0);
        assertEquals(-1, idx, "return index is incorrect");
    }

    @TestScore(1)
    @Test
    public void naiveSearchSome() {
        int[] array = {0,1,5,10,25,91,100};

        for (int i = 0; i < array.length; i++) {
            int idx = naiveSearch(array, array[i]);
            assertEquals(i, idx, "return index is incorrect");
        }
    }

    @TestScore(1)
    @Test
    public void naiveSearchNone() {
        int[] array = {0,1,5,10,25,91,100};

        int idx = naiveSearch(array, 2);
        assertEquals(-1, idx, "return index is incorrect");

        idx = naiveSearch(array, 7);
        assertEquals(-1, idx, "return index is incorrect");

        idx = naiveSearch(array, -1);
        assertEquals(-1, idx, "return index is incorrect");

        idx = naiveSearch(array, 200);
        assertEquals(-1, idx, "return index is incorrect");

        int[] empty = {};
        idx = naiveSearch(empty, 0);
        assertEquals(-1, idx, "return index is incorrect");
    }



}

