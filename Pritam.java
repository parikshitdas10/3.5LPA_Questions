import java.util.*;

class Pritam {
    static void getCount(String[] instr, ArrayList<Integer> maxCount) {
        int count = 1;
        int max = 1;
        for (int i = 0; i < instr.length; i++) {
            for (int j = 0; j < instr[i].length(); j++) {
                for (int k = j + 1; k < instr[i].length(); k++) {
                    if (instr[i].charAt(j) == instr[i].charAt(k)) {
                        count++;
                    }
                    if (count > max) {
                        max = count;
                    }
                }
                count = 1;
            }
            maxCount.add(max);
            max = 1;
            count = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> maxCount = new ArrayList<>();
        String str = sc.nextLine();
        int innum1 = sc.nextInt();
        int innum2 = sc.nextInt();
        String[] instr = str.split("[,]", 0);
        getCount(instr, maxCount);
        int mod;
        String tmpstr = "";

    }
}
