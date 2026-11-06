package de.ustutt.pse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import de.ustutt.pse.util.TestScore;
import de.ustutt.pse.util.TestScoreListener;

import java.util.Arrays;

import static de.ustutt.pse.InsertSorted.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestScoreListener.class)
@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
public class InsertSortedTest {


    @TestScore(2)
    @Test
    public void resizeAtMiddle() {
        int[] array = {0,2,5,10};

        var out = resizeAt(array, 1);
        assertEquals(0, out[0]);
        assertEquals(0, out[1]);
        assertEquals(2, out[2]);
        assertEquals(5, out[3]);
        assertEquals(10, out[4]);


        out = resizeAt(array, 2);
        assertEquals(0, out[0]);
        assertEquals(2, out[1]);
        assertEquals(0, out[2]);
        assertEquals(5, out[3]);
        assertEquals(10, out[4]);
    }

    @TestScore(2)
    @Test
    public void resizeAtEnd() {
        int[] array = {0,2,5,10};

        var out = resizeAt(array, 0);
        assertEquals(0, out[0]);
        assertEquals(0, out[1]);
        assertEquals(2, out[2]);
        assertEquals(5, out[3]);
        assertEquals(10, out[4]);


        out = resizeAt(array, 4);
        assertEquals(0, out[0]);
        assertEquals(2, out[1]);
        assertEquals(5, out[2]);
        assertEquals(10, out[3]);
        assertEquals(0, out[4]);
    }

    @TestScore(1)
    @Test
    public void resizeAtEmpty() {
        int[] array = {};

        var out = resizeAt(array, 0);
        assertEquals(0, out[0]);
    }



    @TestScore(2)
    @Test
    public void indexOfMiddle() {
        int[] array = {0,2,5,10,25,91,100};
        int idx = indexOf(array, 1);
        assertEquals(1, idx, "incorrect insert index");

        idx = indexOf(array, 3);
        assertEquals(2, idx, "incorrect insert index");

        idx = indexOf(array, 99);
        assertEquals(6, idx, "incorrect insert index");

        idx = indexOf(array, 91);
        // we do not specify where to insert a value if the value already exists in the array
        assertTrue(idx == 5 || idx == 6, "incorrect insert index");
    }

    @TestScore(2)
    @Test
    public void indexOfEnd() {
        int[] array = {0,2,5,10,25,91,100};
        var idx = indexOf(array, -1);
        assertEquals(0, idx, "incorrect insert index");

        idx = indexOf(array, 200);
        assertEquals(7, idx, "incorrect insert index");
    }



    @TestScore(1)
    @Test
    public void indexOfExisting() {
        int[] array = {0,2,5,10,25,91,100};

        for (int i = 0; i < array.length; i++) {
            int idx = indexOf(array, array[i]);

            assertTrue(i == idx || (i+1) == idx, "incorrect insert index for pre-existing element");
        }
    }


    private void compareArrays(int[] expected, int[] actual, String message) {
        assertEquals(expected.length, actual.length, "incorrect length");

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], message);
        }
    }

    @TestScore(5)
    @Test
    public void insertSortedTest() {
        int[] array = {0,2,5,10,25,91,100};
        int[] copy = Arrays.copyOf(array, array.length);
        var inserted = insertSorted(copy, 1);
        compareArrays(array, Arrays.copyOf(array, array.length), "insert method modified the original array");

        compareArrays(new int[]{0,1,2,5,10,25,91,100}, inserted, "incorrect insert");

        inserted = insertSorted(array, 4);
        compareArrays(new int[]{0,2,4,5,10,25,91,100}, inserted, "incorrect insert");

        inserted = insertSorted(array, 91);
        compareArrays(new int[]{0,2,5,10,25,91,91,100}, inserted, "incorrect insert");
    }
}
