import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        
        double weight,height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Boyunuzu girin(m):");
        height = sc.nextDouble();
        
        System.out.println("Kilonuzu girin(kg):");
        weight = sc.nextDouble();

        double index = weight / (height*height);
        System.out.println("Kutle endeksiniz: ");
        System.out.format("%.2f",index);
        sc.close();

        
    }
}
