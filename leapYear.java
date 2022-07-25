import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.println("enter year:");
        year = inp.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                System.out.println("leap year");
            }else if(year % 100 == 0 && year % 400 != 0){
                System.out.println("it is not leap year");
            }else
                System.out.println("leap year");

        }else{
            System.out.println("it is not leap year");
        }
        
        inp.close();
    }
}
