import java.util.Scanner;

public class takePower {
    public static void main(String[] args) {
        int base,power;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter base:");
        base = inp.nextInt();
        System.out.println("enter power:");
        power = inp.nextInt();

        int total=1;
        for (int i = base; power > 0; power--) {
            
            total *= i;
        }
        System.out.println("result :"+total);
        inp.close();
    }
}
