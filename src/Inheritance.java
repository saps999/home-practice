class parent {
    public int x;

    public int getX() {
        return x;
    }

    parent(int x) {
        this.x = x;
    }
}

class child extends parent {
    public int y;

    child(int x, int y) {
        super(x);
        int sum = x + y;
        System.out.println(sum);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        child ch = new child(10, 13);
    }
}
