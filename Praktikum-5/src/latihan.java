import java.util.Scanner;

public class latihan {

    // =====================================================
    // LATIHAN 1
    // Method Luas Persegi Panjang dan Luas Lingkaran
    // =====================================================

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }


    // =====================================================
    // LATIHAN 2
    // Method Menentukan Bilangan Prima
    // =====================================================

    static boolean isPrima(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    // =====================================================
    // LATIHAN 3
    // Method Overloading Konversi Suhu
    // =====================================================

    // Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Celsius ke Kelvin atau Fahrenheit
    static double konversiSuhu(double celsius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;

        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;

        } else {
            System.out.println("Skala tujuan tidak tersedia.");
            return 0;
        }
    }


    // =====================================================
    // LATIHAN 4
    // Method Mencari Nilai Minimum dan Maksimum Array
    // =====================================================

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }

        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }


    // =====================================================
    // LATIHAN 5
    // Method Menghitung Total dan Filter Di Atas Rata-rata
    // =====================================================

    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        // Menghitung jumlah elemen yang di atas rata-rata
        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        // Membuat array baru
        int[] hasil = new int[jumlah];

        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }


    // =====================================================
    // MAIN METHOD
    // =====================================================

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // =====================================================
        // PENGUJIAN LATIHAN 1
        // =====================================================

        System.out.println("========================================");
        System.out.println("LATIHAN 1");
        System.out.println("========================================");

        System.out.println("Luas Persegi Panjang:");

        System.out.println("P = 10, L = 5 : "
                + luasPersegiPanjang(10, 5));

        System.out.println("P = 8, L = 4  : "
                + luasPersegiPanjang(8, 4));

        System.out.println();

        System.out.println("Luas Lingkaran:");

        System.out.println("R = 7  : "
                + luasLingkaran(7));

        System.out.println("R = 10 : "
                + luasLingkaran(10));


        // =====================================================
        // PENGUJIAN LATIHAN 2
        // =====================================================

        System.out.println("\n========================================");
        System.out.println("LATIHAN 2");
        System.out.println("========================================");

        System.out.println("Bilangan prima dari 1 sampai 50:");

        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        // =====================================================
        // PENGUJIAN LATIHAN 3
        // =====================================================

        System.out.println("\n========================================");
        System.out.println("LATIHAN 3");
        System.out.println("========================================");

        System.out.println("25 Celsius ke Fahrenheit: "
                + konversiSuhu(25));

        System.out.println("25 Celsius ke Kelvin: "
                + konversiSuhu(25, "Kelvin"));

        System.out.println("30 Celsius ke Fahrenheit: "
                + konversiSuhu(30, "Fahrenheit"));


        // =====================================================
        // PENGUJIAN LATIHAN 4
        // =====================================================

        System.out.println("\n========================================");
        System.out.println("LATIHAN 4");
        System.out.println("========================================");

        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = input.nextInt();

        int[] nilaiUjian = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        System.out.println("Nilai minimum: "
                + cariNilaiMinimum(nilaiUjian));

        System.out.println("Nilai maksimum: "
                + cariNilaiMaksimum(nilaiUjian));


        // =====================================================
        // PENGUJIAN LATIHAN 5
        // =====================================================

        System.out.println("\n========================================");
        System.out.println("LATIHAN 5");
        System.out.println("========================================");

        int total = hitungTotal(nilaiUjian);

        double rataRata = (double) total / nilaiUjian.length;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

        int[] hasil = filterDiAtasRataRata(nilaiUjian);

        System.out.print("Nilai di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }

        System.out.println();

        input.close();
    }
}