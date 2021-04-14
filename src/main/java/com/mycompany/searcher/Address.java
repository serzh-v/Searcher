/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.searcher;

/**
 *
 * @author Dell
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
