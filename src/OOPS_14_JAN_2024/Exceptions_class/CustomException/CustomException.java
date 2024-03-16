package src.OOPS_14_JAN_2024.Exceptions_class.CustomException;

public class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
        System.out.println("If I got this, Custom Exception");
    }
}
