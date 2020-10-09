package com.dimas.Tugas1.Latihan1;

public class Rumus {

    double CtoF (){
        return (Konversi.suhu*1.8+32);
    }

    double FtoK (){
        return ((Konversi.suhu+459.67)/1.8);
    }

    double KtoR(){
        return ((Konversi.suhu-273.15)*0.8);
    }

    double RtoC(){
        return  (Konversi.suhu/0.8);
    }

}
