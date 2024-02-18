package tugas.pbo;

import java.util.Scanner;

public class MieGacoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah uang Anda: ");
        float uang = input.nextFloat();

        System.out.println("Apakah tidak ada kelas kuliah? (1 untuk ya, 0 untuk tidak)");
        int tidakAdaKelasKuliah = input.nextInt();

        if (uang > 10000 && tidakAdaKelasKuliah == 1) {
            System.out.println("Anda bisa membeli migacoan!");
        } else {
            System.out.println("Anda tidak bisa membeli migacoan saat ini.");
        }

        input.close();
    }
}
