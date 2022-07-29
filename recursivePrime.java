import java.util.Scanner;

public class recursivePrime {

    static int i = 2;
    static boolean isPrime(int num) {
        
        if (num == 1) {   //base cases
            return false;
        }else if (num == 2 || num == 3) { // base cases
            return true;
        }else if (i * i > num){ // base cases 
            return true;       
        }else {
            if (num % i == 0) {
                return false;
            } else {
                i++;
                return isPrime(num);
            }
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n = inp.nextInt();

        if (isPrime(n)) {
            System.out.println("Yes it is prime number!!");
        } else {
            System.out.println("No it isn't prime number!!");
        }

        inp.close();
    }
}
