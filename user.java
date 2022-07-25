import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        
        String userName,password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanici adi:");
        userName = sc.nextLine();
        System.out.println("Sifre:");
        password = sc.nextLine();

        if(userName.equals("user") && password.equals("java1234")){
            System.out.println("giris basarili...");
        }else{
            System.out.println("sifreyi degismek istiyor musunuz?(Y/y veya N/n)");
            String c;
            c = sc.nextLine();
            if(c.equals("y") || c.equals("Y")){

                String newPassword;
                System.out.println("Yeni sifre:");
                newPassword = sc.nextLine();
                while(true){
                    if(newPassword.equals("java1234") || newPassword.equals(password)){
                        System.out.println("Sifre olusturulamadi.lutfen baska sifre girin:");
                        newPassword = sc.nextLine();
                    }else{
                        password = newPassword;
                        System.out.println("sifre olusturuldu");
                        break;
                    }
                }

            }else{
                System.out.println("sifre degistirilmedi.");
            }

        }
        sc.close();
    }
}
