// This is even to odd transformation 
// for each even element subtract 3
// for each odd element add 3

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {3,4,9};
        System.out.println(Arrays.toString(EvenOddTransformation(arr)));
    }

    static int[] EvenOddTransformation(int[] arr){

        int transformationCount = arr.length;

        for (int i = 0; i < transformationCount; i++) {
            if(arr[i]%2==0){
                arr[i] = arr[i]-3;
            }else if(arr[i]%2!=0){
                arr[i] = arr[i]+3;
            }
        }

        return arr;
    }
}
