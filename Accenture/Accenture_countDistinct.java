import java.util.*;

public class Accenture_countDistinct {
    static void getArr(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int count(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : arr)
            set.add(e);
        return set.size();
    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        getArr(arr, n, sc);
        System.out.println(count(arr, n));

    }
}
