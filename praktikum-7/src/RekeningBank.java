
public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    // Constructor
    public RekeningBank(String nomor, String pemilik,
                        String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method setor
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // Method tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Method transfer untuk memindahkan saldo ke rekening tujuan
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null || tujuan == this) {
            System.out.println("Transfer gagal! Rekening tujuan tidak valid.");
        } else if (jumlah <= 0) {
            System.out.println("Transfer gagal! Jumlah harus lebih dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil!");
            System.out.println("Jumlah transfer: Rp" + jumlah);
        }
    }

    // Method cetak mutasi
    public void cetakMutasi() {
        System.out.println("================================");
        System.out.println("         LAPORAN MUTASI         ");
        System.out.println("================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println("================================");
    }
}
