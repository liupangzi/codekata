import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String pointA[] = stdin.readLine().split(" ");
        String pointB[] = stdin.readLine().split(" ");
        String pointC[] = stdin.readLine().split(" ");

        double Ax = Double.parseDouble(pointA[0]), Ay = Double.parseDouble(pointA[1]);
        double Bx = Double.parseDouble(pointB[0]), By = Double.parseDouble(pointB[1]);
        double Cx = Double.parseDouble(pointC[0]), Cy = Double.parseDouble(pointC[1]);

        double a = Math.sqrt((Bx - Cx) * (Bx - Cx) + (By - Cy) * (By - Cy));
        double b = Math.sqrt((Ax - Cx) * (Ax - Cx) + (Ay - Cy) * (Ay - Cy));
        double c = Math.sqrt((Ax - Bx) * (Ax - Bx) + (Ay - By) * (Ay - By));

        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double R = a * b * c / (4 * S);

        double alpha = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double beta = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double gamma = Math.PI - alpha - beta;
        long n = Math.round(Math.PI / gcd(beta, gcd(alpha, gamma)));

        PrintWriter stdout = new PrintWriter(System.out);
        stdout.println(R * R * Math.sin(2 * Math.PI / n) * n / 2);
        stdout.close();
    }

    private static double gcd(double a, double b) {
        if (a < b) return gcd(b, a);
        if (Math.abs(b) < 0.001) {
            return a;
        } else {
            return (gcd(b, a - Math.floor(a / b) * b));
        }
    }
}
