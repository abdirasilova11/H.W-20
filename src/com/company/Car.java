package com.company;

import javax.naming.InvalidNameException;

public class Car {

    private String name;
    private int year;

    public Car() {
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
    if (name.matches("[a-zA-Z-а-яА-Я]*")){
        this.name = name;
    } else {
        throw new InvalidNameException("");
    }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0){
            this.year = year;
        } else { throw  new InvalidYearException("Машинанын жылы 0 болушу мумкун эмес");

        }


    }

    public void close() throws Exception{
        System.out.println("Машина жабылып жатат.");
    }
public void drive(){
    System.out.println("Машина журуп жатат.");
}

}
