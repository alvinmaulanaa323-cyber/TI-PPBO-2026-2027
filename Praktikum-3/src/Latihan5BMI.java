import java.util.Scanner;

public class Latihan5BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = sc.nextDouble();

        // Konversi tinggi ke meter
        double tinggiM = tinggiCm / 100;

        // Hitung BMI
        double bmi = berat / (tinggiM * tinggiM);

        String kategori;

        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi < 25.0) {
            kategori = "Normal";
        } else if (bmi < 30.0) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }

        System.out.printf("BMI Anda: %.2f\n", bmi);
        System.out.println("Kategori: " + kategori);
    }
}