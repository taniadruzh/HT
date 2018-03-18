package ht17_13_03_18;

import ht17_13_03_18.MySuperClasses.MySuperArrayList;

public class MyClassesRunner {
    public static void main(String[] args) {
        MySuperArrayList<Integer> my = new MySuperArrayList<>();
        my.add(5);
        my.add(7);
        System.out.println(my.toString());
        System.out.println(my.get(1));
    }
}
