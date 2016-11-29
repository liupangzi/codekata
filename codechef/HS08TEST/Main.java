import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int withdraw = stdin.nextInt();
        float account = stdin.nextFloat();
        if ((float) withdraw + 0.5 <= account && withdraw % 5 == 0) {
            System.out.printf("%.2f\n", account - (float) withdraw - 0.5);
        } else {
            System.out.printf("%.2f\n", account);
        }
    }
}
