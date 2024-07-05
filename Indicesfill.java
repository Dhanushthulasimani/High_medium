import java.util.*;

public class Indicesfill
{
    public static void find(int a[], int n, int x)
    {
        if(n == a.length)
        {
            return;
        }
        if(a[n] == x)
        {
            System.out.println(n);
        }
        find(a, n+1, x);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String st = s.nextLine();
        int x = s.nextInt();

        String sc[] = st.split(" ");
        int n = sc.length;

        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = Integer.parseInt(sc[i]);
        }

        find(a, 0, x);
    }
}
