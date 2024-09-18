/*An Armstrong number (also known as a Narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits. */

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = Integer.toString(n).length();

        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,digits);
            n = n/10;
        }

        return sum == original;
    }
}
