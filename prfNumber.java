import java.util.Scanner;

public class prfNumber {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a num:");
        num = inp.nextInt();

        int total = 0;
        for (int i = 1; i < num; i++) {
            if(num == 1){
                System.out.println("it isn't perfect number!");
                break;
            }
            if(num % i == 0){
                total += i;
            }

        }
        
        if(total == num){
            System.out.println("it is perfect num!");
        }else
            System.out.println("it is not perfect num!");
        
        inp.close();
        
    }
}
