import java.util.ArrayList;
import java.util.function.Consumer;

@FunctionalInterface
interface Demo{
    void meth1(int a,int b);
}
public class LambdaExp  {
    public static void main(String[] args) {
      /*  Demo obj =(a,b)->{System.out.println(a+b);};
        obj.meth1(6,7);*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Consumer<Integer> con =(number)->{System.out.println(number);};

       // list.forEach(con);

        list.forEach((name)->{System.out.println(name);});
    }
}
