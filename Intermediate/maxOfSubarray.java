import java.util.*;

class maxOfSubarray{
    public ArrayList<Integer> maxOfSubarr(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<arr.length; i++){
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }
            if(i >= k - 1){
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt();

        System.out.println("Enter Array value:");
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k value:");
        int k = sc.nextInt();
        
        maxOfSubarray s = new maxOfSubarray();
        System.out.println(s.maxOfSubarr(arr, k));
    }
}