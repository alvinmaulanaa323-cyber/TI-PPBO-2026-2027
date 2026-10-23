
public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("Alvin", "2025573010003", 3.2);
        daftar[1] = new Mahasiswa("Revan", "2025573010082", 3.8);
        daftar[2] = new Mahasiswa("Iqbal", "2025573010098", 3.6);

        for (Mahasiswa m : daftar) {
            m.tampilkanData();
            System.out.println("---");
        }

        int jumlahCumlaude = 0;

        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahCumlaude++;
            }
        }

        System.out.println(
                "Jumlah mahasiswa cumlaude: " + jumlahCumlaude
        );
    }
}
