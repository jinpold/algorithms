package basic;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Divide1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        n -= n % 100;

        while (true) {
            if (n % f != 0) {
                n++;
            } else {
                System.out.printf("%02d", n % 100);
                break;
            }
        }
    }
}
