import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Ucgenin kenarlarini girin:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan = "+ area);
        sc.close();
    }
}
