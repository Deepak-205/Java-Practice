import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+ nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
public class Main{
    public static void main(String[] a){
        Solution ans = new Solution();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        System.out.println("Enter the Array Elements");
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter number" + (i+1) + ":");
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);
    }
}