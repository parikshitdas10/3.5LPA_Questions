import java.util.*;

public class Amstrong {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;

        else
            return false;
    }

    static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> outarr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String inarr = sc.nextLine();
        String[] res = inarr.split("[,]", 0);
        String concat;
        int num1, num2;
        int num;
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                concat = res[i] + res[j];
                num = Integer.parseInt(concat);
                if (isArmstrong(num)) {
                    arr.add(num);
                }

            }
        }
        outarr = removeDuplicate(arr);
        for (int k = 0; k < outarr.size(); k++) {
            if (outarr.isEmpty()) {
                System.out.println("-1");
                break;
            }
            if (k == outarr.size() - 1) {
                System.out.print(outarr.get(k));
                break;
            }
            System.out.print(outarr.get(k) + ",");

        }

    }
}
