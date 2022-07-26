import java.util.Scanner;

public class basamak {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        n = inp.nextInt();

        int total=0;
        while(n>0){
            total += n%10;
            n /=10;
        }
        System.out.println("result is: "+total);
    }
}
