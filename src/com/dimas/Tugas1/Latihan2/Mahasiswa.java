package com.dimas.Tugas1.Latihan2;


public class Mahasiswa {

    private final String nama,ttl,alamat,agama,sklhasl;
    private final char jnsklm;
    private final long nohp;

    public Mahasiswa(String nama, String ttl, String alamat, String agama, String sklhasl, char jnsklm, long nohp) {
        this.nama = nama;
        this.ttl = ttl;
        this.alamat = alamat;
        this.agama = agama;
        this.sklhasl = sklhasl;
        this.jnsklm = jnsklm;
        this.nohp = nohp;
    }


    void show(){
        System.out.println();
        System.out.println("\t\t Data Pendaftar Mahasiswa Baru ");
        System.out.println("Nama\t\t\t : " + nama);
        System.out.println("TTL\t\t\t\t : " + ttl);
        System.out.println("Jenis Kelamin\t : " + jnsklm);
        System.out.println("Alamat\t\t\t : " + alamat);
        System.out.println("Agama\t\t\t : " + agama);
        System.out.println("Sekolah Asal\t : " + sklhasl);
        System.out.println("No Handphone\t : "+"+62" + nohp);
    }
}
