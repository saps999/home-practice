import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
       /* System.out.println(array.length);
        System.out.println(array[2]);
        for (int i = array.length -1 ; i >=0; i--) {
            System.out.println(array[i]);*/
        /*for (int element:array) {
            System.out.println(element);
        }*//*
        int [] array = {5,10,4,9,5};*/
        String s1="LISTEN";
        String s2="SILENT";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c2);
        System.out.println(c1);
        int temp=0;
        for (int i = 0; i <c1.length ; i++) {
            if (c1[i]!=c2[i]){
                temp+=1;
            }
        }
        if (temp==0){
            System.out.println("Anagram");
        }else System.out.println("not");
        }
    }

