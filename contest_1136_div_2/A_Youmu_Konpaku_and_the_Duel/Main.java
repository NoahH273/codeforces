import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int x = Integer.parseInt(in.readLine());
            int l = 1;
            int r = 1;
            int total = 1;

            while (total < x) {
                r++;
                total += r;
            }

            if (total > x) {
                while (total > x) {
                    total -= l;
                    l++;
                }
                
                if (total < x) {
                    l--;
                    total += l;
                }
            }

            while(r + 1 >= l + (l + 1) + (l + 2)) {
                r++;
                total += r;

                while (total > x) {
                    total -= l;
                    l++;
                }

                if (total < x) {
                    l--;
                    total += l;
                }
            }

            int stacks = r - 1;
            int attacks = r - l + 1;
            int moves = stacks + attacks;
            System.out.println("\n");
            System.out.println("r: " + r);
            System.out.println("l: " + l);
            System.out.println("total: " + total);
            System.out.println("x: " + x);
            System.out.println(moves);
        }
    }
}