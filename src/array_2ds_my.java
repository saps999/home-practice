import java.util.Scanner;

public class array_2ds_my {
    public static void main(String[] args) {
        int [][] array =new int[2][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Creating array of 2 Rows and 3 Columns.");
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int d = sc.nextInt();
        System.out.print("Enter 5th number: ");
        int e = sc.nextInt();
        System.out.print("Enter 6th number: ");
        int f = sc.nextInt();
        array[0][0]=a;
        array[0][1]=b;
        array[0][2]=c;
        array[1][0]=d;
        array[1][1]=e;
        array[1][2]=f;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
