import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            String[] counts = in.readLine().split(" ");
            int rock = Integer.parseInt(counts[0]);
            int sciscors = Integer.parseInt(counts[1]);
            int paper = Integer.parseInt(counts[2]);
            int rounds = rock + paper + sciscors;

            int max_shape = Math.max(Math.max(rock, paper), sciscors);

            if (max_shape == rock) {
                System.out.println("P".repeat(rounds));
            } else if (max_shape == paper) {
                System.out.println("S".repeat(rounds));
            } else {
                System.out.println("R".repeat(rounds));
            }


        }
    }
}