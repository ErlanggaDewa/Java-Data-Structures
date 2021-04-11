package com.assessment;

public class Main {
    public static void main(String[] args) {
        SehatWaras antrian = new SehatWaras();
        antrian.ambilNomor("A001", "Ita Lingga", "Mandiri");
        antrian.ambilNomor("A002", "Rita Sugiarto", "BPJS");
        antrian.ambilNomor("B001", "Riki Subagja", "Mandiri");
        antrian.ambilNomor("B001", "Alan Budikusuma", "Mandiri");

        antrian.panggilan("A001");
        antrian.panggilan("A002");
        antrian.panggilan("C001");

        antrian.ambilNomor("C001", "Susi Susanti", "BPJS");
        antrian.panggilan("C001");
        antrian.hapusAntrian();
        antrian.panggilan("B001");
    }
}
