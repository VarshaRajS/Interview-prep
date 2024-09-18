// time and space complexity of O(log N)

public class DectoBin {
    public static void main(String[] args) {
        System.out.println(dectobin(6));
    }

    static String dectobin(int n){
        // base condition
        if(n == 0){
            return "";
        }

        // recursively calling the function
        return dectobin(n/2)+(n%2);
    }
}
