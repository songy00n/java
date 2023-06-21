package org.example;

public class Child extends Parent {
    String dept="컴퓨터공학과";

    void  dept(){
        System.out.println(name+""+dept);
    }

    @Override
    void printAll(){
    // 자식이 부모의 미완성된 설계도를 완성시켜야함
    // 강제로 override(재정의)해야함
        
    }

}
