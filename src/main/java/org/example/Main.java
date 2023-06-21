package org.example;

public class Main {

    int field1 = 10;
    Main() {System.out.println("기본생성자, 생성자를 쓰지 않으면 자동으로 생성됨");}
    Main(int a, int b) {System.out.println("명시적 생성자");};

    public static void main(String[] args)
    {
        Main main = new Main();
        int result = main.sum(10,20);
        System.out.println(result);

        Main main2 = new Main(100,200);
    }

    int sum(int n1, int n2){
        return n1+n2;
    }
}