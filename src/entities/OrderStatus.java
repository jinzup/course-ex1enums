package entities;

public enum OrderStatus{

    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int i;
    OrderStatus(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}