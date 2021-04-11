package com.company;

import java.util.ArrayList;

public class GenArrayList<E> {
    private final ArrayList<E> list;

    public GenArrayList(int capacity) {

        this.list = new ArrayList<>(capacity);
    }

    public void addData(E mobil) {
        list.add(mobil);
    }


    public void display() {
        list.forEach(System.out::println);
    }

    public void removeData(int delData) {
        list.remove(delData-1);
    }
}
