import java.util.Scanner;

class busticket {
    public boolean canServe(int[] arr) {
        int five = 0;
        int ten = 0;
        
        for(int note:arr){
            if(note==5){
                five++;
            }
            else if(note==10){
                if(five == 0) return false;
                five--;
                ten++;
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five -=3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of tickets:");
        int n = sc.nextInt();
        System.out.println("Enter:");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        busticket s = new busticket();
        System.out.println(s.canServe(arr));
    }
}