
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyiapkan matriks berukuran 3x3
        int[][] matriks = new int[3][3];
        int totalSemua = 0;

        // Membaca elemen matriks dari pengguna
        System.out.println("Masukkan 9 bilangan untuk matriks 3x3:");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Elemen [" + baris + "][" + kolom + "]: ");
                matriks[baris][kolom] = input.nextInt();
            }
        }

        // Menampilkan matriks
        System.out.println("\nMatriks 3x3:");
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + "\t");
            }
            System.out.println();
        }

        // Menghitung jumlah setiap baris dan total seluruh elemen
        System.out.println("\nJumlah setiap baris:");
        for (int baris = 0; baris < 3; baris++) {
            int totalBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                totalBaris += matriks[baris][kolom];
            }

            System.out.println("Baris " + (baris + 1) + ": " + totalBaris);
            totalSemua += totalBaris;
        }

        System.out.println("Total semua elemen: " + totalSemua);

        input.close();
    }
}
