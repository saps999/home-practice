public class MyMapNode {
    String data;
    int frequency;
    MyMapNode next;

    public MyMapNode(String data) {
        this.data = data;
        this.frequency = +1;
        this.next = null;
    }
}
