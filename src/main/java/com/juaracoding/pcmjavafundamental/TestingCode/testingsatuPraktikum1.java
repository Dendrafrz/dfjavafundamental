package com.juaracoding.pcmjavafundamental.TestingCode;

import java.util.Scanner;

//diketahui
//Jquery 1995@v.10 nilai ascii
//J = 74
//q = 113
//u = 117
//e = 101
//r = 114
//y = 121
//spasi = 32
//1 = 49
//9 = 57
//9 = 57
//5 = 53
//v = 118
// 1 = 49
// . = 46
// 0 = 48
//@ = 64

public class testingsatuPraktikum1 {
    public static void main(String[] args) {
        //bikin inputan ke console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan kata:");
        String kata = scanner.nextLine(); //Bikin line bawah
        System.out.println("Hasil :" + hitungJumlah(kata));
    }

    private static int hitungJumlah(String kata){
        int jumlah = 0;
        for (int i = 0; i<kata.length(); i++)
        {
            char karakter = kata.charAt(i);
            if (Character.isLetter(karakter)){
            jumlah += (int) karakter;
            }
        }
        return jumlah;
    }
}
