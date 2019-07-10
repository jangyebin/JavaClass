package org.dimigo.inheritence;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();   //Animal의 bark()

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.bark();   //Animal의 bark()
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();      //Cat의 bark()
        c.scrach();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();
    }
}
