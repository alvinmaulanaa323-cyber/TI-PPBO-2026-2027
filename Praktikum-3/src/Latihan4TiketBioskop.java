import java.util.Scanner;

public class Latihan4TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean isMahasiswa = sc.nextBoolean();

        int hargaTiket;

        if (isMahasiswa && umur < 25) {
            hargaTiket = 35000; // Harga khusus mahasiswa under 25
            System.out.println("Selamat! Anda mendapat diskon mahasiswa.");
        } else if (umur < 12) {
            hargaTiket = 25000; // Harga anak-anak
        } else {
            hargaTiket = 50000; // Harga normal
        }

        System.out.println("Harga tiket bioskop: Rp " + hargaTiket);
    }
}