
public class TokoDemo {
    public static void main(String[] args) {
        // Membuat array berisi 5 object Produk
        Produk[] daftarProduk = new Produk[5];

        daftarProduk[0] = new Produk("P001", "Laptop", 7500000, 5);
        daftarProduk[1] = new Produk("P002", "Mouse", 150000, 20);
        daftarProduk[2] = new Produk("P003", "Keyboard", 350000, 10);
        daftarProduk[3] = new Produk("P004", "Monitor", 2200000, 3);
        daftarProduk[4] = new Produk("P005", "Headset", 500000, 8);

        // Menampilkan seluruh data produk
        System.out.println("=== DAFTAR PRODUK ===");

        for (Produk p : daftarProduk) {
            p.tampilkanData();
            System.out.println("------------------------------");
        }

        // Simulasi pembelian
        System.out.println("\n=== SIMULASI PEMBELIAN ===");

        // Pembelian pertama: stok mencukupi
        System.out.println("\nPembelian Laptop:");

        int jumlahBeli1 = 2;

        System.out.printf(
                "Total harga: Rp%.0f%n",
                daftarProduk[0].hitungTotalHarga(jumlahBeli1)
        );

        daftarProduk[0].kurangiStok(jumlahBeli1);

        // Pembelian kedua: stok tidak mencukupi
        System.out.println("\nPembelian Monitor:");

        int jumlahBeli2 = 10;

        System.out.printf(
                "Total harga: Rp%.0f%n",
                daftarProduk[3].hitungTotalHarga(jumlahBeli2)
        );

        daftarProduk[3].kurangiStok(jumlahBeli2);

        // Mencari produk dengan harga termahal
        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL ===");

        Produk termahal = daftarProduk[0];

        for (Produk p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }

        termahal.tampilkanData();
    }
}
