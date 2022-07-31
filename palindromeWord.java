public class palindromeWord {
    
    static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("kavak"));
        System.out.println(isPalindrome("exe"));
        System.out.println(isPalindrome("car"));
    }
}
