public class Product {
    //Attributes
    private String name;
    private double price;
    private int quantity;

    //Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Get and set

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Método toString
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}
