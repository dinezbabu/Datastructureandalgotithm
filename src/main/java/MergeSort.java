import java.util.*;
import java.util.Arrays;
/**
 * Created by dbabu on 1/20/19.
 */
public class MergeSort {

    public static void main (String[] args){
        int mergeSortArray[]={2,5,1,9,3,6,8,4,7,0};
        //int mergeSortArray[]={12,11,13,5,6,7 };
        int leftIndex=0;
        int rightIndex=mergeSortArray.length-1;
        MergeSort mergeSort = new MergeSort();
        mergeSort.printMergeSortArray(mergeSortArray);
        mergeSort.splitArray(mergeSortArray,leftIndex,rightIndex);
        mergeSort.printMergeSortArray(mergeSortArray);
    }

    private void printMergeSortArray(int array[])
    {
        String delimiter="";
        for(int element:array) {
            System.out.print(delimiter+element);
            delimiter=",";
        }
        System.out.println("\n");
    }
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void splitArray(int[] array, int leftIndex, int rightIndex)
    {
        if(leftIndex<rightIndex){
            int middleIndex=(leftIndex+rightIndex)/2;
            splitArray(array,leftIndex,middleIndex);
            splitArray(array,middleIndex+1,rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }
}
