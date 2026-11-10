import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for (int _t = 0; _t < t; _t++) {
            int len = Integer.parseInt(in.readLine());
            int[] nums = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Map<Integer, Integer> counts = new HashMap<>();
            for (int i = 0; i < len; i++) {
                counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            }

            int[] unique = Arrays.stream(counts.keySet().toArray()).mapToInt(obj -> (int) obj).toArray();
            Arrays.sort(unique);


            int left = 1;
            int right = unique.length - 2;
            int minCount = counts.get(unique[0]);
            int maxCount = counts.get(unique[unique.length - 1]);
            int cost = 0;
            int leftShift = 0;
            int rightShift = 0;

            while (left <= right + 1) {
                if (minCount <= maxCount) {
                    int iterations = unique[left] - leftShift - unique[0];
                    leftShift += iterations;
                    cost += minCount * iterations;
                    minCount += counts.get(unique[left]);
                    left++;
                } else {
                    int iterations = unique[unique.length - 1] - rightShift - unique[right];
                    cost += maxCount * iterations;
                    rightShift += iterations;
                    maxCount += counts.get(unique[right]);
                    right--;
                }
            }

            int ops = unique[unique.length - 1] - unique[0];

            System.out.println(cost + " " + ops);

        }
    }
}