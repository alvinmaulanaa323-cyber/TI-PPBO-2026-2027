
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah bilangan
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        // Memastikan jumlah bilangan cukup
        if (n < 2) {
            System.out.println("Masukkan minimal 2 bilangan.");
            input.close();
            return;
        }

        // Membaca bilangan ke dalam array
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Mencari nilai terbesar dan terbesar kedua
        int terbesar = angka[0];
        int terbesarKedua = 0;
        boolean adaTerbesarKedua = false;

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > terbesar) {
                terbesarKedua = terbesar;
                terbesar = angka[i];
                adaTerbesarKedua = true;
            } else if (angka[i] < terbesar) {
                if (!adaTerbesarKedua || angka[i] > terbesarKedua) {
                    terbesarKedua = angka[i];
                    adaTerbesarKedua = true;
                }
            }
        }

        // Menampilkan hasil
        if (adaTerbesarKedua) {
            System.out.println("Nilai terbesar: " + terbesar);
            System.out.println("Nilai terbesar kedua: " + terbesarKedua);
        } else {
            System.out.println(
                    "Tidak ada nilai terbesar kedua yang berbeda."
            );
        }

        input.close();
    }
}
