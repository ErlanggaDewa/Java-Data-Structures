package com.jurnal2;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianRoti {
    Queue<AntrianRoti> antrian = new LinkedList<>();

    int nomorAntri;
    String namaRoti;
    String jenisRoti;
    int jumlah;

    public AntrianRoti() {
        this(0, null, null, 0);
    }

    public AntrianRoti(int nomorAntri, String namaRoti, String jenisRoti, int jumlah) {
        this.nomorAntri = nomorAntri;
        this.namaRoti = namaRoti;
        this.jenisRoti = jenisRoti;
        this.jumlah = jumlah;
    }

    public void ambilNomor(int nomorAntri, String namaRoti, String jenisRoti, int jumlah) {
        int sisaAntrian = antrian.size();
        antrian.add(new AntrianRoti(nomorAntri, namaRoti, jenisRoti, jumlah));
        if (sisaAntrian > 0)
            System.out.println("Anda menunggu " + sisaAntrian + " orang lagi");
    }

    public void panggilanRoti() {
        if (!antrian.isEmpty())
            System.out.println("Nomor " + antrian.peek().nomorAntri + " : pembelian roti " + antrian.peek().jenisRoti + " sudah siap");
        antrian.poll();

    }

}
