package com.jurnal4;

import java.util.ArrayList;
import java.util.Collections;

public class DataBarang implements Comparable<DataBarang> {

    String kodeBarang, namaBarang, jenisBarang;
    int stokBarang;

    public DataBarang(String kodeBarang, String namaBarang, String jenisBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stokBarang = stokBarang;
    }

    public DataBarang(String kodeBarang) {
        this(kodeBarang, null, null, 0);
    }

    public DataBarang() {
        this(null, null, null, 0);
    }

    public void cetakBarang(ArrayList<DataBarang> listBarang) {
        System.out.println("DATA BARANG TOKO");
        for (DataBarang barang : listBarang) {
            System.out.println(barang);
        }
    }

    public void cariBarang(ArrayList<DataBarang> listBarang, String keyword) {
        Collections.sort(listBarang);
        int index = Collections.binarySearch(listBarang, new DataBarang(keyword));
        try {
            System.out.println("Nama barang yang anda cari : " + listBarang.get(index).namaBarang + "\nJenis barang : " + listBarang.get(index).jenisBarang);
        } catch (Exception err) {
            System.out.println("Kode barang yang anda masukan tidak valid");
        }

    }


    @Override
    public int compareTo(DataBarang o) {
        return this.kodeBarang.compareToIgnoreCase(o.kodeBarang);
    }

    @Override
    public String toString() {
        return "DataBarang{" +
                " Kode Barang = '" + kodeBarang + '\'' +
                ", Nama Barang = '" + namaBarang + '\'' +
                ", Jenis Barang = '" + jenisBarang + '\'' +
                ", Stok Barang = " + stokBarang +
                '}';
    }
}
