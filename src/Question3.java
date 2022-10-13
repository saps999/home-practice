import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Question3 {
    public static void main(String[] args) {
        Square sq =new Square();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        sq.side=sc.nextInt();
        System.out.println("Area: "+sq.area());
        System.out.println("Perimeter: "+sq.perimeter());
    }
}
