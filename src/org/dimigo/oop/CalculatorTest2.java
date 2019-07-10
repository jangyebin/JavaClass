package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        Calculator2 calc1 = new Calculator2();
        Calculator2 calc2 = new Calculator2();
        Calculator2 calc3 = new Calculator2();
        System.out.println(calc1.PI);
        System.out.println(calc2.PI);
        System.out.println(calc3.PI);


        System.out.println(i1+" + "+i2+" = "+Calculator2.add(i1,i2,calc1));
        System.out.println(i1+" - "+i2+" = "+Calculator2.sub(i1,i2,calc1));
        System.out.println(i1+" * "+i2+" = "+Calculator2.mul(i1,i2,calc1));
        System.out.println(i1+" / "+i2+" = "+Calculator2.div(i1,i2,calc1));
        calc1.powerOff();
    }
}
