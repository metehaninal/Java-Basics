import java.util.Scanner;

public class recursivePrint {
    
    static int f(int num){
        if(num<=0){
            return num;
        }else{
            System.out.print(num+" ");
            return f(num-5);
        }

    }
    static int func(int x,int y){
        if(x > y){
            return x;
        }else{
            System.out.print(x+" ");
            return func(x+5, y);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a number:");
        int n;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        func(f(n), n);
        inp.close();
    }
}
