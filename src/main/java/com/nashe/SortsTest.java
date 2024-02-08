package com.nashe; 
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortsTest {

    private Sorts<Integer> ordenamientos;

    @Test
    public void testBubbleSort() {
        ordenamientos = new Sorts<>();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};

        ordenamientos.bubbleSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testGnomeSort() {
        ordenamientos = new Sorts<>();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};

        ordenamientos.gnomeSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSort() {
        ordenamientos = new Sorts<>();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};

        ordenamientos.mergeSort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSort() {
        ordenamientos = new Sorts<>();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};

        ordenamientos.quickSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testRadixSort() {
        ordenamientos = new Sorts<>();
        Integer[] array = {5, 3, 8, 4, 2};
        Integer[] expected = {2, 3, 4, 5, 8};

        ordenamientos.radixSort(array);

        assertArrayEquals(expected, array);
    }

}
