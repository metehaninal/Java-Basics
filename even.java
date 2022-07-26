import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        num = inp.nextInt();

        int total=0;
        while(num % 2 != 1){ // it will calculate only even numbers
            total += num;
            System.out.println("enter new number:");
            num = inp.nextInt();
        }
        System.out.println("total is:"+ total);
        inp.close();
    }
}
