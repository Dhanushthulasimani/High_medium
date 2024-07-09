public class N_queen {
    public static boolean isSafe(int a[][], int i, int j, int n, int m) {

        for (int k = 0; k < i; k++) {
            if (a[k][j] == 1) {
                return false;
            }
        }

        for (int k = i, l = j; k >= 0 && l >= 0; k--, l--) {
            if (a[k][l] == 1) {
                return false;
            }
        }

        for (int k = i, l = j; k >= 0 && l < n; k--, l++) {
            if (a[k][l] == 1) {
                return false;
            }
        }

        return true;

    }

    public static boolean solve(int a[][], int i, int j, int n, int m) {
        if (i >= n) {
            return true;
        }

        for (int k = 0; k < n; k++) {
            if (isSafe(a, i, k, n, m)) {
                a[i][k] = 1;
                if (solve(a, i + 1, 0, n, m)) {
                    return true;
                }
                a[i][k] = 0;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        int a[][] = new int[n][m];


        if (solve(a, 0, 0, n, m)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }

    }
}