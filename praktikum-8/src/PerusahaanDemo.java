public class PerusahaanDemo {
    public static void main(String[] args) {

        // Membuat objek Manager
        Manager manager = new Manager(
                "Budi", "M001", 7000000, 2000000
        );

        // Membuat objek Staff
        Staff staff = new Staff(
                "Andi", "S001", 4000000, 750000
        );

        // Membuat objek Direktur
        Direktur direktur = new Direktur(
                "Citra", "D001", 10000000, 5000000, 3000000
        );

        // Menampilkan data Manager
        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanData();

        // Menampilkan data Staff
        System.out.println("\n=== DATA STAFF ===");
        staff.tampilkanData();

        // Menampilkan data Direktur
        System.out.println("\n=== DATA DIREKTUR ===");
        direktur.tampilkanData();
    }
}