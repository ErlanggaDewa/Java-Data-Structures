package com.company;

public class Mobil {
    String merek;
    String nomorPlat;
    int keluaranTahun;


    public Mobil(String merek, String nomorPlat, int keluaranTahun) {
        this.merek = merek;
        this.nomorPlat = nomorPlat;
        this.keluaranTahun = keluaranTahun;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "merek = '" + merek + '\'' +
                ", nomorPlat = " + nomorPlat +
                ", keluaranTahun = " + keluaranTahun +
                '}';
    }
}
