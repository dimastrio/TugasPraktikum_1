package com.dimas.Tugas1.Latihan3;

import java.util.Scanner;

public class DetailKaryawan {
    private static String nama,ttl,alamat,jabatan;
    private static long nohp;
    private static char jnsklm;

    void show(){
        System.out.println();
        System.out.println("\t\t Detail Karyawan");
        System.out.println("Nama\t\t\t : " + nama);
        System.out.println("TTL\t\t\t\t : " + ttl);
        System.out.println("Jenis Kelamin\t : " + jnsklm);
        System.out.println("Alamat\t\t\t : " + alamat);
        System.out.println("Jabatan\t\t\t : " + jabatan);
        System.out.println("No Handphone\t : "+ "+62" + nohp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t Input Data Karyawan");
        System.out.print("Masukkan Nama\t\t\t\t : ");
        nama = scan.nextLine();
        System.out.print("Masukkan TTL\t\t\t\t : ");
        ttl = scan.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
        jnsklm = scan.nextLine().charAt(0);
        System.out.print("Masukkan Alamat\t\t\t\t : ");
        alamat = scan.nextLine();
        System.out.print("Masukkan Jabatan\t\t\t : ");
        jabatan = scan.nextLine();
        System.out.print("Masukkan No Handphone\t\t : ");
        nohp = scan.nextLong();

        DetailKaryawan detail = new DetailKaryawan();

        detail.show();


    }
}
