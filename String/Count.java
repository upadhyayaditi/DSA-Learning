package String;

public class Count {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";

        countString(str);
    }

    static void countString(String s){
        int vowels = 0;
        int consonants = 0;
        int whitespaces = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);

            if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                vowels++;
            }
            else if ( ch > 'a' && ch < 'z'){
                consonants++;
            }
            else if( ch == ' '){
                whitespaces++;
            }
        }

        System.out.println("Vowels" + vowels);
        System.out.println("Consonants" + consonants);
        System.out.println("Whitespaces" + whitespaces);
    }
}
