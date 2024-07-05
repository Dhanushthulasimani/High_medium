public class Countmoney {
    public static void find(int a[], int sum, int tot, int ans) {
        if (tot == sum) {
            System.out.print(ans + " ");
            return;
        }
        if (tot > sum) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            find(a, sum, tot + a[i], ans * 10 + a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int sum = 5;
        int ans = 0;
        int tot = 0;
        find(a, sum, tot, ans);
    }
}


