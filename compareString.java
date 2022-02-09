import java.util.*;

public class compareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> concat = new ArrayList<>();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String arr1[] = str1.split("[,]", 0);
        String arr2[] = str2.split("[,]", 0);
        String arr3[] = str3.split("[,]", 0);
        int length;
        if (arr1.length > arr2.length) {
            length = arr1.length;
        } else {
            length = arr2.length;
        }
        String add;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                add = arr1[i] + arr2[j];
                concat.add(add);
            }
        }

    }
}
