package tugas.pbo;

import java.util.Scanner;

public class OperasiMatematika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        float hasil_penjumlahan, hasil_pengurangan, hasil_perkalian, hasil_pembagian;

        System.out.print("Masukkan bilangan pertama: ");
        num1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        num2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        num3 = input.nextInt();

        hasil_penjumlahan = num1 + num2 + num3;
        hasil_pengurangan = num1 - num2 - num3;
        hasil_perkalian = num1 * num2 * num3;
        hasil_pembagian = (float) num1 / num2 / num3;

        System.out.println("Hasil penjumlahan: " + hasil_penjumlahan);
        System.out.println("Hasil pengurangan: " + hasil_pengurangan);
        System.out.println("Hasil perkalian: " + hasil_perkalian);
        System.out.println("Hasil pembagian: " + hasil_pembagian);

        input.close();
    }
}