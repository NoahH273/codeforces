import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int[] line1 = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = line1[0];
            int x = line1[1];
            int[] hits = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).map(y -> (int) Math.ceil((double) y / x)).toArray();
            Arrays.sort(hits);
            int totalHits = 0;
            int killable = 0;
            int spells = 0;
            
            for (int i = 0; i < n - 1; i++) {
                int hitsNeeded = hits[i] - totalHits - 1; // to get yukai 1 shot
                totalHits += hitsNeeded;
                int killed = Math.min(hitsNeeded, killable);
                killable -= killed;
                spells += hitsNeeded - killed;
                killable++;
            }

            System.out.println(spells);
        }
    }
}