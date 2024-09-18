public class FiboTriangle {
    public static void main(String[] args) {
        fibonacciTriangle(5);
    }

    static void fibonacciTriangle(int n){
        // n = number of rows

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {

            for(int j = 1; j<=i; j++){
                // printing fibonacci triangle
                System.out.print(a+" ");
                // updating fibonacci values
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}
