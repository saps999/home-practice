import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack st =new Stack<>();
        st.push(21);
        st.push(22);
        st.push(20);

        System.out.println(st);
        //st.push(20);
        st.pop();

        System.out.println(st.peek());
    }
}
