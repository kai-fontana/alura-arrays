public class PerishableProduct extends Product{
    //Specific attribute
    private final int expirationDate;

    //Constructor
    public PerishableProduct(String name, double price, int quantity, int expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nPrice: " + getPrice() + "\nQuantity: " + getQuantity() + "\nExpiration date: " + expirationDate;
    }

}
