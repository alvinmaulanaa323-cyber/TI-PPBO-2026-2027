import java.util.Scanner;

public class Latihan3MenuMakanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Soto Ayam");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Pilihan Anda: Nasi Goreng");
                break;
            case 2:
                System.out.println("Pilihan Anda: Mie Ayam");
                break;
            case 3:
                System.out.println("Pilihan Anda: Bakso");
                break;
            case 4:
                System.out.println("Pilihan Anda: Soto Ayam");
                break;
            default:
                System.out.println("Pilihan menu tidak valid!");
        }
    }
}