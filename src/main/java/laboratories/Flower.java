package laboratories;

public class Flower {
    private int price;
    private FlowerColor color;
    private double sepalLength;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color.getCode();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }
}
