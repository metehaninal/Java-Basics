import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int num,total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number of terms:");
        num = inp.nextInt();
        
        System.out.print(first+" ");
        System.out.print(second+" ");
        for (int i = 2; i < num; i++) {
            total = first + second;
            System.out.print(total+ " ");
            first = second;
            second = total;
        }
        inp.close();
    }
}
