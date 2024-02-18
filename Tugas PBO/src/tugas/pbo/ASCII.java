package tugas.pbo;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char char1 = '4';
        char char2 = '6';

        int ascii_char1 = (int) char1;
        int ascii_char2 = (int) char2;

        int ascii_sum = ascii_char1 + ascii_char2;

        System.out.printf("ASCII dari '%c' adalah: %d\n", char1, ascii_char1);
        System.out.printf("ASCII dari '%c' adalah: %d\n", char2, ascii_char2);
        System.out.printf("Hasil penjumlahan kode ASCII dari '%c' dan '%c' adalah: %d\n", char1, char2, ascii_sum);
    }
}