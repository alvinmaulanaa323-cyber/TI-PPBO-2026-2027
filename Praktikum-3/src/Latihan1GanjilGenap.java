import java.util.Scanner;
public class Latihan1GanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Masukkan sebuah bilangan bulat: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan " + angka + "adalah GENAP");
        } else {
            System.out.println("Bilangan " + angka + " adalah GANJIL.");
        }
    }
}