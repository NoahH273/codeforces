
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] ars) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(b.readLine());
        if (w % 2 == 0 && w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}