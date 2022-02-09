import java.util.*;

public class Deboleena {
    static void func(StringBuilder sb, int innum, String str1, String str2) {
        int c = 1;
        int f = 0;
        int l = 0;
        int s1 = 0;
        int s2 = 0;
        while (true) {
            l = l + innum;
            if (l <= str1.length() && l <= str2.length()) {
                sb.append(str1.substring(f, l));
                s1 = s1 + innum;
                sb.append(str2.substring(f, l));
                s2 = s2 + innum;
            } else {
                break;
            }
            f = l;
            c = c + innum;
        }
        if (s1 < str1.length()) {
            sb.append(str1.substring(s1, str1.length()));
        }
        if (s2 < str2.length()) {
            sb.append(str2.substring(s2, str2.length()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int innum = sc.nextInt();
        if (innum >= str1.length() || innum > str2.length()) {
            sb.append(str1);
            sb.append(str2);
            System.out.println(sb.toString());
            return;
        }
        func(sb, innum, str1, str2);
        System.out.println(sb.toString());

    }
}
