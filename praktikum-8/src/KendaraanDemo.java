public class KendaraanDemo {
    public static void main(String[] args) {

        Mobil mobil = new Mobil("Toyota Supra", 190, 2);

        Motor motor = new Motor("Yamaha", 150, "Manual");

        mobil.tampilkanInfo();

        System.out.println();


        System.out.println("Merek Motor: " + motor.merek);
        System.out.println("Kecepatan Maksimal Motor: " + motor.kecepatanMaks);
    }
}