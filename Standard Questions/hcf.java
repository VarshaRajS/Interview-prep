/*Time Complexity:
O(log(min(a, b))): The Euclidean algorithm has logarithmic time complexity relative to the smaller of the two numbers.
Space Complexity:
O(1): We are only using a constant amount of extra space for a few variables. */
public class hcf {
    public static void main(String[] args) {
        System.out.println(hcf(54,24));
    }

    static int hcf(int a, int b){
        // using Euclidean Algorithm
        if(b == 0){
            return a;
        }
        while(b!=0){
            // hcf(b,a%b)
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
