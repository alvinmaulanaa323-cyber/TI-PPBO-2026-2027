
import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tahap 1: Membaca jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            input.close();
            return;
        }

        // Tahap 2: Membaca nilai seluruh siswa
        int[] nilai = new int[n];

        System.out.println("\nMasukkan nilai setiap siswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Tahap 3: Menampilkan nilai sebelum diurutkan
        System.out.print("\nNilai sebelum diurutkan: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        // Tahap 4: Menghitung rata-rata, nilai maksimum, minimum,
        // serta jumlah siswa lulus dan tidak lulus
        int total = 0;
        int maksimum = nilai[0];
        int minimum = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int kkm = 70;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > maksimum) {
                maksimum = nilai[i];
            }

            if (nilai[i] < minimum) {
                minimum = nilai[i];
            }

            if (nilai[i] >= kkm) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        // Tahap 5: Mengurutkan nilai menggunakan Bubble Sort
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int sementara = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = sementara;
                }
            }
        }

        // Tahap 6: Menampilkan laporan hasil pengolahan nilai
        System.out.println("\n===== LAPORAN NILAI KELAS =====");
        System.out.println("Jumlah siswa          : " + n);
        System.out.printf("Rata-rata nilai       : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi       : " + maksimum);
        System.out.println("Nilai terendah        : " + minimum);
        System.out.println("Batas kelulusan (KKM)  : " + kkm);
        System.out.println("Jumlah siswa lulus    : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus    : " + jumlahTidakLulus);

        // Tahap 7: Menampilkan nilai setelah diurutkan
        System.out.print("Nilai setelah diurutkan: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
