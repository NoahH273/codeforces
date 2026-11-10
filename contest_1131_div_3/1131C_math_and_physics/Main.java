import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        // edge case: only one number > 0 and its on the edge of the array
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int len = Integer.parseInt(in.readLine());
            int[] weights = Arrays.stream(in.readLine().split(" ")).
                            mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(weights).sum();
            if (sum == len) {
                System.out.println("-1");
            } else if (sum - weights[0] - weights[len - 1] == len - 2) {
                System.out.println(weights[0] + weights[len - 1] - 1);
            } else {
                System.out.println(sum - 1);
            }
        }
    }
}