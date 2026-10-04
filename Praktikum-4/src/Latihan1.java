
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Mencetak tabel perkalian dari 1 sampai 10
        System.out.println("\nTabel Perkalian " + bilangan);
        System.out.println("--------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    bilangan + " x " + i + " = " + (bilangan * i)
            );
        }

        input.close();
    }
}
