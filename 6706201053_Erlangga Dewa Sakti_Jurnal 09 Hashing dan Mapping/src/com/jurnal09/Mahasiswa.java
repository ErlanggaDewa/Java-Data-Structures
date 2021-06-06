package com.jurnal09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Mahasiswa {

    private final String namaMhs, kelas, nim;

    public Mahasiswa(String nim, String kelas, String namaMhs) {
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.nim = nim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return Objects.equals(nim, mahasiswa.nim) && Objects.equals(kelas, mahasiswa.kelas) && Objects.equals(namaMhs, mahasiswa.namaMhs);
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 7;
        int h1 = nim.hashCode();
        int h2 = kelas.hashCode();
        int h3 = namaMhs.hashCode();
        return HASH_MULTIPLIER * h1 + h2 + h3;
    }

    @Override
    public String toString() {
        return "Mahasiswa dengan {" +
                "Nama = '" + namaMhs + '\'' +
                ", Kelas = '" + kelas + '\'' +
                ", NIM = '" + nim + '\'' +
                '}' + " memiliki";
    }

    public void printData(HashMap<Mahasiswa, Integer> mapMhs) {
        for (Map.Entry<Mahasiswa, Integer> entry : mapMhs.entrySet()) {
            System.out.println(entry.getKey() + " nilai : " + entry.getValue());
        }
    }

    public Double avgNilai(HashMap<Mahasiswa, Integer> mapMhs) {
        double totalNilai = 0;
        for (Map.Entry<Mahasiswa, Integer> entry : mapMhs.entrySet()) {
            totalNilai += entry.getValue();
        }
        return totalNilai / mapMhs.size();
    }

    public Double totalNilai(HashMap<Mahasiswa, Integer> mapMhs) {
        double totalNilai = 0;
        for (Map.Entry<Mahasiswa, Integer> entry : mapMhs.entrySet()) {
            totalNilai += entry.getValue();
        }
        return totalNilai;
    }
}
