import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        int mat,phys,music,chem,tur;
        Scanner sc = new Scanner(System.in);
        int count=0;
        double total=0;

        System.out.println("enter math grade:");
        mat = sc.nextInt();
        if(mat >= 0 && mat <= 100){
            count++;
            total += mat;
        }
        System.out.println("enter physics grade:");
        phys = sc.nextInt();
        if(phys >= 0 && phys <= 100){
            count++;
            total += phys;
        }
        System.out.println("enter music grade:");
        music = sc.nextInt();
        if(music >= 0 && music <= 100){
            count++;
            total += music;
        }
        System.out.println("enter chemistry grade:");
        chem = sc.nextInt();
        if(chem >= 0 && chem <= 100){
            count++;
            total += chem;
        }
        System.out.println("enter Turkish grade:");
        tur = sc.nextInt();
        if(tur >= 0 && tur <= 100){
            count++;
            total += tur;
        }
        
        double average = total/count;
        if(average >55){
            System.out.println("you pass the course!");
        }else{
            System.out.println("you failed !");
        }
        sc.close();
    }
}
