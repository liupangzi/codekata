import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong(), m = cin.nextLong(), a = cin.nextLong();
        long nBlocks = (n + a - 1) / a, mBlocks = (m + a - 1) / a;
        System.out.println(nBlocks * mBlocks);
    }
}
