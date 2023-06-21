package org.example;

public abstract class Parent {

    String name="부모";

    abstract void printAll(); // 추상메소드: {}이 없음
    // 추상메소드는 추상클래스에 있어야 함

    // 추상클래스는 추상메소드가 선택임 (없어도 상관없음)
    void pp(){}; // 일반클래스

}
