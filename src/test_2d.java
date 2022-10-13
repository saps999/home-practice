import java.util.Scanner;

public class test_2d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter rows: ");
        int M = sc.nextInt();
        System.out.println("enter columns: ");
        int N = sc.nextInt();
        int[][] array=new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("enter number");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The following array created" );
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(array[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }

    }
}
