public class primeNumbers {
    public static void main(String[] args) {
        
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true; // initialize value in every step
            if(i == 2 || i == 3){
                System.out.print(i+" ");
            }else{

                for (int j = i-1; j > 1; j--) { // checking for prime or not if prime change isPrime value 
                    if(i % j == 0){ 
                        isPrime = false;
                    }
                }
                if(isPrime == true){
                    System.out.print(i+" ");
                }
            } 
            
        }
    }
}
