import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int n,r;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter 'n':");
        n = inp.nextInt();
        System.out.println("enter 'r':");
        r = inp.nextInt();

        int nFaktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        System.out.println("n fact : " + nFaktoriyel);

        int rFaktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }
        System.out.println("r fact : "+ rFaktoriyel);

        int nrFaktoriyel=1;
        for (int i = 1; i <= n-r; i++) {
            nrFaktoriyel *= i;
        }

        double co = nFaktoriyel/(rFaktoriyel*(nrFaktoriyel));
        System.out.println("C(n,r) = "+ co);
        inp.close();

    }
}
