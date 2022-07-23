import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        
        double armut = 2.14;
        double elma =3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        
        double total = 0;
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,e;
        System.out.println("armut kac kg:");
        a = sc.nextInt();
        total += a*armut;

        System.out.println("elma kac kg:");
        b = sc.nextInt();
        total += b*elma;
        
        System.out.println("muz kac kg:");
        c = sc.nextInt();
        total += c*muz;

        System.out.println("domates kac kg:");
        d = sc.nextInt();
        total += d*domates;

        System.out.println("patlican kac kg:");
        e = sc.nextInt();
        total += e*patlican;
        sc.close();
        System.out.println("Toplam = "+ String.format("%.3f", total));

    }
}
