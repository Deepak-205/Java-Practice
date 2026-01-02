public class greatest {
    public static String compare(int n, int m){
        if(n>m) return "greater";
        if(n<m) return "lesser";
        return "equal";
    }

    public static void main(String[] args) {
        int n=5;
        int m=13;
        System.out.println(compare(n,m));
    }
    
}
