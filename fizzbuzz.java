public class fizzbuzz {
    public static void main(String[] args) {
        Fizzbuzz(15);
    }

    static void Fizzbuzz(int n){

        for (int i = 1; i <= n; i++) {    

            if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            } else if (i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }else if (i%5==0 && i%3==0){
               System.out.println("FIzzBuzz");
            }else{
                System.out.println(i);
            }
            
        }
        
    }
}
