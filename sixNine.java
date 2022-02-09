import java.util.*;

class sixNine {
    static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                sb.append('9');
                continue;
            }
            sb.append(str.charAt(i));
        }
        sb.reverse();
        return (sb.toString());

    }

    static void avg(ArrayList<String> sb) {
        float sum = 0;
        for (int i = 0; i < sb.size(); i++) {
            sum = sum + Integer.parseInt(sb.get(i));
        }
        System.out.println(sum / sb.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sb = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        String input = sc.nextLine();
        String[] str = input.split("[,]", 0);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                String num = str[i];
                if (str[i].charAt(j) == '6') {
                    sb.add(reverse(str[i]));
                    break;
                } else if (j == str[i].length() - 1) {
                    sb.add(num);
                }
            }
        }
        avg(sb);
    }
}