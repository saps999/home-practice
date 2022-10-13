class FindMaximum<T extends Comparable<T>> {
    T a, b, c, d, e;

    FindMaximum(T a, T b, T c, T d, T e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static <T extends Comparable<T>> void findMaximum(T a, T b, T c, T d, T e) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (d.compareTo(max) > 0) {
            max = d;
        }
        if (e.compareTo(max) > 0) {
            max = e;
        }
        System.out.println("Maximum number is: " + max);
    }

    public void testMaximum() {
        FindMaximum.findMaximum(a, b, c, d, e);
    }

}


public class Generics {
    public static void main(String[] args) {
        new FindMaximum<>(10, 20, 30, 40, 50).testMaximum();
        new FindMaximum<>(3.5, 5.6, 3.9, 6.5, 2.6).testMaximum();
        new FindMaximum<>("Apple", "Peach", "Banana", "Mango", "Watermelon").testMaximum();
    }
}
