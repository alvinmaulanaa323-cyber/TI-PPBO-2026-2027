public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, double kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks);
    }
}
