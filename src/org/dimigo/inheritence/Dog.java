package org.dimigo.inheritence;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void wag(){
        System.out.println(name+"이 고리를 흔든다.");
    }
}
