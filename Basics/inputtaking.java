import java.util.*;

class inputtaking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer:");
        int a = sc.nextInt();
        System.out.println("Enter Float:");
        float b = sc.nextFloat();
        System.out.println("Enter Long:");
        long c = sc.nextLong();
        System.out.println("Enter Byte:");
        byte d = sc.nextByte();
        sc.nextLine();
        System.out.println("Enter String:");
        String s = sc.nextLine();
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
}