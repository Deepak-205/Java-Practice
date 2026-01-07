import java.util.Scanner;

class uppertolower {
    static String toLower(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                c = (char)(c+('a'-'A'));
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String s = sc.next();
    String result = toLower(s);
    System.out.println(result);
    }
}

