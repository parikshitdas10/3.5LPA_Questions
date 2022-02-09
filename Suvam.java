import java.util.*;

public class Suvam {
    static boolean contains(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    static String getUnique(String instr) {
        String str = "";
        for (int i = 0; i < instr.length(); i++) {
            if (!contains(str, instr.charAt(i))) {
                str = str + instr.charAt(i);
            }
        }
        return str;
    }

    static int getIndex(String instr, char ch) {
        for (int i = 0; i < instr.length(); i++) {
            if (instr.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    static boolean func(String ele, char ch, String instr, String[] inarr) {
        int flag = 0;
        int flag2 = 0;
        boolean repeat = false;
        String outstr = "";
        for (int i = 0; i < instr.length(); i++) {
            if (flag == 0 && instr.charAt(i) == ch) {
                flag = 1;
                continue;
            }
            if (flag == 1 && instr.charAt(i) == ch) {
                repeat = true;
                if (inarr[i] == ele) {
                    flag2 = 1;
                } else {
                    flag2 = 0;
                }
            }
        }
        if (repeat == true && flag2 == 1) {
            return true;
        } else if (repeat == false && flag == 1) {
            int c = 0;
            for (int j = 0; j < inarr.length; j++) {
                if (ele == inarr[j]) {
                    c++;
                }
            }
            if (c > 1) {
                return false;
            } else {
                return true;
            }
        }
        return false;

    }

    static void getElements(String str, String instr, String[] inarr) {
        int index = -1;
        String outstr = "";
        for (int i = 0; i < str.length(); i++) {
            index = getIndex(instr, str.charAt(i));
            String ele = inarr[index];
            if (func(ele, str.charAt(i), instr, inarr)) {
                outstr = outstr + str.charAt(i);
            }
        }
        if (outstr.length() > 0)
            System.out.println(outstr);
        else {
            System.out.println("NA");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        String input = sc.nextLine();
        String[] inarr = input.split("[,]", 0);
        String str = getUnique(instr);
        getElements(str, instr, inarr);
    }
}
