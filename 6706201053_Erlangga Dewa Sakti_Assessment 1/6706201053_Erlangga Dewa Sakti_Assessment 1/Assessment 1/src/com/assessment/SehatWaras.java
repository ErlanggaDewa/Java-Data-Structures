package com.assessment;

import java.util.LinkedList;
import java.util.Queue;

public class SehatWaras {
    Queue<SehatWaras> antrianUmum = new LinkedList<>();
    Queue<SehatWaras> antrianAnak = new LinkedList<>();
    Queue<SehatWaras> antrianGigi = new LinkedList<>();

    String no;
    String nama;
    String jenis;

    public SehatWaras(String no, String nama, String jenis) {
        this.no = no;
        this.nama = nama;
        this.jenis = jenis;
    }

    public SehatWaras() {
        this(null, null, null);
    }

    public void ambilNomor(String no, String nama, String jenis) {
        if ((no.substring(0, 1).equalsIgnoreCase("A"))) {
            int menunggu = antrianUmum.size();
            antrianUmum.add(new SehatWaras(no, nama, jenis));
            if (menunggu > 0)
                System.out.println(nama + " anda menunggu " + menunggu + " orang lagi");
        } else if (no.substring(0, 1).equalsIgnoreCase("B")) {
            int menunggu = antrianAnak.size();
            antrianAnak.add(new SehatWaras(no, nama, jenis));
            if (menunggu > 0)
                System.out.println(nama + " anda menunggu " + menunggu + " orang lagi");
        } else if (no.substring(0, 1).equalsIgnoreCase("C")) {
            int menunggu = antrianGigi.size();
            antrianGigi.add(new SehatWaras(no, nama, jenis));
            if (menunggu > 0)
                System.out.println(nama + " anda menunggu " + menunggu + " orang lagi");
        } else {
            System.out.println("Kode nomor antrian anda salah");
        }
    }

    public void panggilan(String no) {
        if ((no.substring(0, 1).equalsIgnoreCase("A"))) {
            if (!antrianUmum.isEmpty() && antrianUmum.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Umum silahkan masuk ruang 1");
            } else if (!antrianUmum.isEmpty() && !antrianUmum.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Umum harap menunggu");
            } else {
                System.out.println("Antrian masih kosong");
            }
            antrianUmum.poll();
        } else if (no.substring(0, 1).equalsIgnoreCase("B")) {
            if (!antrianAnak.isEmpty() && antrianAnak.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Anak silahkan masuk ruang 2");
            } else if (!antrianAnak.isEmpty() && !antrianAnak.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Anak harap menunggu");
            } else {
                System.out.println("Antrian masih kosong");
            }
            antrianAnak.poll();
        } else if (no.substring(0, 1).equalsIgnoreCase("C")) {
            if (!antrianGigi.isEmpty() && antrianGigi.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Gigi silahkan masuk ruang 3");
            } else if (!antrianGigi.isEmpty() && !antrianGigi.peek().no.equalsIgnoreCase(no)) {
                System.out.println("Nomor " + no + " untuk Dokter Umum harap menunggu");
            } else {
                System.out.println("Antrian masih kosong");
            }
            antrianGigi.poll();
        } else {
            System.out.println("Kode nomor antrian anda salah");
        }
    }

    public void hapusAntrian() {
        antrianGigi.clear();
        antrianUmum.clear();
        antrianAnak.clear();
    }
}
