package org.example;

public class Cat extends Animal{
    int age = 2;

    void setAge(int  age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void printAll(){
        System.out.println(name + "" + age);
        System.out.println(getName());
    }
}
