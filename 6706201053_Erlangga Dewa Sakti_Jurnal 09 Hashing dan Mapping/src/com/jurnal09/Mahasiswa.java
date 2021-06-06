package com.jurnal09;

import java.util.Objects;

public class Mahasiswa {
    private String nim, kelas, namaMhs;

    public Mahasiswa(String nim, String kelas, String namaMhs) {
        this.nim = nim;
        this.kelas = kelas;
        this.namaMhs = namaMhs;
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
        int h = HASH_MULTIPLIER * h1 + h2 + h3;
        return h;
//        return Objects.hash(nim, kelas, namaMhs);
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", kelas='" + kelas + '\'' +
                ", namaMhs='" + namaMhs + '\'' +
                '}';
    }
}
