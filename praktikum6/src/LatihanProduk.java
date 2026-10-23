
public class LatihanProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Laptop", 7500000, 5);
        Produk p2 = new Produk("P002", "Mouse", 150000, 20);

        double batasHarga = 1000000;

        System.out.println("Produk: " + p1.namaProduk);
        System.out.println("Harga: " + p1.harga);
        System.out.println("Mahal? " + p1.isMahal(batasHarga));

        System.out.println("----------------");

        System.out.println("Produk: " + p2.namaProduk);
        System.out.println("Harga: " + p2.harga);
        System.out.println("Mahal? " + p2.isMahal(batasHarga));
    }
}
