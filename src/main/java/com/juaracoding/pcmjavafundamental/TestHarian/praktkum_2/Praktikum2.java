package com.juaracoding.pcmjavafundamental.TestHarian.praktkum_2;

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0; //total data  dari value "x1+x2+x3,..." dan pake double in case decimal dan value nya besar
        int jml = 0; // anggpa aja "n" = jumlah data
        double mean;  // X menghasilkan dengan pakai double


        //Pake konsep while
        while (true){
            System.out.println("Masukan Angka atau mengakhiri dengan 'X'");
            String input = sc.nextLine();

            //untuk matiin pakai String / character  jika sudah selesai
            if (input.equalsIgnoreCase("X"))
            {
                break;
            }

            //Try Catch Menangkap Angka dan exception error jika menginput diawal bukan angka
            try {
                double angka = Double.parseDouble(input);
                total += angka;
                jml++;
            } catch (NumberFormatException e){ //
                System.out.println("input bukan angka, coba lagi");
            }

        }

        //Validasi Mean Rata-Rata
        if (jml == 0) // mean = hasil total dibagi jumlah
        {
            System.out.println("Tidak ada angka yang dimasukan");
        }
        else
        {
            mean = total / jml; // M = Total / n
            System.out.println("Rata-rata :" + mean);
        }
    }
}
