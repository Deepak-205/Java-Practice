import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
class precisionformat {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();
        
        Float exact = a/b;
        
        BigDecimal bd = new BigDecimal(Float.toString(exact));
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        float rounded = bd.floatValue();
        
        result.add(exact);
        result.add(rounded);
        
        return result;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a:");
        float a = sc.nextFloat();
        System.out.println("Enter value of b:");
        float b = sc.nextFloat();
        ArrayList<Float> ans = divisionWithPrecision(a, b);
        System.out.println(ans.get(0));
        System.out.println(ans.get(1));
    }
}