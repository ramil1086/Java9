package ru.gb.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 0;

    public MyArrayList(){
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T get(int index){
        isIndexExist(index);
        return array[index];
    }


    public boolean add(T value){
        if (size==0) this.array = (T[]) new Object[1];
        if (size == array.length){
            array = increaseCapacity();
        }
        array[size] = value;
        size++;
        return true;
    }

    private T [] increaseCapacity(){
        Object [] temp = new Object[(array.length * 2)];
        System.arraycopy(array, 0, temp, 0, array.length);
        return (T[]) temp;
    }

    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("No such index");
        }
        return index;
    }

    public T remove (int index){
        isIndexExist(index);
        T [] temp = array;
        array = (T[])new Object[temp.length-1];
        T value = temp[index];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, temp.length - index - 1);
        size--;
        return value;
    }

    public Integer size() {
        return size;
    }

    @Override
    public String toString(){
        T[] temp = (T[]) new Object[size];
        System.arraycopy(array, 0, temp, 0, size);
        return Arrays.toString(temp);
    }


    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("abs");
        list.add("bsd");
        list.add("dfg");
        list.remove(1);
        System.out.println(list.size());
        System.out.println( list.toString());

    }

}
