package String;


public class Palindrome {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(palindromeString(str));
    }

    static boolean palindromeString(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
