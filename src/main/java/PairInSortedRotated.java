//Problem Statement
//Given an array that is sorted and then rotated around an unknown point. Find if the array has a pair with a given sum ‘x’. It may be assumed that all elements in the array are distinct.
//        Examples :
//
//        Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
//        Output: true
//        There is a pair (6, 10) with sum 16
//
//        Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
//        Output: true
//        There is a pair (26, 9) with sum 35
//
//        Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
//        Output: false
//        There is no pair with sum 45.

// Java program to find a pair with a given
// sum in a sorted and rotated array
class PairInSortedRotated
{
    // This function returns true if arr[0..n-1]
    // has a pair with sum equals to x.
    static boolean pairInSortedRotated(int arr[],
                                       int n, int x)
    {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1])
                break;

        int l = (i + 1) % n; // l is now index of
        // smallest element

        int r = i;	 // r is now index of largest
        //element

        // Keep moving either l or r till they meet
        while (l != r)
        {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            else // Move to the lower sum side
                r = (n + r - 1) % n;
        }
        return false;
    }

    /* Driver program to test above function */
    public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
            System.out.print("Array has two elements" +
                    " with sum 16");
        else
            System.out.print("Array doesn't have two" +
                    " elements with sum 16 ");
    }
}
/*This code is contributed by Prakriti Gupta*/
