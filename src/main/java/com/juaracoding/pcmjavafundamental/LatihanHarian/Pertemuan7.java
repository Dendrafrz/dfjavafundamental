package com.juaracoding.pcmjavafundamental.LatihanHarian;

public class Pertemuan7 {
    public static void main(String[] args) {
        // business logicnya salah CONTOH Error Exception
        // NOTE : kalo ada ANTRIAN harus Validasi

        String strDb = "Dendrafrz";
        String strEntry = "Dendra";
        /*
            Cari seluruh data yang memiliki username %P
         */

        //dengan stopper (parsing string -> int)
        //harus bisa handle Exception
        String strX = "88";
        int intx = Integer.parseInt(strX);

        //checked exception
        // Thread.sleep(mills : 1000); // run error terus di click kanan
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
