package com.juaracoding.pcmjavafundamental.TestingCode;

import java.util.Scanner;

public class TestingduaPraktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Kata : ");
        String input = scanner.nextLine();

        int panjang = 0;
        boolean tandaAt = false;
        boolean tandaDollar = false;

        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);

            if (karakter == '@') {
                tandaAt = true;
            } else if (karakter == '$') {
                tandaDollar = true;
            } else if (Character.isLetter(karakter)) {
                panjang++;
            }
        }

        if (tandaAt && tandaDollar) {
            panjang *= 2;
        } else if (tandaAt || tandaDollar) {
            panjang *= 3;
        }

        System.out.println("Hasil : " + panjang);
    }
}
