import java.util.*;

class mylinkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        //ml.addFirst(20);
        ll.addFirst(56);
        ll.addLast(70);
        ll.add(1, 30);


        // l1.add(2,30);

        System.out.println(ll);

        System.out.println(ll.indexOf(30));
        ll.add(2,40);
        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);

         // ll.remove(2);
        // ll.removeFirst();
       // ll.removeLast();
    }
}