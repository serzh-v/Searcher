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
public class Searcher {
    public Person[] persons;
    
    public Searcher(Person[] persons){
        this.persons = persons;
    }
    
    public Person surnameSearch(String surname){
        for (Person p: persons){
            if (surname.equals(p.surname)){
                return p;
            }
        } 
        return null;
    }
    
    /**
     * Метод производящий
     * @param country
     * @return 
     */
    public Person adressCountrySearch(String country){
        for (Person p: persons){
            if (country.equals(p.adress.country)){
                return p;
            }
        } 
        return null;
    }
    
    public Person adressCitySearch(String country, String city, String street){
        for (Person p: persons){
            if (
                    country.equals(p.adress.country) &&
                    city.equals(p.adress.city) &&
                    street.equals(p.adress.street) 
                    ){
                return p;
            }
        } 
        return null;
    }
    
    public Person adressStreetSearch(String country, String city){
        for (Person p: persons){
            if (
                    country.equals(p.adress.country) &&
                    city.equals(p.adress.city)
                    ){
                return p;
            }
        } 
        return null;
    }

    public Person[] sameStreetSearch(String country, String city, String street){
        Person [] pf = new Person[persons.length];
        int pfi = 0;
        for (Person p: persons){
            if (
                    country.equals(p.adress.country) &&
                    city.equals(p.adress.city) &&
                    street.equals(p.adress.street) 
                    ){
                pf[pfi++] = p;
            }
        } 
        if (pfi == 0) {
            return null;
        }
        Person [] pfResult = new Person[pfi];
        for (int i = 0; i < pfi; i++) {
            pfResult[i]=pf[i];
        }
        return pfResult;
    }
    
    public Person yougestSearch(){
        Person result = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].birthYear > result.birthYear) {
                result = persons[i];
            }
        }
        return result;
    }
    
    public Person oldestSearch(){
        Person result = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].birthYear < result.birthYear) {
                result = persons[i];
            }
        }
        return result;
    }
    
    public Person [] inBetweenSearch(int fromYear, int toYear){
        Person [] pf = new Person[persons.length];
        int pfi = 0;
        for (Person p: persons){
            if (
                    (p.birthYear >= fromYear) &&
                    (p.birthYear <= toYear)
                    ){
                pf[pfi++] = p;
            }
        } 
        if (pfi == 0) {
            return null;
        }
        Person [] pfResult = new Person[pfi];
        for (int i = 0; i < pfi; i++) {
            pfResult[i]=pf[i];
        }
        return pfResult;
    }
    
}
