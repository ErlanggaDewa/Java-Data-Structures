package com.jurnal09;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Mahasiswa, Integer> mapMhs = new HashMap<>();

        Mahasiswa mhs1 = new Mahasiswa("1233", "D3IF4403", "Erlangga");
        Mahasiswa mhs2 = new Mahasiswa("3431", "D3IF4404", "Carissa");
        Mahasiswa mhs3 = new Mahasiswa("8213", "D3IF4401", "Dewa");
        Mahasiswa mhs4 = new Mahasiswa("3534", "D3IF4403", "Sakti");
        Mahasiswa mhs5 = new Mahasiswa("5543", "D3IF4404", "Indah");
        Mahasiswa mhs6 = new Mahasiswa("8999", "D3IF4401", "Swastika");

        mapMhs.put(mhs1, 100);
        mapMhs.put(mhs2, 99);
        mapMhs.put(mhs3, 86);
        mapMhs.put(mhs4, 74);
        mapMhs.put(mhs5, 87);
        mapMhs.put(mhs6, 79);

        System.out.println("\n---- OUTPUT ----");
        mhs1.printData(mapMhs);
        System.out.println("\nTotal nilai mahasiswa sebelum mhs3 dihapus\t\t: " + mhs1.totalNilai(mapMhs));
        System.out.println("\nRata-rata nilai mahasiswa sebelum mhs3 dihapus\t: " + mhs1.avgNilai(mapMhs));

//        ! Hapus object mhs3 dari hashmap
        mapMhs.remove(mhs3);

        System.out.println("\n---- OUTPUT HAPUS OBJECT mhs3 ----");
        mhs1.printData(mapMhs);
        System.out.println("\nTotal nilai mahasiswa sesudah mhs3 dihapus\t\t: " + mhs1.totalNilai(mapMhs));
        System.out.println("\nRata-rata nilai mahasiswa sesudah mhs3 dihapus\t: " + mhs1.avgNilai(mapMhs));

    }
}
