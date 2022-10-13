interface I1 {
    void greet(); // public abstract
}

interface I2 {
    void farewell();
}

class test implements I1, I2 { // multiple inheritance.
    public void greet() {
        System.out.println("Good Morning.");
    }

    public void farewell() {
        System.out.println("Good Bye.");
    }
}

public class Interface {
    public static void main(String[] args) {


        test t = new test();
        t.greet();
        t.farewell();
    }
}
