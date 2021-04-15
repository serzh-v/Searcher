package com.mycompany.searcher;

/**
 *класс, в котором задается массив из людей и пишутся запросы
 */
public class Main {
    static final int PERSONS_TOTAL = 4;
    public static void main(String [] args) {
        System.out.println("Проверка сёрчера");
        Person [] persons = new Person [PERSONS_TOTAL];
        Address [] addresses = new Address[PERSONS_TOTAL - 1];
        addresses[0] = new Address("Россия", "Москва", "Ленина", "7");
        addresses[1] = new Address("США", "Вашингтон", "Сталина", "77");
        addresses[2] = new Address("Канада", "Оттава", "Палмстрит", "777");
        persons[0] = new Person("Василий", "Теркин", addresses[0], 1923);
        persons[1] = new Person("Василиса", "Тренина", addresses[1], 1971);
        persons[2] = new Person("Герман", "Блэк", addresses[2], 1980);
        persons[3] = new Person("Джон", "Смит", addresses[1], 2001);
        
        Searcher searcher = new Searcher(persons);
        Person pResult;
        Person[] paResult;
        
        pResult = searcher.adressCountrySearch("Россия");
        System.out.println(pResult.surname);
        System.out.println(pResult.adress.city);
           
    }
}
