/* 
A password string consists of binary characters (0s and 1s). A cyber security expert is trying to determine the minimum number of changes required to make the password secure. To do so, it must be divided into substrings of non-overlapping, even length substrings. Each substring can only contain 0s or 1s, not a mix. This helps to ensure that the password is strong and less vulnerable to hacking attacks.

Find the minimum number of characters that must be flipped in the password string (changed from 0 to 1 or 1 to 0) to allow the string to be divided as described.*
 */

import java.util.Scanner;

public class passwd_strength {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the password: ");
        String str = scanner.nextLine();

        int result = number_of_flips(str);

        
        if (result != -1) {
            System.out.println("Minimum number of flips required: " + result);
        }

        scanner.close();

    }

    static int number_of_flips(String str){
        int len = str.length();
        int flip = 0;

        if (len % 2 != 0) { 
            return -1; 
        }
    
        for(int i=0; i<len; i+=2){

            if (i + 1 >= len) break;

            char first = str.charAt(i);
            char second = str.charAt(i+1);
    
            if(first!=second){
                flip++;
            }
        }
        return flip;
    }
}
