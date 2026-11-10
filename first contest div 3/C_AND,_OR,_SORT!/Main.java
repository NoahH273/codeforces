import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int n = Integer.parseInt(in.readLine());
            String s = in.readLine();
            if (s.charAt(0) == '1') {
                int ops = 0;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        ops++;
                    }
                }
                System.out.println(ops);
                continue;
            }
            int[] postZeroes = new int[n];
            int zeroes = 0;
            for (int i = n - 1; i >= 0; i--) {  
                if (s.charAt(i) == '0') {
                    zeroes++;
                }
                postZeroes[i] = zeroes;
            }

            int ones = 0;
            int minOps = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '1') {
                    int ops = postZeroes[i] + ones;
                    minOps = Math.min(minOps, ops);
                    if (minOps == 0) {
                        break;
                    }
                    ones++;
                }
            }
            minOps = Math.min(minOps, ones);
            System.out.println(minOps);
        }

    }
}