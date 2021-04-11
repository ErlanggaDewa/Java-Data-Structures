package com.jurnal4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DataBarang> listBarang = new ArrayList<>();
        DataBarang toko = new DataBarang();

        Scanner userInput = new Scanner(System.in);

        listBarang.add(new DataBarang("A004", "Molto", "Detergen", 3));
        listBarang.add(new DataBarang("A001", "Bebelac", "Susu Kaleng", 5));
        listBarang.add(new DataBarang("D111", "Kapal Api", "Kopi", 8));
        listBarang.add(new DataBarang("C010", "Sari Roti", "Roti", 45));
        listBarang.add(new DataBarang("G123", "Marjan", "Sirup", 32));
        listBarang.add(new DataBarang("B005", "Indomie", "Makanan Instan", 17));

        toko.cetakBarang(listBarang);

        System.out.print("\nMasukan kode barang yang di cari : ");
        String keyword = userInput.next();

        toko.cariBarang(listBarang, keyword);
    }
}
