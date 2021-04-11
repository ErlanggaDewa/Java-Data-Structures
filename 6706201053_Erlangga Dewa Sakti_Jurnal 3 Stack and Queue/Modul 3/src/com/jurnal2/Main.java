package com.jurnal2;

public class Main {


    public static void main(String[] args) {
        AntrianRoti roti = new AntrianRoti();
        roti.ambilNomor(1, "Roti Upin", "roti manis", 10);
        roti.ambilNomor(2, "Roti Ipin", "roti manis", 5);
        roti.ambilNomor(3, "Roti Ismail", "roti manis", 4);
        roti.panggilanRoti();
        roti.ambilNomor(4, "Roti Santi", "roti manis", 2);
    }


}
