/*
 * Program KalkulatorBangunDatar.java
 *
 * Program ini meminta input pengguna untuk panjang dan lebar persegi panjang, serta jari-jari lingkaran.
 * Program menghitung dan menampilkan luas dan keliling persegi panjang serta lingkaran.
 * Selain itu, program juga menyimpan hasil luas persegi panjang ke dalam variabel boolean
 * untuk menentukan apakah luas lebih besar dari 100.
 *
 * Nama    : [Nama Anda]
 * NIM     : [NIM Anda]
 * Kelas   : [Kelas Anda]
 * Tanggal : [Tanggal Pengerjaan]
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        // Input dan perhitungan untuk persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble(); // Membaca input panjang dengan tipe double

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble(); // Membaca input lebar dengan tipe double

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil luas dan keliling persegi panjang
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
        System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);

        // Menyimpan dan menampilkan nilai boolean apakah luas > 100
        boolean luasBesar = luasPersegiPanjang > 100;
        System.out.println("Apakah luas persegi panjang > 100? " + luasBesar);

        // Input dan perhitungan untuk lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble(); // Membaca input jari-jari dengan tipe double

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil luas dan keliling lingkaran
        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        input.close(); // Menutup Scanner setelah selesai digunakan
    }
}
