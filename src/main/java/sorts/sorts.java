/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sorts;

import java.util.Arrays;

public class sorts {

    public static void quickSort(int[] inArr, int l, int r) {
        if(l < r) {
            int position = quickSortPartition(inArr, l, r);
            quickSort(inArr, l, position -1);
            quickSort(inArr, position + 1, r);
        }
    }

    public static int quickSortPartition(int[] inArr, int l, int r) {
        int pivot = r;
        int low = l -1;
        for(int i = l; i <= r; i++) {
            if(inArr[i] <= pivot) {
                low++;
                swap(inArr, i, low);
            }
        }
        swap(inArr, r, low+1);
        return low + 1;
    }

    public static void swap(int[] inArr, int idx1, int idx2) {
        int temp = inArr[idx1];
        inArr[idx1] = inArr[idx2];
        inArr[idx2] = temp;
    }

    public static void insertionSort(int[] inArr) {

        // Iterate through the input array from index length-1 to index 1
        for (int i = 0; i < inArr.length; i++) {
            int cur = inArr[i];
            // Iterate through all elements to the left of the current index.
            int j = i - 1;
            while (j >= 0 && cur < inArr[j]) {
                // While the current is less than the element to it's left, keep moving.
                inArr[j + 1] = inArr[j];
                j--;
            }
            inArr[j + 1] = cur;
        }
    }

    public static void mergeSort(int[] inArr) {
        if(inArr.length > 1) {
            int mid = (int)Math.floor(inArr.length/2);
            int[] leftSide = Arrays.copyOfRange(inArr,0, mid);
            int[] rightSide = Arrays.copyOfRange(inArr, mid, inArr.length);

            mergeSort(leftSide);
            mergeSort(rightSide);
            merge(leftSide, rightSide, inArr);
        }
    }

    public static void merge(int[] l, int[] r, int[] inArr) {
        int i = 0, j = 0, k = 0;
        while(i < l.length && j < r.length && k < inArr.length) {
            if(l[i] < r[j]) {
                inArr[k] = l[i];
                i++;
            }
            else {
                inArr[k] = r[j];
                j++;
            }
            k++;
        }
        // Place remaining left side elements.
        while(i < l.length){
            inArr[k] = l[i];
            i++;
            k++;
        }
        // Place remaining left side elements.
        while(j < r.length){
            inArr[k] = r[j];
            j++;
            k++;
        }
    }

}
