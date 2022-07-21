import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        
        System.out.println("bir fiyat girin:");
        double fiyat;
        Scanner sc = new Scanner(System.in);
        fiyat = sc.nextDouble();

        double oran1 = 0.18;
        double oran2 = 0.08;

        if(fiyat <1000 && fiyat >0){
            System.out.println("KDVsiz fiyat: "+ fiyat);
            System.out.println("KDVli fiyat: "+ (fiyat*oran1+fiyat));
            System.out.println("KDV tutarı: "+ fiyat*oran1);
        
        }else{
            System.out.println("KDVsiz fiyat: "+ fiyat);
            System.out.println("KDVli fiyat: "+ fiyat*oran2+fiyat);
            System.out.println("KDV tutarı: "+ fiyat*oran2);
        }
     System.exit(0);   
    }
}
