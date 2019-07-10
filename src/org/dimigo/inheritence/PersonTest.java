package org.dimigo.inheritence;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person("아이유",25,160,45);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s=new Student("장예빈",18,171,75,"172428");
        s.study();
        s.sleep();

        Teacher t=new Teacher("지은혜",28,165,50,"컴네");
        t.teach();
        t.doTask();
        t.eat();
        t.sleep();
    }
}
