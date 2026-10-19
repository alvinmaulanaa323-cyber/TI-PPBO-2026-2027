public class Latihanclass {
    public static void main(String[] args){
        Mahasiswa m1 =new Mahasiswa();    // Membuat object

        m1.nama="Alvin";
        m1.nim="2025573010003";
        m1.ipk=3.55;

        Mahasiswa m2 =new Mahasiswa();
        m2.nama="Revan";
        m2.nim="2025573010082";
        m2.ipk=3.63;

        System.out.println(m1.nama+"-" + m1.ipk);
        System.out.println(m2.nama+"-" + m2.ipk);
    }
}
