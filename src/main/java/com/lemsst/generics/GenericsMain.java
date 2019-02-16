package com.lemsst.generics;

public class GenericsMain {

    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<Integer>();
        box.set(123);
        System.out.println("Integer: " + box.get());
    }
}
