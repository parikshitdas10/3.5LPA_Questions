import java.util.*;

public class MyCode {
    static void split(int[] array, ArrayList<Integer> arr) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arr.add(array[i]);
            }
        }
        for (i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                arr.add(array[i]);
            }
        }

    }

    static int getMissing(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
            sum = sum + i;
        }
        return sum;
    }

    static void getDiff(ArrayList<Integer> arr, ArrayList<Integer> outArr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) > 1) {
                outArr.add(getMissing(arr.get(i), arr.get(i + 1)));
            } else {
                outArr.add(0);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> outArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split("[,]", 0);
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        split(array, arr);
        getDiff(arr, outArr);
        for (int i = 0; i < outArr.size(); i++) {
            if (i == outArr.size() - 1) {
                System.out.print(outArr.get(i));
                break;
            }
            System.out.print(outArr.get(i) + ",");
        }
    }
}
