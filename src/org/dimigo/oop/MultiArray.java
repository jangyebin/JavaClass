package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        String[][] strArr = new String[2][];
        strArr[0]= new String[3];
        strArr[1]= new String[2];
        strArr[0][0]= "C";
        strArr[0][1]="JAVA";
        strArr[0][2]="PHP";
        strArr[1][0]="C#";
        strArr[1][1]="Python";

        String[][] strArr2 = {{"C","JAVA","PHP"},{"C#","Python"}};

        String[][] strArr3 = new String[][]{{"C","JAVA","PHP"},{"C#","Python"}};

        String[][] strArr4 = {new String[]{"C","JAVA","PHP"},new String[]{"C#","Python"}};

        String[][] strArr5 = new String[][]{new String[]{"C","JAVA","PHP"},new String[]{"C#","Python"}};

        printArray(strArr);

    }

    private static void printArray(int[][] intArr) {
        for(int[] Value : intArr) {
            for (int Value2 : Value) {
                System.out.print(Value2 + " | ");
            }
            System.out.println();
        }

    }
    private static void printArray(String[][] strArr) {
        for(String[] Value : strArr) {
            for (String Value2 : Value) {
                System.out.print(Value2 + " | ");
            }
            System.out.println();
        }

    }

}
