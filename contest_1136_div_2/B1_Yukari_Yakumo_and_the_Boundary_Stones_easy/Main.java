import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int[] counts = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = counts[0];
            int y = counts[1];
            int m = counts[2];
            String s = in.readLine();

            int maxStones = x + y;

            for (int i = 0; i < m; i++) {
                char c = s.charAt(i);
                if (c == '-') {
                    if (y > 1) {
                        y--;
                        x++;
                    } else if (x >= 1) {
                        x--;
                    } else if (y == 1) {
                        y--;
                        x++;
                    } else {
                        break;
                    }
                } else {
                    if (y >= 1) {
                        y++;
                    } else if (x >= 1) {
                        x--;
                        y++;
                    } else {
                        break;
                    }
                }
                int stones = x + y;
                maxStones = Math.max(stones, maxStones);
            }
            System.out.println(maxStones);
        }
    }
}