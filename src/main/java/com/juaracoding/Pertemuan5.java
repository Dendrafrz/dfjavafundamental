package com.juaracoding;

public class Pertemuan5 {
    public static void main(String[] args) {

        /*  Logika
                    Percabangan */

        //Permainan If... else Jenis Akrobat atau lepas [Tidak Direkomendasikan]
        // tanpa block code "{ }"
//        int x = 20;
//        if (x % 2 == 0) // True 20 % 2 = 0 == 0
//            if (x / 100 !=0)  //false karena int
//                System.out.println(x + "bil genap lebih dari seratus");
//        else // lempar dari false
//            if (x / 10 !=0)
//                System.out.println(x + "bil genap lebih dari sepuluh");

        int x = 5;
        String msg = "salah";
        if(x >=10){  // 5 >= 10 false lempar ke else if
            System.out.println("Nilai x lebih besar atau sama dengan 10");
        }
        else if (msg.equals("salah")) {   //else if pengecekan lagi
            System.out.println("jawaban salah");
        }else{ //else if aja
            System.out.println("semua salah");
        }
        //kalo semua mau true atau dicek dua duanya
        //pake if aja gaperlu pake else if

        /*  //detailing scoring
        if (jawab == a)
        score + 50
        else if (jawab == b)
        score + 30
        else if (jawab == c)
        else lainnya
        score :0
            jawab a =50
            jawab b =30
            jawab c =10
            lain nya = 0
        */

        // Switch Case break untuk bisa pemilihan hari,bulan,orang,dll
        // if else bermain ada logical dan pembandingan

        String strAbc = "erwr";

        if (strAbc.equals("a")){
            System.out.println("strAbc adalah a");
        }
        else if (strAbc.equals("b")) {
            System.out.println("strAbc adah b");
        }
        else if (strAbc.equals("c")) {
            System.out.println("strAbc adalah c");
        }
        else {
            System.out.println("strAbc adalah" +strAbc);
        }

        String hari = "Minggu";
        switch (hari){
            case "Senin" :
                System.out.println("hari terbaik adalah");break;
            case  "Selasa" :
                System.out.println("hari terbaik adalah");break;
            case "Rabu" :
                System.out.println("hari terbaik adalah");break;
            case "Kamis" :
                System.out.println("hari terbaik adalah");break;
            case "Jumat" :
                System.out.println("hari terbaik adalah");break;
            case "Sabtu" :
                System.out.println("hari Sabtu adalah hari bersama keluarga");break;
            case "Minggu" :
                System.out.println("hari Minggu adalah hari tenang");break;
            default:

        }

        //Validasi null Ternary
//        int nilai = 76;
//        String strPenampung = ""; ///String untuk penampung
//        int intPenampung = "0";
//        if(nilai >= 75){
//            System.out.println("Selamat anda lulus");
//        } else{
//            System.out.println("Anda tidak lulus");
//        }
//
//        strPenampung = (nilai >= 75)?"Selamat anda lulus":"Selamat Anda tidak lulus";
//        intPenampung = (nilai >=75)?1:0;
//        System.out.println(strPenampung);
//        System.out.println(intPenampung);

        //null karena tidak ada validasi .... Mencegah Parsing dan Crash dan Smooth
        //Validasi Manual Ternary (Exception Handling)
        // @ NotNull
        Integer intUmur = 5;
        intUmur = (intUmur==null)?0:intUmur;
        System.out.println(intUmur*5);

        //Bikin range 50 s.d 100 ==true
        //interval
        int intRange = 40;
        if(intRange>50 && intRange<100){
            System.out.println(intRange + "bernilai True");
        } else {
            System.out.println(intRange + "bernilai False");
        }

        String strAscii = "Cuma is3nk @74"; //phrase
        for (int i=0;i<strAscii.length();i++)
        {
            char chx = strAscii.charAt(i);
            if((chx>=65 && chx <= 90) || (chx >=48 && chx <= 57))
            {
              System.out.println(chx + "Bernilai True");
            }
        }

    }
}
