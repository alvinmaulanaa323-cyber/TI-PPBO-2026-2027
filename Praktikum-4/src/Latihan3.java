
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyiapkan array untuk 10 bilangan
        int[] angka = new int[10];

        // Membaca 10 bilangan dari pengguna
        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan bilangan dalam urutan terbalik
        System.out.println("\nUrutan bilangan dari belakang:");
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
