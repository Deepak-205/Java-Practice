import java.util.Scanner;
public class swapnum {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:" + " "+ a +" "+ b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        swap(a, b);    }
}
