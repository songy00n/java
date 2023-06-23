package org.example;

public class Arrays {

    public static void main(String[] args){

        int[] scores = {99,97,98};
        Arrays.sort(scores);

        for(int i:scores){
            System.out.print(i+"");
        }
        System.out.println();

        String[] names={"홍길동","강감찬","이순신"};
        Arrays.sort(names);
        for(String name:names){
            System.out.print(name+"");
        }

    }

}
