import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Person's object
        Person person01 = new Person("Ana", 16);
        Person person02 = new Person("Kai", 20);
        Person person03 = new Person("Enzo", 54);
        Person person04 = new Person("Rafael", 48);

        //Creates the list of products
        ArrayList<Person> listOfPeople = new ArrayList<>();

        //Add to the list
        listOfPeople.add(0, person01);
        listOfPeople.add(1, person02);
        listOfPeople.add(2, person03);
        listOfPeople.add(3, person04);

        System.out.println("List's size: " + listOfPeople.size());
        System.out.println("\nFirst person: " + listOfPeople.get(0));
        System.out.println("\nFull list: " + listOfPeople.toString());

        //Product's objects
        Product product01 = new Product("Desk",
                39.99, 4);
        Product product02 = new Product("Glass", 5.50, 2);
        Product product03 = new Product("Pillow", 16.99, 6);
        Product product04 = new Product("Chair", 21.00, 8);
        Product product05 = new Product("Plate", 12.99, 12);

        //Perishable product
        PerishableProduct perishableProduct01 = new PerishableProduct("Meat", 10.00, 2, 2024);

        //Creates the list of products
        ArrayList<Product> listOfProducts = new ArrayList<>();

        //Add to the list
        listOfProducts.add(0, product01);
        listOfProducts.add(1, product02);
        listOfProducts.add(2, product03);
        listOfProducts.add(3, product04);
        listOfProducts.add(4, product05);
        listOfProducts.add(5, perishableProduct01);

        System.out.println("Full list: " + listOfProducts.toString());

    }
}