
package ExceptionApp;

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            checkNumber(-10); 
        } catch (MyCustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }

    public static void checkNumber(int number) throws MyCustomException {
        if (number < 0) {
            throw new MyCustomException("Number cannot be negative: " + number);
        } else {
            System.out.println("Number is valid: " + number);
        }
    }
}
