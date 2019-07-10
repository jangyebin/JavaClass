package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("우라칸"),
                new Car("아벤타도르"),
                new Car("베네노")
        };
        Car.setCompany("람보르기니");

        for(Car car : cars)
            System.out.println(car);

        System.out.println(Integer.parseInt("100"));
        System.out.println(Math.abs(-123));
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
