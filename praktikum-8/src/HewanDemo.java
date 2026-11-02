public class HewanDemo {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        kucing.nama = "Milo";
        anjing.nama = "Buddy";

        System.out.println("Nama Kucing: " + kucing.nama);
        kucing.bersuara();

        System.out.println();

        System.out.println("Nama Anjing: " + anjing.nama);
        anjing.bersuara();
    }
}