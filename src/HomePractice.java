import java.util.Scanner;

public class HomePractice {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        if (a<b){
            System.out.println(a + "<" + b);
        } else if (a>b) {
            System.out.println(a + ">" + b);
        } else {
            System.out.println(a + "=" + b);
        }
    }

}
