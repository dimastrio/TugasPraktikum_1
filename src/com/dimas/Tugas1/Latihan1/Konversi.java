package com.dimas.Tugas1.Latihan1;

import java.util.Scanner;

public class Konversi {

    static double suhu;

    public static void main(String[] args) {

        int pil;
        double CF,FK,RC,KR;

        Rumus rumus = new Rumus();
        Scanner scan = new Scanner(System.in);

        System.out.println("\tProgram Konversi Suhu : ");
        System.out.println("\t1. Celcius ke Fahrenheit");
        System.out.println("\t2. Fahrenheit ke Kelvin");
        System.out.println("\t3. Kelvin ke Reamur");
        System.out.println("\t4. Reamur ke Celcius");
        System.out.print("\tMasukkan pilihan\t : ");
        pil = scan.nextInt();
        System.out.print("\tMasukkan Suhu yang akan dikonversi\t : ");
        suhu = scan.nextDouble();

        switch (pil){
            case 1:
                CF = rumus.CtoF();
                System.out.println();
                System.out.println("\tHasil Konversi :");
                System.out.println("\tC -> F\t : " + CF );
                break;
            case 2:
                FK = rumus.FtoK();
                System.out.println();
                System.out.println("\tHasil Konversi :");
                System.out.println("\tF -> K\t : " + FK);
                break;
            case 3:
                KR = rumus.KtoR();
                System.out.println();
                System.out.println("\tHasil Konversi :");
                System.out.println("\tK -> R\t : " + KR );
                break;
            case 4:
                RC = rumus.RtoC();
                System.out.println();
                System.out.println("\tHasil Konversi :");
                System.out.println("\tR -> C\t : " + RC );
                break;

            default:
        }
    }
}
