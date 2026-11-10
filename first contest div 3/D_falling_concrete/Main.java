import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int n = Integer.parseInt(in.readLine());
            String [] strHeights = in.readLine().split(" ");
            int[] heights = Arrays.stream(strHeights)
                               .mapToInt(Integer::parseInt)
                               .toArray();
            Integer[] invariants = new Integer[n];
            for (int i = 0; i < heights.length; i++) {
                invariants[i] = heights[i] - i;
            }

            Set<Integer> sequences = new HashSet<>(Arrays.asList(invariants));
            int maxSequence = 0;
            for (int x : sequences) {
                if (sequences.contains(x - 1)) {
                    continue;
                }
                int len = 1;
                while (sequences.contains(x + 1)) {
                    len++;
                    x++;
                }
                maxSequence = Math.max(maxSequence, len);
            }
            System.out.println(maxSequence);
            
        }
    }
}