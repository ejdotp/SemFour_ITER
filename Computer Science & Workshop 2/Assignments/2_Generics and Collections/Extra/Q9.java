//Q9. Write a Java code snippet that comprises of a Car class and a CarApp class. The Car class should define private fields for ModalNo(int), name(string) and stock(int). Define a parameterised constructor and override the compareTo method as public int compareTo(Car car) to sort the car on basis of the total number of stock. Create an ArrayList of Car objects and print the updated the sorted list.For example the list of sorted Car Objects 2013 creta 10; 2020 MG 13; 2018 Kia 20; 2017 Audi 45; 2015 BMW 55  

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>
{
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.stock, otherCar.stock);
    }

    @Override
    public String toString() {
        return modalNo + " " + name + " " + stock;
    }
}

class CarApp
{
    public static void main(String[] args)
    {
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car(2013, "creta", 10));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "Audi", 45));
        carList.add(new Car(2015, "BMW", 55));
        Collections.sort(carList);
        System.out.println("List of sorted Car Objects:");
        for (Car car : carList)
            System.out.println(car);
    }
}