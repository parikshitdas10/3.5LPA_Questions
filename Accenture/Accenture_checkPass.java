import java.util.*;

public class Accenture_checkPass {
    static Scanner sc;

    static boolean f(char[] str, int n, int min) {
        int num = 0;
        int cap = 0;
        int spl = 0;
        if (n < min)
            return false;
        if (str[0] >= '0' && str[0] <= '9')
            return false;
        for (char c : str) {
            if (c == ' ' || c == '+')
                return false;
            if (c >= '0' && c <= '9')
                num = num + 1;
            if (c >= 'A' && c <= 'Z')
                cap = cap + 1;
            if (c >= 32 && c <= 47 || c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 126)
                spl += 1;
        }

        if (num > 0 && cap > 0 && spl > 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int min = sc.nextInt();
        String pass = sc.next();
        int n = pass.length();
        char[] str = pass.toCharArray();
        boolean result = f(str, n, min);
        System.out.println(result ? "valid" : "not valid");
    }
}