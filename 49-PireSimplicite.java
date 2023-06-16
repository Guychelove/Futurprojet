import java.util.*;

public class PireSimplicite {
    public static List<String> a(String b, List<Character> c) {
        List<String> d = new ArrayList<>();
        List<String> e = new ArrayList<>();
        int f = 0;
        int g = 0;
        for (int h = 0; h < b.length(); h++) {
            char i = b.charAt(h);
            if (i == ' ') {
                if (g > f) {
                    String j = b.substring(f, g);
                    char k = j.charAt(0);
                    if (c.contains(k)) {
                        d.add(j);
                    } else {
                        e.add(j);
                    }
                }
                f = h + 1;
                g = h + 1;
            } else {
                g++;
            }
        }
        if (g > f) {
            String j = b.substring(f, g);
            char k = j.charAt(0);
            if (c.contains(k)) {
                d.add(j);
            } else {
                e.add(j);
            }
        }
        d.addAll(e);
        return d;
    }

    public static void main(String[] args) {
        String b = "Hello world Java code";
        List<Character> c = List.of('J', 'w', 'c', 'H', 'l', 'o', 'd', 'a', 'v', 'e', 'r');
        List<String> d = a(b, c);
        for (String j : d) {
            System.out.println(j);
        }
    }
}

