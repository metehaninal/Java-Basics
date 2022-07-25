import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        
        int a,b,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk sayi:");
        a = sc.nextInt();

        System.out.println("ikinci sayi:");
        b = sc.nextInt();

        System.out.println("islemi secin---\n1-toplama\n2-cikarma\n3-carpma\n4-bolme\n-----------");
        key = sc.nextInt();

        double total;
        switch (key) {
            case 1:
                total = a+b;
                System.out.println(total);
                break;
            case 2:
                total = a-b;
                System.out.println(total);
                break;
            case 3:
                total = a*b;
                System.out.println(total);
                break;
            case 4:
                total = a/b;
                System.out.println(total);
                break;
            default:
                System.out.println("gecersiz islem !!");
                break;
        }

        sc.close();
    }
}
