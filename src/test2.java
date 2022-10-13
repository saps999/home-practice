class Base1{
    int x;
    Base1(int x){
        x = this.x;
    }
}

class Derived1 extends Base1{
   int y;
    Derived1(int x, int y){
        super(x);
        y=this.y;
    }
}

class ChildOfDerived extends  Derived1{
    int z;
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        int sum =x+y+z;
        System.out.println(sum);
    }
}
public class test2 {
    public static void main(String[] args) {
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}
