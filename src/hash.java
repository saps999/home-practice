import java.util.*;
//import java.lang.*;
//import java.io.*;

public class hash {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();
        hm.put(1,56);
        hm.put(2,57);
        hm.put(3,58);
        hm.put(4,59);
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
