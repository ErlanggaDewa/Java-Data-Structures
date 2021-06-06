package com.jurnal08;

public class HeapSort {
    public void sort(int[] data) {
        int size = data.length;

        for (int index = (size / 2) - 1; index >= 0; index--) heapify(data, size, index);

        for (int index = size - 1; index >= 0; index--) {
            int tempData = data[0];
            data[0] = data[index];
            data[index] = tempData;
            heapify(data, index, 0);
        }
    }

    private void heapify(int[] data, int size, int index) {
        // *                   data      10        3
        int largest = index, left = 2 * index + 1, right = 2 * index + 2;
        if (left < size && data[largest] < data[left]) largest = left;
        if (right < size && data[largest] < data[right]) largest = right;
        if (largest != index) {
            int tempData = data[index];
            data[index] = data[largest];
            data[largest] = tempData;
            heapify(data, size, largest);
        }
    }

    public void print(int[] data) {
        for (int datum : data) System.out.print(datum + " ");
    }

}
