import java.util.Scanner;

public class recursivePow {
    
    static int power(int base,int pow){
        
        if(pow == 0){
            return 1;
        }else{
            return power(base, pow-1)*base;
        }    
    }
    public static void main(String[] args) {
        int base,exp;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter base:");
        base = inp.nextInt();
        System.out.println("enter exponent:");
        exp = inp.nextInt();
        System.out.println(power(base, exp));
        inp.close();

    }
}
