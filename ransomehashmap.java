import java.util.*;
public class ransomehashmap
{

    public static boolean find(char[] a1, char[] a2)
    {
        int n = a1.length;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(a1.length <= a2.length)
        {

            for (int i = 0; i < n; i++)
            {
                if (map.containsKey(a1[i]))
                {
                    map.put(a1[i], map.get(a1[i]) + 1);
                } else
                {
                    map.put(a1[i], 1);
                }
            }

            for (int i = 0; i < n; i++)
            {
                if (map.containsKey(a2[i]))
                {
                    if (map.get(a2[i]) == 1)
                    {
                        map.remove(a2[i]);
                    } else
                    {
                        map.put(a2[i], map.get(a2[i]) - 1);
                    }
                }

            }
        }
        else
            {
                System.out.println("not ransome");
                return false;
            }


        return true;


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            System.out.println(find(a1, a2));

        sc.close();
    }
}