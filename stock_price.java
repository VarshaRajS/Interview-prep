// METHOD 1
//This approach has time complexity of O(n^3), which might be inefficient

public class stcok_price {
    public static void main(String[] args){
        int[] price = {3,3,4,7,8};
        int d = 5;
        System.out.println(StockPrice(price, d));
    }

    static int StockPrice(int[] price, int d){
        int len = price.length;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < len-2; i++) {
            
            for(int j = i+1; j < len-1; j++){

                for(int k = j+1; k < len; k++){
                    
                   sum = price[i] + price[j] + price[k];

                    if(sum % d == 0){
                        count++;
                    }
                }
            }

        }

        return count;
    }
}


 /*
 // Method 2
 // using two pinter approach is more optimized
 // time complexity O(n^2)

import java.util.Arrays;

public class stcok_price { 
    public static void main(String[] args) {
        int[] price = {3,3,4,7,8};
        int d = 5;
        System.out.println(StockPrice(price, d));
    }

    static int StockPrice(int[] price, int d){
        int count = 0;
        int len = price.length;

        for (int i = 0; i < len-2; i++) {
            int a = i+1;
            int b = len-1;

            while(a<b){
                int sum = price[i] + price[a] + price[b];

                if (sum % d == 0) {
                    count++;
                    a++; // Move left pointer
                    b--; // Move right pointer
                }else if (sum < d) {
                    a++; // We need a larger sum
                } else {
                    b--; // We need a smaller sum
                }

            }
        }

        return count;
    }
 }
     */
