package STACK;
import java.util.*;

public class sum{

    public static int countsum(int max, int[] a, int[] b) {
        return helper(max, a, b, 0, 0);
    }

    public static int helper(int max, int[] a, int[] b, int count, int sum) {
        // Stop if sum exceeds max
        if (sum > max) {
            return count - 1;
        }

        int ans = count;

        // Take from a if possible
        if (a.length > 0) {
            ans = Math.max(ans,
                    helper(max,
                            Arrays.copyOfRange(a, 1, a.length),
                            b,
                            count + 1,
                            sum + a[0]));
        }

        // Take from b if possible
        if (b.length > 0) {
            ans = Math.max(ans,
                    helper(max,
                            a,
                            Arrays.copyOfRange(b, 1, b.length),
                            count + 1,
                            sum + b[0]));
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(countsum(10, a, b)); // Output: 4
    }
}
