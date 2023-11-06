package com.juaracoding.pcmjavafundamental.TestHarian.praktikum_1;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {

        //bikin inputan ke console
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan kata:");
        String input = sc.nextLine(); //Bikin line bawah


        int panjang = 0;
        boolean space = false;
        boolean at = false;
        boolean dollar = false;
        // diketahui logika perhigungan
        // ascii index "Space" - "@" (Special Character) = 32-64 +
        // "A" - "z" (CapsLock - huruf kecil) = 65 - 122
        for (int i=0; i < input.length(); i++){
            char karakter = input.charAt(i);

            if (karakter == '@')
            {
                at = true;
            }
            else if (karakter == '$')
            {
                dollar = true;
            }
            else if (karakter == ' ')
            {
                space = true;
            }
            else if (Character.isLetter(karakter))
            {
                panjang += (int) karakter;
            }

        }

        if (at && dollar && space)
        {
            panjang *=2;
        }
        else if (at || dollar || space)
        {
            panjang *=3;
        }

        System.out.println("Hasil : " + panjang);

    }
}
