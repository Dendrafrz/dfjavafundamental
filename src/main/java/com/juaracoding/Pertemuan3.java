package com.juaracoding;

public class Pertemuan3 {
    public static void main(String[] args) {

//        double dominan int vs double decimal
        double hasil = 75.0/8;
        double hasil1 = 75/8;
        System.out.println(hasil); //Dominan double
        System.out.println(hasil1); //Dominan int

//        Gerbang logika I (AND &&) (nand !(()&()))
        System.out.println(5!=3); // != Tidak Sama dengan Operator ,repsentatif 1 = true
        System.out.println(5==3); // && AND Hasil False
        System.out.println((5==3)&&(6!=6)); // Hasil False
//        Contoh lapangan pada AND Logical &&
//        String username = ""; //dapat dari Form Login
//        String password = ""; // dapat dari Form Login
        /*
        pilih database yang username = dendra
        result => null;
         */
        // jika ga ada "User tidak ditemukan"
        /*
        pilih database yang username = dendra
        result => ada;
        //username = dendrafrz
        //pass = 123haha
        //email = dendra@hotmail.com
        //noHp = 08166666620
         */
        // jika ada "Nama User ditemukan"
        // (dendrafrz == dendrafrz) salah (jadi keinput)

//        Gerbang logika II (OR || ) , (NOR !(()||()))
        System.out.println("Hasil (4>4) ="+(4>4));
        System.out.println((4>4||!(5==3)));
        System.out.println(!(4!=3)||(10==10));

//    bitwise (Build in Function) / Jarang dipake
        System.out.println(Integer.toBinaryString(150));//10010110
        System.out.println(75 & 2);
        //udf user defined function



    }
}
