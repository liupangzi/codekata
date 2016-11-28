import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextLong(), m = stdin.nextLong(), a = stdin.nextLong();
        System.out.println(((n + a - 1) / a) * (m + a - 1) / a);
    }
}
