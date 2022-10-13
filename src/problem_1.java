import java.util.Random;

public class problem_1 {
    public static void main(String[] args) {
       /* float[] array= {10.5f,2.6f,6.5f,6.8f,5.5f};
        float sum =0.0f;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);*/

        /*int[] array= {10,2,6,6,5};
        int a=7;
        int c=0;
        for (int i = 0; i < array.length; i++) {
           int b= array[i];
           if (b==a){
               c=c+1;
           }
        }
        if (c>0){
            System.out.println(a+" is present in the array");
        } else {
            System.out.println(a+" not present in the array");
        }*/
        /*char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        int couponNumber= random;
        StringBuffer sb=new StringBuffer();
        while (random>0)
        {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }
        String couponCode=sb.toString();
        System.out.print("Coupon Code: "+couponCode);
        System.out.print("Coupon number: "+couponNumber);*/


        String str = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i <= 10; i++) {
            char c = alphabet.charAt((r.nextInt(alphabet.length())));
            str = String.valueOf(c) + str;
        }

        System.out.println(str);
    }
}
