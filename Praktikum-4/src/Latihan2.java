
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tinggi atau ukuran pola
        System.out.print("Masukkan tinggi/ukuran pola: ");
        int ukuran = input.nextInt();

        // Membuat pola segitiga terbalik
        System.out.println("\nPola Segitiga Terbalik:");

        for (int baris = ukuran; baris >= 1; baris--) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Membuat pola persegi
        System.out.println("\nPola Persegi:");

        for (int baris = 1; baris <= ukuran; baris++) {
            for (int kolom = 1; kolom <= ukuran; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
