public class Latihanclass {
    public static void main(String[] args){
        Mahasiswa m1 =new Mahasiswa();    // Membuat object
        Mahasiswa m2 = new Mahasiswa("Alvin","2025573010003",3.63); // berparameter

        System.out.println(m1.nama+"-" + m1.ipk);
        System.out.println(m2.nama+"-" + m2.ipk);
    }
}
