package org.dimigo.oop;

public class BookTest2 {

    private static void compare(){
        int a=10;

        int b=a;
        System.out.println(a==b?"true":"false");

        Book book = new Book();
        Book book1 = book;

        System.out.println(book==book1?"true":"false");

        book.setTitle("수학의 바이블");
        System.out.println(book.getTitle());
        System.out.println(book1.getTitle());
    }

    public static void main(String[] args) {
        compare();
        System.out.println("-----------------------");

        int num = 5;

        methodA(num);
        System.out.println(num);
        System.out.println("-----------------------");

        Book book = new Book("Word Master");
        methodB(book);
        System.out.println(book.getTitle());
        System.out.println("-----------------------");

        methodC(book);
        System.out.println(book.getTitle());
        System.out.println("-----------------------");

        Book book1 = new Book("미생");
        System.out.println(book1.getTitle().length());


    }

    private static void methodC(Book book) {
        book.setTitle("생존코딩");
    }

    private static void methodB(Book book) {
        System.out.println(book.getTitle());
        book= new Book("자바를 잡아라");
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num);
    }
}
