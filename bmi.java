import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        
        double weight,height;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter height(m):");
        height = inp.nextDouble();
        System.out.println("enter weight(kg):");
        weight = inp.nextDouble();
        double index = weight/(height*height);
        System.out.println("your body mass index is :");
        System.out.format("%.2f",index);
        inp.close();


    }
}
