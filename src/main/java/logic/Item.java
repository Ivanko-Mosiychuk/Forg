package logic;

public class Item {
    private Double price;
    private boolean available;
    private int remainder;

    public Item(Double price, boolean available, int remainder) {
        this.price = price;
        this.available = available;
        this.remainder = remainder;
    }
}
