
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        
        double fee_per_km = 2.2;
        double starting = 10;
        double km;
        Scanner sc = new Scanner(System.in);
        System.out.println("Km girin:");
        km = sc.nextDouble();
        double total = starting + (km*fee_per_km); // min value
        if( total <20){
            System.out.println("Tutar = 20");
        }else{
            System.out.println("Tutar = " + total);
        }
        sc.close();
        System.exit(0);
    }
}

