package com.soal02;


import java.util.Arrays;

public class HeapSort {
    public void sort(String[][] data) {
        int size = data.length;

        for (int index = (size / 2) - 1; index >= 0; index--) heapify(data, size, index);

        for (int index = size - 1; index >= 0; index--) {
            String[] tempData = data[0];
            data[0] = data[index];
            data[index] = tempData;
            heapify(data, index, 0);
        }
    }

    private void heapify(String[][] data, int size, int index) {
        int largest = index, left = 2 * index + 1, right = 2 * index + 2;
        if (left < size && data[largest][0].compareTo(data[left][0]) < 0) largest = left;
        if (right < size && data[largest][0].compareTo(data[right][0]) < 0) largest = right;
        if (largest != index) {
            String[] tempData = data[index];
            data[index] = data[largest];
            data[largest] = tempData;
            heapify(data, size, largest);
        }
    }

    public void print(String[][] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(data[i]));
        }
    }

}

