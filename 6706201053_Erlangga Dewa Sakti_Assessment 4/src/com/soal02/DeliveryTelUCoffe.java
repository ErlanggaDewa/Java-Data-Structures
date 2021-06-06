package com.soal02;

public class DeliveryTelUCoffe {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        String[][] arrayData = {
                {"Kategori 1", "4563", "Kopi Hitam"},
                {"Kategori 4", "9573", "Kopi Susu"},
                {"Kategori 1", "0573", "Coffe Latte"},
                {"Kategori 2", "2212", "Americano Coffe"},
                {"Kategori 3", "7753", "Moccachino Coffe"},
                {"Kategori 2", "9531", "Affogato Coffe"}
        };

        System.out.println("Sebelum HeapSort : ");
        heapSort.print(arrayData);

        heapSort.sort(arrayData);
        System.out.println("\n\nSesudah HeapSort : ");
        heapSort.print(arrayData);
    }
}
