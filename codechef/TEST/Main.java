import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String tmp;
        while (!(tmp = stdin.nextLine()).equals("42")) {
            System.out.println(tmp);
        }
    }
}
