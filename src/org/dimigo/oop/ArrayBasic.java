package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입
        //int, float, double, char, boolean, byte, short, long
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);

        int[] intArr2 = {1,2,3,4,5};
       // int[] intArr2 = new int[] {1,2,3,4,5};
        printArray(intArr2);


        double[] doubleArr = new double[5];

        printArray(doubleArr);

        String[] strArr = new String[3];

        printArray(strArr);

        strArr[0] = "박재민";
        strArr[1] = "김가은";
        strArr[2] = "문진호";
        printArray(strArr);

        String[] strArr2 = {"ITZY","소녀시대","걸스데이"};
        printArray(strArr2);


        Book[] book = new Book[2];
        book[0]= new Book("수학의 바이블","김재영",100);
        book[1]= new Book("워드마스터","전유원",200);
        printArray(book);

        Book[] book2 = {new Book("딥러닝","장예빈",300),
                new Book("간바레 KDH","소형빈",250)};
        printArray(book2);


        //배열 사용시 주의 사항
        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        //System.out.println(strArr3[0].length());

        Book[] book3 = new Book[3];
        System.out.println(book3[0]);
        //System.out.println(book3[0].getTitle());
    }

    private static void printArray(Book[] book) {
        for(Book value : book) {
            System.out.println(value);
        }
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr){
            System.out.print(value+" | ");
        }
        System.out.println();
    }
    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr){
            System.out.print(value+" | ");
        }
        System.out.println();
    }
    private static void printArray(String[] strArr) {
        for(String value : strArr){
            System.out.print(value+" | ");
        }
        System.out.println();
    }
}

