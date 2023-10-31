package com.juaracoding.pcmjavafundamental.TestingCode;

import java.util.Scanner;

public class testingPraktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan kata :");
        String input = scanner.nextLine();

        int hasil = hitungHasil(input);

        System.out.println("Hasil :" + hasil);

        scanner.close();
    }

    public static int hitungHasil(String input){

        int hasil = 0;

        for (int i=0; i <input.length(); i++){
            char karakter = input.charAt(i);

            if (Character.isDigit(karakter)) {
                hasil += Character.getNumericValue(karakter);
            }
        }

         return  hasil;
     }
   }

