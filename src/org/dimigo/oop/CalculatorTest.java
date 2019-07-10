package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        Calculator calc1 = new Calculator(i1,i2);

        System.out.println(i1+" + "+i2+" = "+calc1.add());
        System.out.println(i1+" - "+i2+" = "+calc1.sub());
        System.out.println(i1+" * "+i2+" = "+calc1.mul());
        System.out.println(i1+" / "+i2+" = "+calc1.div());
        calc1.powerOff();
    }
}
