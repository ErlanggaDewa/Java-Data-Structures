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
        return Objects.hash(nim, kelas, namaMhs);
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
