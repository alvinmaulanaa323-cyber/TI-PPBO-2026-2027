
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah bilangan
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
            input.close();
            return;
        }

        // Membaca bilangan ke dalam array
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.print("\nArray sebelum diurutkan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        // Mengurutkan array dengan Bubble Sort
        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int sementara = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = sementara;
                }
            }
        }

        // Menampilkan array setelah diurutkan
        System.out.print("\nArray setelah diurutkan: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
