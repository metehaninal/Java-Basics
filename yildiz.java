import java.util.Scanner;

public class yildiz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int n = inp.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * n - 1 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        inp.close();

    }
}
