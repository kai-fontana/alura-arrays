public class Person {
    //Attributes
    private String name;
    private int age;

    //Constructors
    public Person(String nome, int age) {
        this.name = nome;
        this.age = age;
    }

    //Get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
