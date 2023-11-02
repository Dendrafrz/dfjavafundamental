package com.juaracoding.pcmjavafundamental.LatihanHarian;

import java.util.ArrayList;
import java.util.List;

public class Pertemuan6 {
    public static void main(String[] args) {

//        int intX = 7;
//        if (intX == 7)

        for (int i=0;i<5;i++) // dipake sekali variable ekspresi atau INisialisasi dan evaluasi
            {
                //statment loop body
                System.out.println("Print nilai i adalah"+i); //true
            }

//        List<String> listStr = new ArrayList<>();
        //syntatical beda gaya
//            for (String x : listStr) //tampungan container dipake
//            {
//                System.out.println(x);
//            }

        int intX = 8;
        List<String> listStr = new ArrayList<>();
        for (int i=0;i<listStr.size();i++)
        {
            System.out.println("print nilai i ="+listStr.get(i));
        }
    }
}
