import java.util.*;

public class singleDigit {
    static int getSingle(int m) {
        int tmp = m;
        int a, b;
        int num;
        while (true) {
            if (tmp / 10 == 0) {
                num = tmp;
                break;
            } else {
                a = tmp / 10;
                b = tmp % 10;
                tmp = a + b;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        String temp = sc.nextLine();
        String[] str1 = temp.split("[,]", 0);
        String tmp = sc.nextLine();
        String[] str2 = tmp.split("[,]", 0);
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    arr.add(Integer.parseInt(str1[i]));
                }
            }
        }
        Collections.sort(arr);
        if (arr.isEmpty()) {
            System.out.print("-1");
            return;
        }
        if (arr.get(0) == 0) {
            System.out.print("-1");
            return;
        }
        int m = getSingle(arr.get(0));

    }
}
