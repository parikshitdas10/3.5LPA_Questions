
// Program to print all the pronic numbers in a given string
import java.util.*;

class Pronic {
    static void getSubString(String str, ArrayList<String> subStr) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                subStr.add(str.substring(i, j + 1));// j+1 since ending index is excluded in substring method
            }
        }
    }

    static boolean isPronic(int temp) {
        for (int i = 1; i <= (int) Math.sqrt(temp); i++) {
            if ((i * (i + 1)) == temp) {
                return true;
            }
        }
        return false;
    }

    static void getPronic(ArrayList<String> subStr, ArrayList<Integer> pronicNumbers) {
        int temp;
        for (int i = 0; i < subStr.size(); i++) {
            temp = Integer.parseInt(subStr.get(i));
            if (isPronic(temp)) {
                pronicNumbers.add(temp);
            }
        }
        Collections.sort(pronicNumbers);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> subStr = new ArrayList<>();
        ArrayList<Integer> pronicNumbers = new ArrayList<>();

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        getSubString(str, subStr);
        getPronic(subStr, pronicNumbers);
        System.out.println("Sub Strings:\n" + subStr);

        if (pronicNumbers.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Pronic numbers:\n" + pronicNumbers);
        }

    }
}