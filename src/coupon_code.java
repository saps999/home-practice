import java.util.Random;
import java.util.Scanner;

public class coupon_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Coupon number: ");
        int d = sc.nextInt();
        String str = "";
        String e = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        String f = null;
        String g = null;
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= 10; j++) {
                char c = alphabet.charAt((r.nextInt(alphabet.length())));
                e = e + String.valueOf(c);
            }
            str = str + e;
        }
        System.out.println(str);
    }
}
