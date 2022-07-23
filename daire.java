import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        
        System.out.println("Yaricap:");
        double r,pi=3.14;
        Scanner sc = new Scanner(System.in);
        r= sc.nextDouble();
        double perimeter = 2*pi*r;
        double area = pi*r*r;

        System.out.println("Alan = "+ area);
        System.out.println("Cevre = "+ perimeter);
        sc.close();
        System.exit(0);
    }
}
