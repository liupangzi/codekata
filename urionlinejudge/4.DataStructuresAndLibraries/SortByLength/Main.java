import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out);

        int count = Integer.valueOf(stdin.readLine());
        while (count-- > 0) {
            String[] tmp = stdin.readLine().split(" ");
            int[][] cache = new int[tmp.length][2];
            for (int i = 0; i < tmp.length; i++) cache[i] = new int[]{tmp[i].length(), i};

            Arrays.sort(cache, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
                }
            });

            int j = 0;
            while (j < tmp.length - 1) stdout.print(tmp[cache[j++][1]] + " ");
            stdout.println(tmp[cache[j][1]]);
        }

        stdout.close();
    }
}
