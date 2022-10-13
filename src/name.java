import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int input1 = sc.nextInt();
        System.out.println(input1);
        System.out.println("enter a number: ");
        int input2 = sc.nextInt();
        System.out.println(input2);
        int output = input1 + input2;
        System.out.print(output);
        System.out.print("\n");
        System.out.print("okk");
    }
}
