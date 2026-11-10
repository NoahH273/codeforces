import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int n = Integer.parseInt(in.readLine());
            String[] solvers = in.readLine().split(" ");
            int a1 = Integer.parseInt(solvers[0]);
            int a2 = Integer.parseInt(solvers[1]);
            int a3 = Integer.parseInt(solvers[2]);
            int weak_participants = n - Math.min(Math.min(a1, a2), a3);
            System.out.println(weak_participants);
        }
    }
    
}
