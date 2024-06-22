package it.ioprogrammatore.java.module.optional;

import java.util.Optional;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Person {
    private Optional<Address> address;

    public Person(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}

public class OptionalExample5 {

    public static void main(String[] args) {
        Address address = new Address("New York");
        Person personWithAddress = new Person(Optional.of(address));
        Person personWithoutAddress = new Person(Optional.empty());

        // Using Optional to handle the presence of Address in Person
        String city1 = personWithAddress.getAddress()
                .map(Address::getCity)
                .orElse("Unknown City");

        String city2 = personWithoutAddress.getAddress()
                .map(Address::getCity)
                .orElse("Unknown City");

        System.out.println("City of person with address: " + city1);
        System.out.println("City of person without address: " + city2);
    }
}

