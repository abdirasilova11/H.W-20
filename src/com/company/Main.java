package com.company;

import javax.naming.InvalidNameException;
import java.io.IOException;

public class Main {
    /*Try with resources-те колдоно ала турган Car деген класс тузунуз
    close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
    try unchecked exceptionдарды кармап аларды игнор кылыш керек.
    main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек

 */

    public static void main(String[] args) throws RuntimeException {
try {
    Car car = new Car("Mers",2020);
    car.drive();
    System.out.println("Name cars:" + car.getName() + " year cars:" + car.getYear());
    car.close();
} catch (InvalidYearException e){
    System.err.println(e.getMessage());
}catch (Exception e1){
    e1.printStackTrace();
} finally {

}

    }
}
