package com.mycompany.searcher;

/**
 *класс задающий представление о параметрах, которыми обладает человек
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
