import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int x,y,z;
        Scanner inp = new Scanner(System.in);
        System.out.println("first number:");
        x = inp.nextInt();
        System.out.println("second number:");
        y = inp.nextInt();
        System.out.println("third number:");
        z = inp.nextInt();

        if (x >= y) {
            if (y >= z)
                System.out.print("In order " + z + " " + y + " " + x);
            else if (z >= x)
                System.out.print("In order " + y + " " + x + " " + z);
            else if (x >= z)
                System.out.print("In order " + y + " " + z + " " + x);
        } else {
            if (z >= y)
                System.out.print("In order " + x + " " + y + " " + z);
            else if (z >= x)
                System.out.print("In order " + x + " " + z + " " + y);
            else if (x >= z)
                System.out.print("In order " + z + " " + x + " " + y);
        }
        inp.close();
    }
}
