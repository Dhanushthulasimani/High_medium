import java.util.HashSet;
import java.util.Set;

public class unique_first_element {
    public static String find(String input) {
        Set<Character> once = new HashSet<>();
        Set<Character> mul = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (mul.contains(c)) {
                continue;
            }

            if (once.contains(c)) {
                once.remove(c);
                mul.add(c);
            } else {
                once.add(c);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (once.contains(c)) {
                return String.valueOf(c);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String input = "abcxchbag";
        System.out.println(find(input));
    }
}
