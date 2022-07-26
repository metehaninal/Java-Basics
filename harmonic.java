import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number:");
        n = inp.nextInt();

        double total=0;
        for (double i = 1; i <= n; i++) {
            total += 1/i;
        }
        System.out.println("result :"+ total);
        inp.close();

    }
}
