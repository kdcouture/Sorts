/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sorts;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class LibraryTest {
    @Test public void testInsertionSortSafeCases() {
        int[] testArr = {7, 1, 4, 3, 5, 2, 6};
        sorts.insertionSort(testArr);
        Assert.assertEquals("Should be sorted in ascending order.", "[1, 2, 3, 4, 5, 6, 7]", Arrays.toString(testArr));

        int[] testArr2 = {2,1,3};
        sorts.insertionSort(testArr2);
        Assert.assertEquals("Should be sorted in ascending order.", "[1, 2, 3]", Arrays.toString(testArr2));

        int[] testArr3 = {2,1};
        sorts.insertionSort(testArr3);
        Assert.assertEquals("Should be sorted in ascending order.", "[1, 2]", Arrays.toString(testArr3));
    }

    @Test public void testInsertionSortEdgeCases() {
        int[] testArr = {};
        sorts.insertionSort(testArr);
        Assert.assertEquals("Should be sorted in ascending order.", "[]", Arrays.toString(testArr));

        int[] testArr2 = {1};
        sorts.insertionSort(testArr2);
        Assert.assertEquals("Should be sorted in ascending order.", "[1]", Arrays.toString(testArr2));

    }
}
