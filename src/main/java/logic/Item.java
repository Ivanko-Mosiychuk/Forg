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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }
}
