package com.dimas.Tugas1.Latihan2;

import java.util.Scanner;

public class DemoMahasiswa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama,ttl,alamat,agama,sklhasl;
        char jnsklm;
        long nohp;

        System.out.println();
        System.out.println("\t\t Pendaftaran Mahasiswa Baru");
        System.out.print("Masukkan Nama\t\t\t\t : ");
        nama = scan.nextLine();
        System.out.print("Masukkan TTL\t\t\t\t : ");
        ttl = scan.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
        jnsklm = scan.nextLine().charAt(0);
        System.out.print("Masukkan Alamat\t\t\t\t : ");
        alamat = scan.nextLine();
        System.out.print("Masukkan Agama\t\t\t\t : ");
        agama = scan.nextLine();
        System.out.print("Masukkan Sekolah Asal\t\t : ");
        sklhasl = scan.nextLine();
        System.out.print("Masukkan No Handphone\t\t : ");
        nohp = scan.nextLong();

        Mahasiswa mahasiswa = new Mahasiswa(nama,ttl,alamat,agama,sklhasl,jnsklm,nohp);

        System.out.println();
        mahasiswa.show();

    }

}
