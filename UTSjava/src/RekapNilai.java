import java.util.Scanner;

public class RekapNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        int[] nilaiTugas = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nilai tugas " + (i + 1) + ": ");
            nilaiTugas[i] = scanner.nextInt();
        }
    }
}