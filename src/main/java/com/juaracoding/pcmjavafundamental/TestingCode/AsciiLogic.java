package com.juaracoding.pcmjavafundamental.TestingCode;
import java.util.Scanner;

public class AsciiLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Kata : ");
        String input = scanner.nextLine();

        int result = calculateAsciiSum(input);
        System.out.println("Hasil : " + result);
    }

    public static int calculateAsciiSum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int asciiValue = (int) character;

            if (Character.isLetter(character)) {
                sum += asciiValue - 96; // Huruf kecil
            } else if (Character.isDigit(character)) {
                sum += asciiValue - 48; // Angka
            } else if (character == '@') {
                sum += 8; // ASCII untuk karakter '@' adalah 64, dan 64 - 56 = 8
            }
        }

        return sum;
    }
}