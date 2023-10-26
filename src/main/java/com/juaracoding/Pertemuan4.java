package com.juaracoding;

public class Pertemuan4 {
    public static void main(String[] args) {

        int itX= 0;
        String stringname = "isinya";
        System.out.println(stringname);

        char [] chArr = {'i','s','i','n','y','a'};

        //.concat gabugin variable string
        String strFirst = "abcde";
        String strSecond = "zxcvf";
        System.out.println(strFirst.concat(strSecond));

        // Study Case
        String strFirstName = "Dendra";
        String strLastName = "Fahrezi";

        //spasi termasuk INDEX
        System.out.println("panjang string adalah ="+strLastName.length());
        // dapatin inisial pakai inisial 0 dari strFirstName
        System.out.println("panjang string adalah ="+strFirstName.charAt(0));


        // Memakan memory banyak bahanya pakai "+" [TIDAK REKOMENDASI PAKE "+" UNTUK ENTERPRISE]
        System.out.println(strFirstName+strLastName);

        // StringBuilder + append() CARA SEDERHANA yang Terbagus [BEST PRACTICES]
        StringBuilder sBuild = new StringBuilder(); //Declarasi buat nampung
        System.out.println(sBuild.append(strFirstName).append(strLastName));
        sBuild.setLength(0);
        System.out.println(sBuild.append(strFirstName).append(strLastName));
        sBuild.setLength(0);

//        pake variable.equals() untuk perbandingan VALUE harus sama
//        pake variable.equalsIgnoreCase(); untuk perbadingan VALUE jika berbeda
//        String strA = new String(""); (tidak Direkomendasikan)
        String strA = "Dendra";
        String strB = "dendra";//Dendra123@gmail.com => dendra123@gmail.com
        String strC = "Dendra";
//        string jangan pake operator == || [SALAH] dan BAKAL ERROR
        System.out.println(strA.equalsIgnoreCase(strB));
        System.out.println(strC.equals(strC));

//        mengetahui index nama tengah menggunakan substring
        String strD = "32csn230h92rhvncz";
        System.out.println("Token 3 Digit Awal ------" + strD.substring(3)); //Random Function dan Dynamic


    }
}
