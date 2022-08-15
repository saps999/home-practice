import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int count =1;
        while (count<=a) {
            System.out.println(count);
            count ++;
        }

    }
}
