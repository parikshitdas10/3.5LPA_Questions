
//find the consecutive numbers either row/column wise or diagonally
// if multiple numbers then print smallest one
import java.util.*;

public class MatrixConsecutive {
    static void getMatrix(Scanner sc, int[][] matrix, int m, int n) {
        System.out.println("Enter values: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static boolean isConsecutive(int[][] matrix, int a, int b, int m, int n) {
        // */Out of bounds condition check*/
        System.out.println("in row " + a + " in column " + b);
        // */ Out of bounds Condition check*/
        int i = a;
        int j = b;
        int c;// for loop operation
        // column wise check
        for (c = 0; c < 2; c++) {
            if ((i + 1) < m && matrix[i][j] == matrix[i + 1][j]) {// first condition is out of bounds check
                i = i + 1;
            }
            if ((i - a) == 2) {// this means i value is increased 2 times i.e consecutive numbers
                System.out.println("found consecutive in column");
                return true;
            }
        }
        // row wise check
        i = a;
        j = b;
        for (c = 0; c < 2; c++) {
            if ((j + 1) < n && matrix[i][j] == matrix[i][j + 1]) {
                j = j + 1;
            }
            if ((j - b) == 2) {// this means i value is increased 2 times i.e consecutive numbers
                System.out.println("found consecutive in row");
                return true;
            }
        }
        // south east check
        i = a;
        j = b;
        for (c = 0; c < 2; c++) {
            if ((i + 1) < m && (j + 1) < n) {
                if (matrix[i][j] == matrix[i + 1][j + 1]) {
                    i++;
                    j++;
                }
            }
            if ((i - a) == 2 && (j - b) == 2) {
                System.out.println("found consecutive in south east diagonal");
                return true;
            }
        }
        // south west check
        i = a;
        j = b;
        for (c = 0; c < 2; c++) {
            if ((i + 1) < m && (j - 1) >= 0) {
                if (matrix[i][j] == matrix[i + 1][j - 1]) {
                    i++;
                    j--;
                }
            }
            if ((i - a) == 2) {
                System.out.println("found consecutive in south west diagonal");
                return true;
            }
        }
        return false;
    }

    static void getConsecutive(int[][] matrix, ArrayList<Integer> consecutive, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isConsecutive(matrix, i, j, m, n)) {
                    System.out.println("adding " + matrix[i][j]);
                    consecutive.add(matrix[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> consecutive = new ArrayList<>();
        System.out.println("Enter m and n for rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        getMatrix(sc, matrix, m, n);
        System.out.println("You have entered: ");
        printMatrix(matrix, m, n);
        getConsecutive(matrix, consecutive, m, n);
        Collections.sort(consecutive);
        if (consecutive.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println("Found Consecutive elements: " + consecutive);
            System.out.println("Min: " + consecutive.get(0));
        }
    }
}
