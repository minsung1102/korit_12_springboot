package test01.test05;

public class OutOfStockException extends Exception {
    public OutOfStockException() {
        super("재고 부족 : ");
    }
    public OutOfStockException(String message) {
        super(message);
    }
}
