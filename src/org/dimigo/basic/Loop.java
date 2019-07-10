package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for 문
        //구구단 출력
        for(int a=2;a<10;a++) {
            for (int b = 1; b < 10; b++)
                System.out.printf("%d * %d = %d\t", a, b, a * b);
            System.out.println("\n");
        }

        //for-each 문
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);


        for(int value : arr)
            System.out.println(value);

        String[] BTS = {"슈가","제이홉","남준"};
        for(String a : BTS)
            System.out.println(a);

        //while, do~while
        Scanner scanner =new Scanner(System.in);
        int menu=0;
        do{
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데이");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");
            menu = scanner.nextInt();

            switch(menu){
                case 1:
                    System.out.println("ITZY를 선택하셨네요");
                    break;
                case 2:
                    System.out.println("빅뱅을 선택하셨네요");
                    break;
                case 3:
                    System.out.println("걸스데이를 선택하셨네요");
                    break;
                case 9:
                    System.out.println("Bye!!");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴네요");
            }

        }while(menu!=9);
    }
}
