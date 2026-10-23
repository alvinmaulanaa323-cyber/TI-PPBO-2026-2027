public class Latihanclass {
    public static void main(String[] args) {
        Mahasiswa m2 = new Mahasiswa("Alvin", "2025573010003", 3.90);

        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}
