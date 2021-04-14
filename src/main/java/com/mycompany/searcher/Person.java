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
public class Person {
    public String name;
    public String surname;
    public Address adress;
    public int birthYear;
      
    public Person(String name, String surname, Address adress, int birthYear){
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.birthYear = birthYear;
    } 
}
