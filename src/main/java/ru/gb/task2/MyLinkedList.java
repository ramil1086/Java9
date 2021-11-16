package ru.gb.task2;

import java.util.LinkedList;

public class MyLinkedList<T> {

    private int size = 0;
    Node<T> first;
    Node<T> last;

    private static class Node<T> {
        T item;
        MyLinkedList.Node<T> next;
        MyLinkedList.Node<T> prev;

        Node(MyLinkedList.Node<T> prev, T element, MyLinkedList.Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() {
        return size;
    }

    public boolean add(T e) {
        linkLast(e);
        return true;
    }

    private void linkLast(T e) {
        final MyLinkedList.Node<T> l = last;
        final MyLinkedList.Node<T> newNode = new Node<T>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }


    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("abs");
        list.add("bsk");
        System.out.println(list.size);
    }
}
