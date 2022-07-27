import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 25000;
        int select;

        while(right>0){
            System.out.println("ID:");
            username = inp.nextLine();
            System.out.println("password:");
            password = inp.nextLine();

            // username : java --- password : java123
            if(username.equals("java") && (password.equals("java123"))){
                System.out.println("select your operation");
                System.out.println( "1-Deposit\n" +
                                    "2-Withdrawal\n" +
                                    "3-balance inquiry\n" +
                                    "4-Exit");
                System.out.println("----------------");
                select = inp.nextInt();
                switch (select) {
                    case 1:
                        int a;
                        System.out.println("how much do you want to deposit ?");
                        a = inp.nextInt();
                        System.out.println("New balance is:"+(balance+a));
                        break;
                    case 2:
                        int b;
                        System.out.println("how much do you want to withdraw money?");
                        b = inp.nextInt();
                        if(b>balance){
                            System.out.println("invalid value !! Your balance is :"+ balance);
                        }else{
                            System.out.println("new balance is :"+ (balance-b));
                        }
                        break;
                    case 3:
                        System.out.println("Balance:"+balance);
                        break;
                    case 4:
                        System.out.println("Exiting!!");
                        break;    
                    default:
                        break;
                }
                break;

            }else{
                right--;
                if(right == 0){
                    System.out.println("your account is blocked!!");
                    break;
                }else{
                    System.out.println(right+" right left");
                }
            }

        }
        inp.close();
    }
}
