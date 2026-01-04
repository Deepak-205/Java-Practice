import java.util.Scanner;

public class nextline {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t value:");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            System.out.print("Enter a value:");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a String:");
            String s = sc.nextLine();

            System.out.println(a);
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        getInput();
    }
}