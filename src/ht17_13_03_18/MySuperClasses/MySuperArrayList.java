package ht17_13_03_18.MySuperClasses;


public class MySuperArrayList <T> {
    private T[] array;
//    private int size;
    private int size;

    public MySuperArrayList() {
        array = (T[]) new Object[10];
//        size = 10;
        size = 0;
    }

    public MySuperArrayList(int size){
        array = (T[]) new Object[size];
//        this.size = size;
        this.size = 0;
    }

    public void add(T item){
        T[] newArray = (T[]) new Object[size + 1];
        int it = 0;
        for (T t : array) {
            newArray[it] = t;
        }
        newArray[size] = item;
        size = size + 1;
        array = newArray;
    }

    public T get(int number){
        if (number > size)
            return array[size];
        else if (number < 0)
            return array[0];
        return array[number];
    }

    @Override
    public String toString() {
        String s = "";
        for (T t : array) {
            s = s + t + " ";
        }
        return s;
    }
}
