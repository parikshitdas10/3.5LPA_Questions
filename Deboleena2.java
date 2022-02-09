import java.util.*;

public class Deboleena2 {
    static String sortString(String instr) {
        char tmparr[] = instr.toCharArray();
        Arrays.sort(tmparr);
        return new String(tmparr);
    }

    static void arrange(StringBuilder sb, String str, String instr) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == 'e') {
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == 'i') {
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == 'o') {
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == 'u') {
                sb.append(str.charAt(i));
            }
        }
        if (sb.isEmpty()) {
            sb.append("NA");
            sb.append("-1");
        } else {
            char ch = sb.charAt(0);
            for (int i = 0; i < instr.length(); i++) {
                if (instr.charAt(i) == ch) {
                    sb.append(i);
                    break;
                }
            }

        }
    }

    static void arrange2(StringBuilder sb, ArrayList<Character> charr, String str, String instr) {
        ArrayList<Integer> arr = new ArrayList<>();
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!charr.contains(str.charAt(i))) {
                sb.append(str.charAt(i));
                flag = 1;

            }
        }
        if (flag == 0) {
            sb.append("NA");
            sb.append("-1");
        } else {
            char ch = sb.charAt(sb.length() - 1);
            for (int j = 0; j < instr.length(); j++) {
                if (instr.charAt(j) == ch) {
                    arr.add(j);
                }
            }
            sb.append(arr.get(arr.size() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> charr = new ArrayList<>();
        String instr = sc.nextLine();
        if (instr.length() == 0) {
            sb.append("NA-1NA-1");
            return;
        }
        String str = sortString(instr);
        arrange(sb, str, instr);
        for (int i = 0; i < sb.length(); i++) {
            if (!sb.isEmpty()) {
                charr.add(sb.charAt(i));
            }
        }
        arrange2(sb, charr, str, instr);
        System.out.println(sb.toString());

    }

}
