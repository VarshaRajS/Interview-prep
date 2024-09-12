/*
 * for each element of an array a counter is set to 0. The element is compared to each element to its left. If the element to the left is greater the absolute difference is subtracted from the counter. if the element to left is less the absolute difference is added to the counter. For each element of the array determine the value of the counter. These value should be stored in an array and returned.
 */

import java.util.Arrays;

public class array_left_right {
    public static void main(String[] args) {
        int[] input = {2,4,3};
        System.out.println(Arrays.toString(array_result(input)));
    }

    static int[] array_result(int[] arr){

        int n = arr.length; // length of input array

        int[] result = new int[n];//result array

        if (n < 2) {
            Arrays.fill(result, 0);
            return result; // Return an array of 0s if less than 2 elements
        }

        for (int i = 1; i < n; i++) {
        // j = left element
        // i = right element
            int counter = 0;

            for(int j = 0; j < i; j++){
                if(arr[j]<arr[i]){
                    // If previous element is lesser, add the absolute difference
                    counter += Math.abs(arr[j]-arr[i]);
                }   
                else if(arr[j]>arr[i]){
                    // If previous element is greater, subtract the absolute difference
                    counter -= Math.abs(arr[j]-arr[i]);
                }        
            }

            result[i] = counter;

        }

        return result;

    }
}
