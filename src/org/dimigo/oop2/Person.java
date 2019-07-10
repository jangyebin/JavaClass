package org.dimigo.oop2;



public class Person {
    //private final String type = "포유류";
    private final String birthdate;
    private String name;

    public static final String TYPE = "포유류";

    public Person(String birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020817","허준혁");
        Person p2 = new Person("20020129","장예빈");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.TYPE);

    }
}
