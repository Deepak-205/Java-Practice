import java.util.*;
class PT {
    public int catchThieves(char[] arr, int k) {

        List<Integer> police = new ArrayList<>();
        List<Integer> thief  = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                police.add(i);
            } else if (arr[i] == 'T') {
                thief.add(i);
            }
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < police.size() && j < thief.size()) {
            if (Math.abs(police.get(i) - thief.get(j)) <= k) {
                count++;
                i++;
                j++;
            }
            else if (thief.get(j) < police.get(i) - k) {
                j++;
            }
            else {
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        String s = sc.next();
        char[] arr = s.toCharArray();

        System.out.println("Enter K:");
        int k = sc.nextInt();

        PT p = new PT();
        System.out.println(p.catchThieves(arr,k));
    }
}
