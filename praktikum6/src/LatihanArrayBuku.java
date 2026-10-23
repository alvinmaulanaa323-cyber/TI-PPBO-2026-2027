public class LatihanArrayBuku {
    public static void main(String[] args) {
        Buku[] daftarBuku = new Buku[4];

        daftarBuku[0] = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        daftarBuku[1] = new Buku("Bumi", "Tere Liye", 2014);
        daftarBuku[2] = new Buku("Hujan", "Tere Liye", 2016);
        daftarBuku[3] = new Buku("Pulang", "Tere Liye", 2015);

        System.out.println("Buku yang terbit setelah tahun 2015:");

        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit > 2015) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Pengarang: " + buku.pengarang);
                System.out.println("Tahun Terbit: " + buku.tahunTerbit);
                System.out.println("----------------");
            }
        }
    }
}
