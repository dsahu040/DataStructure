package Immutable;

public class Employee {

    private String name;
    private String age;
    private Address address;

    Employee(String name, String age, Address address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Address getAddress() {
        return (Address)address.clone();
    }
}
