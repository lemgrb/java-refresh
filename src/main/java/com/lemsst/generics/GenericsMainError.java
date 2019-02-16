package com.lemsst.generics;

public class GenericsMainError {

    public static void main(String[] args) {
        /**
         * java.lang.ClassCastException
         */
        Box box = new Box();
        box.setObject("Hello world");
        System.out.println((Integer) box.getObject());
    }

}
