public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum di isi";
        nim = "-";
        ipk = 0.0;
    }
    public Mahasiswa(String namaAwal, String nimAwal, double ipkAwal){
        this.nama=namaAwal;
        this.nim=nimAwal;
        this.ipk=ipkAwal;

        }
    }
