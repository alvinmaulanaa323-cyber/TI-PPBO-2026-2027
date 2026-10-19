import java.util.Scanner;
class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mencari luas dan keliling persegi panjang
        System.out.println("Mencari Luas dan Keliling Persegi Panjang\n");

        System.out.print("Masukkan panjang dari persegi panjang yang diketahui : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar dari persegi panjang yang diketahui : ");
        double lebar = input.nextDouble();

        // Rumus persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang adalah :" + luas);
        System.out.println("Keliling Persegi Panjang adalah :" + keliling);

        // Mencari luas dan keliling lingkaran
        System.out.println("Mencari Luas dan Keliling Lingkaran\n");

        System.out.print("Masukkan jari-jari dari lingkaran yang diketahui : ");
        double jariJari = input.nextDouble();

        // Rumus lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("Luas Lingkaran adalah : " + luasLingkaran);
        System.out.println("Keliling Lingkaran adalah : " + kelilingLingkaran);

        // Memeriksa apakah luas persegi panjang lebih besar dari 100
        boolean luasBesar = luas > 100;
        System.out.println("Apakah luas persegi panjang > 100? (luasbesar) :" + luasBesar);

        input.close();
    }
}
