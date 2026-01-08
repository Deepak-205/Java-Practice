import java.util.*;

class switchC {
    static double switchCase(int choice, List<Double> arr) {
        double area = 0.0;

        switch(choice){
            case 1:
                double radius = arr.get(0);
                area = Math.PI*radius*radius;
                break;
            case 2:
                double l = arr.get(0);
                double b = arr.get(1);
                area = l*b;
                break;
            default:
            System.out.println("Please select a right choice");
        }
        return area;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for radius, 2 for l*b");
        int choice = sc.nextInt();
        
        List<Double> arr = new ArrayList<>();
        
        if(choice==1){
            System.out.println("Enter Radius:");
            arr.add(sc.nextDouble());
        }
        else if(choice==2){
            System.out.println("Enter Length");
            arr.add(sc.nextDouble());
            System.out.println("Enter Breadth");
            arr.add(sc.nextDouble());
        }
        
        double result = switchCase(choice, arr);
        System.out.println("Area:" + result);
    }
}