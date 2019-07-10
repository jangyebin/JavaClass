package org.dimigo.oop;

public class Calculator {
    //인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator(){}

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //인스턴스 메소드
    public void powerOn(){
        if(!this.powerFlag) {
            System.out.println("전원을 켭니다.");
            this.powerFlag = true;
        }
    }
    public void powerOff(){
        if(this.powerFlag) {
            System.out.println("전원을 끕니다.");
            this.powerFlag = false;
        }
    }

    public int add(){
        this.powerOn();
        return this.num1 + this.num2;
    }
    public int sub(){
        this.powerOn();
        return this.num1 - this.num2;
    }
    public int mul(){
        this.powerOn();
        return this.num1 * this.num2;
    }
    public double div(){
        this.powerOn();
        return (double)this.num1 / this.num2;
    }
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        Calculator carc1 = new Calculator(i1,i2);

        System.out.println(i1+" + "+i2+" = "+carc1.add());
        System.out.println(i1+" - "+i2+" = "+carc1.sub());
        System.out.println(i1+" * "+i2+" = "+carc1.mul());
        System.out.println(i1+" / "+i2+" = "+carc1.div());
        carc1.powerOff();
    }

}
