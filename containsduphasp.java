import java.util.HashMap;

public class containsduphasp {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hp= new HashMap<>();
        hp.put("o",1);
        hp.put("t",2);
        hp.put("th",3);
        hp.put("f",4);
        System.out.println(hp);
        hp.remove("th");
        int a=hp.get("f");
        System.out.println(a);
        System.out.println(hp.containsKey("th"));
        System.out.println(hp.containsKey("t"));


    }
}
