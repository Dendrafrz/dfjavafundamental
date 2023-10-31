package com.juaracoding.pcmjavafundamental.TestingCode;

public class testingException {
    public static void main(String[] args) {

//        // business logicnya salah CONTOH Error Exception
//        // NOTE : kalo ada ANTRIAN harus Validasi
//
//        String strDb = "Dendrafrz";
//        String strEntry = "Dendra";
//        /*
//            Cari seluruh data yang memiliki username %P
//         */
//
//        //dengan stopper (parsing string -> int)
//        //harus bisa handle Exception
//        String strX = "88";
//        int intx = Integer.parseInt(strX);
//
//        //checked exception
//        // Thread.sleep(mills : 1000); // run error terus di click kanan
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //try catch untuk java yang handle
        try {
            double A = 1.2;
            double B = 2.3;
            int intJmlEntry = (int) (A + B);
        } catch (Exception e) {


            double A = 9.6; //dibulatkan ke bawah
            double B = 4.9;//dibulatkan ke bawah
            int intJmlEntry = (int) (A + B);

            if (intJmlEntry != 12) {
                throw new IllegalArgumentException("Kalkulasi tidak valid");//System.exit(); throw manual
            }


        }
    }
}
