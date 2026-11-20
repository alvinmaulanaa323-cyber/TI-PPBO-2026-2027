public class PenggajianDemo {
    public static void main(String[] args) {

        Pegawai[] daftarPegawai = {
                new Manager("Budi", "M001", 3000000, 1000000),
                new Staff("Siti", "S001", 2000000, 500000),
                new Staff("Andi", "S002", 1800000, 500000),
                new Direktur("Doni", "D001", 5000000, 1500000, 2000000)
        };

        double totalGaji = 0;

        for (Pegawai p : daftarPegawai) {
            double gaji = p.hitungGaji();

            System.out.println(p.nama + ": " + gaji);

            totalGaji += gaji;
        }

        System.out.println("Total gaji: " + totalGaji);
    }
}