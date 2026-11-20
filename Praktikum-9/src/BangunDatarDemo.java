public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(3),
                new Persegi(10)
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        BangunDatar bangunTerbesar = null;

        for (BangunDatar bangun : daftarBangun) {

            bangun.tampilkanInfo();

            double luas = bangun.hitungLuas();
            totalLuas += luas;

            if (bangunTerbesar == null || luas > luasTerbesar) {
                luasTerbesar = luas;
                bangunTerbesar = bangun;
            }
        }

        System.out.println("TOTAL LUAS SELURUH BANGUN: " + totalLuas);
        System.out.println("BANGUN DENGAN LUAS TERBESAR:");
        System.out.println("Nama  : " + bangunTerbesar.namaBangun);
        System.out.println("Luas  : " + luasTerbesar);
    }
}