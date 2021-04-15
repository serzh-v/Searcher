package com.mycompany.searcher;

/**
 * класс задающий представление о том, как выглядит адрес человека
 */
public class Address {
    public String country;
    public String city;
    public String street;
    public String house;
    
    public Address(String country, String city, String street, String house){
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
