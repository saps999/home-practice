import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(1,6);
        l1.add(0,5);

        l2.add(16);
        l2.add(17);
        l2.add(14);
        l2.add(56);
        l2.add(15);

        l1.addAll(0,l2);

        System.out.println(l1.contains(15));
        System.out.println(l1.contains(20));
        System.out.println(l1.indexOf(15));
       // System.out.println(l1.remove(2));
        // l1.clear();
        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");

        }
        l1.set(1,59);
        System.out.println(" ");

        for (int i = 0; i <l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");
        }

    }
}
