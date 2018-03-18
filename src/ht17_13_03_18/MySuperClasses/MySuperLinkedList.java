package ht17_13_03_18.MySuperClasses;

public class MySuperLinkedList<T> {
    private int size;
    private Node<T> current;
    private Node<T> prev;
    private Node<T> next;

    public MySuperLinkedList() {
        current = null;
        prev = null;
        next = null;
        size = 0;
    }

    public void add(Node<T> item){
        prev = current;
        current = item;
        next = null;
    }

}
