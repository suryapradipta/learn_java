package tutorial05.exception;

public class NegativeNumException extends Exception {

    private int num;

    public NegativeNumException() {
        super("I don’t want a negative number!");
    }

    public NegativeNumException(String message) {
        super(message);
    }

    public NegativeNumException(int badNum) {
        super(badNum + " is not a positive number");
        num = badNum;
    }

    public int getNum() {
        return num;
    }
}
