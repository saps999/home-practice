public class demo4545 {
    public void foo(){
        System.out.println("Suchendra");
    }
    public void foo(int a){
        System.out.println("Saptarshi");
    }
    public void foo(int a, int b){
        System.out.println("Pallavi");
    }
    public static void main(String[] args) {
       demo4545 dm =new demo4545();

       dm.foo(1);
       dm.foo(1,2);
        dm.foo();
    }
}
