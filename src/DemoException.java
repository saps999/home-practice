public class DemoException {
    /*public static void main(String[] args) throws java.lang.Exception {
        int a = 10, b = 0, c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            throw new ExceptionHandeling(e, "Arithmetic Exception, Please enter valid number.");
        }
    }*/
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = 0;
        try {
            result = a - b;
            System.out.println("Result minus = " + result);
            result = a / b;
            System.out.println("Result divide = " + result);
            result = a + b;
            System.out.println("Result plus = " + result);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
            throw new UserNotFoundException("User not found in db");

        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("finally");
        }

        System.out.println("Result = " + result);
    }
}
