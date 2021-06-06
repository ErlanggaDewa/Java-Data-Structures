package com.jurnal08;

public class Main {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arrayData = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};

        System.out.print("Sebelum HeapSort : ");
        heapSort.print(arrayData);

        heapSort.sort(arrayData);
        System.out.print("\n\nSesudah HeapSort : ");
        heapSort.print(arrayData);
    }
}
