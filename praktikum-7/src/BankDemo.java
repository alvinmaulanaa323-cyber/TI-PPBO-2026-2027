
public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua rekening bank
        RekeningBank rek1 = new RekeningBank(
                "001", "Alvin Maulana", "Tabungan", 100000
        );

        RekeningBank rek2 = new RekeningBank(
                "002", "Muhammad Varel", "Giro", 200000
        );

        // Transaksi rekening Alvin Maulana
        System.out.println("=== TRANSAKSI ALVIN MAULANA ===");
        rek1.setor(50000);
        rek1.tarik(20000);

        // Transaksi rekening Muhammad Varel
        System.out.println("\n=== TRANSAKSI MUHAMMAD VAREL ===");
        rek2.setor(100000);
        rek2.tarik(50000);

        // Transfer berhasil
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 30000);

        // Transfer gagal karena saldo tidak mencukupi
        System.out.println("\n=== TRANSFER GAGAL: SALDO TIDAK CUKUP ===");
        rek1.transferKe(rek2, 500000);

        // Transfer gagal karena jumlah negatif
        System.out.println("\n=== TRANSFER GAGAL: JUMLAH TIDAK VALID ===");
        rek1.transferKe(rek2, -10000);

        // Pengujian transfer ke rekening sendiri
        System.out.println("\n=== TRANSFER KE REKENING SENDIRI ===");
        rek1.transferKe(rek1, 10000);

        // Pengujian transfer tanpa rekening tujuan
        System.out.println("\n=== TRANSFER TANPA REKENING TUJUAN ===");
        rek1.transferKe(null, 10000);

        // Pengujian validasi setor dan tarik
        System.out.println("\n=== VALIDASI SETOR DAN TARIK ===");
        rek1.setor(-5000);
        rek1.tarik(-5000);

        // Mencetak mutasi akhir kedua rekening
        System.out.println("\n=== MUTASI AKHIR ALVIN MAULANA ===");
        rek1.cetakMutasi();

        System.out.println("\n=== MUTASI AKHIR MUHAMMAD VAREL ===");
        rek2.cetakMutasi();
    }
}
