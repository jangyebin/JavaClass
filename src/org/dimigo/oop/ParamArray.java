package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr ={1,2,3,4,5};
        add(intArr,10);
        printArray(intArr);

        String[] names = {"홍길동","홍길서","홍길남","홍길북"};
        changeName(names);
        printArray(names);
    }
    public static void changeName(String[] names){
        for(int i=0;i<names.length;i++){
            names[i]="김"+names[i].substring(1);
        }
    }
    public static void add(int[] intArr,int num){
        for(int i=0; i<intArr.length;i++)
            intArr[i]+=num;
    }
    public static void printArray(int[] intArr){
        for(int value : intArr)
            System.out.print(value+" | ");
    }
    public static void printArray(String[] names){
        for(String value : names)
            System.out.print(value+" | ");
    }


}
