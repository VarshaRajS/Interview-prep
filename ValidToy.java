import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ValidToy {

    public static void main(String[] args) {
        
        List<String> toys = Arrays.asList("2 2 1", "3 3 3", "3 4 5", "1 1 3");

        List<String> output = ClassifyTriangleToys(toys);

        System.out.println(output.toString().replace("[", "[\"").replace("]", "\"]").replace(", ", "\", \""));

    }

    static String ValidType(int a, int b, int c){
        int[] sides = {a, b, c};
        Arrays.sort(sides);
        a = sides[0];
        b = sides[1];
        c = sides[2];

        if (a + b > c){ // must satisfy this criteria to be valid
            if (a==b && b==c){
                return "Equilateral";
            } else if (a == b || b == c || c == a){
                return "Isosceles";
            } else {
                return "None of these";
            }
        } else{
            return "None of these";
        }
    }

    static List<String> ClassifyTriangleToys(List<String> toys){
        List<String> result = new ArrayList<>();

        for(String toy : toys){

            String[] parts = toy.split(" ");

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);

            result.add(ValidType(a, b, c));
        }

        return result;
    }
}
