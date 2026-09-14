public class LogikaDemo {
    public static void main(String[] args) {
        // LANGKAH 7: Evaluasi dengan operator && (AND)
        int nilaiUjian = 80;
        int kehadiran = 90; // persen

        if (nilaiUjian >= 75 && kehadiran >= 80) {
            System.out.println("LULUS mata kuliah");
        } else {
            System.out.println("TIDAK LULUS mata kuliah");
        }

        // LANGKAH 8: Evaluasi dengan operator || (OR) dan ! (NOT)
        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println("Boleh menyewa kendaraan");
        }

        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}