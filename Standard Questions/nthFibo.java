/*Time Complexity:
O(n): We compute the n-th Fibonacci number in linear time by iterating from 2 to n.
Space Complexity:
O(1): We only use a constant amount of space to store variables a, b, and fib. */

public class nthFibo {
    public static void main(String[] args) {
        System.out.println(Fibo(3));
        System.out.println(Fibo2(3));
    }

    static int Fibo(int n){
        if(n<=1){
            return n;
        }

        int a = 0, b = 1;
        int next = 0;

        for (int i = 2; i <= n; i++) {
            next = a+b;
            a = b;
            b = next;
        }

        return next;
    }

    static int Fibo2(int n){
        // base case 
        if (n <= 1){
            return n;
        }

        // recursive function
        return Fibo2(n-1)+Fibo(n-2);
    }
}
