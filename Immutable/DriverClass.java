package Immutable;

public class DriverClass {

    public static void main(String[] args) {

        Address address = new Address();
        address.setAirport("BOM");
        address.setCity("MUMBAI");
        address.setCountry("INDIA");

        Employee employee = new Employee("Deep", "25", address);
        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getAddress().getAirport());

        employee.getAddress().setAirport("LHR");

        System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getAddress().getAirport());
    }
}
