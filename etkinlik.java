import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        
        int temperature;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter temperature:");
        temperature = inp.nextInt();

        if(temperature<5){
            System.out.println("you can do skiing");
        }else if(temperature<15){
            System.out.println("you can go to cinema");
        }else if(temperature <25){
            System.out.println("you can go to picnic");
        }else{
            System.out.println("you can go to swimming");
        }
        inp.close();
    }
    
}
