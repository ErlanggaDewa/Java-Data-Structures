package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan jumlah data : ");
        int capacity = userInput.nextInt();

        if (capacity > 0) {
            GenArrayList<Mobil> mobilList = new GenArrayList(capacity);
            for (int i = 1; i <= capacity; i++) {
                userInput.nextLine();
                System.out.println("Data ke - " + i);

                System.out.print("Masukan nama merek : ");
                String merek = userInput.nextLine();

                System.out.print("Masukan nomor plat : ");
                String nomorPlat = userInput.nextLine();

                System.out.print("Masukan keluaran tahun : ");
                int keluaranTahun = userInput.nextInt();

                mobilList.addData(new Mobil(merek, nomorPlat, keluaranTahun));
                System.out.print("\n");

            }

            mobilList.display();

            String confirm;

            do {
                System.out.print("\nIngin hapus data ? (Y/N) : ");
                confirm = userInput.next();
                if (confirm.equalsIgnoreCase("y")) {
                    System.out.print("Masukan data keberapa yang ingin dihapus : ");
                    int delData = userInput.nextInt();
                    mobilList.removeData(delData);
                }
                System.out.println("\nData mobil setelah dihapus : ");
                mobilList.display();
            } while (confirm.equalsIgnoreCase("y"));

        } else {
            System.out.println("Kapasitas yang anda masukan : <= 0");
        }


    }

}





