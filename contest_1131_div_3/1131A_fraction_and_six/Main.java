import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            String[] lengths = in.readLine().split(" ");
            int pLen = Integer.parseInt(lengths[0]);
            int qLen = Integer.parseInt(lengths[1]);
            String p = in.readLine();
            String q = in.readLine();

            Map<Character, Integer> counts = new HashMap<>();
            for (int i = 0; i < pLen; i++) {
                char c = p.charAt(i);
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < qLen; i++) {
                char c = q.charAt(i);
                counts.put(c, counts.getOrDefault(c, 0) - 1);
                if (counts.get(c) == 0) {
                    counts.remove(c);
                }
            }

            Map<Character, Integer> valid = Map.of('s', 1, 'i', 1, 'x', 1);

            if (valid.equals(counts)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}