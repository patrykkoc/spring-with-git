package pl.pk.springwithgit.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Address {

    private String city;
    private String street;
    private int flatNumber;

    public Address(String city, String street, int flatNumber) {
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
    }
}
