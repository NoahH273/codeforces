import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            String[] stones = in.readLine().split(" ");
            long a = Long.parseLong(stones[0]);
            long b = Long.parseLong(stones[1]);
            long c = Long.parseLong(stones[2]);
            if (a >= b || b - a < a + c - b) {
                System.out.println(a + c - b);
            } else {
                System.out.println(b - a);
            }
        }
    }
    
}
