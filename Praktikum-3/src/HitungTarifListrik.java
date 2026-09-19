import java.util.Scanner;
    public class HitungTarifListrik {
    public static void main (String[] args) {

    final double TARIF_450 = 415.0;
    final double TARIF_900 = 1352.0;
    final double TARIF_1300 = 1444.70;
    final double TARIF_2200 = 1444.70;
    final double TARIF_ABOVE_2200 = 1699.53;

    Scanner input = new Scanner(System.in);

    System.out.println("===========================================");
    System.out.println("   PROGRAM PENGHITUNG TARIF LISTRIK PLN    ");
    System.out.println("===========================================");

    System.out.println("Pilihan Golongan Daya Listrik (VA):");
    System.out.println("1. 450 VA");
    System.out.println("2. 900 VA");
    System.out.println("3. 1300 VA");
    System.out.println("4. 2200 VA ");
    System.out.println("5. Di atas 220 VA");
    System.out.print("Masukkan pilihan daya (450 / 900 / 1300 / 2200 / >2200 -> ketik nilainya ):");
    int daya = input.nextInt();

    System.out.println("Masukkan jumlah pemakaian listrik (kwh) ");
    double kwh = input.nextDouble();


    if (kwh <= 0) {
        System.out.println("\n[ERROR] input pemakaian kwh tidak valid! jumlah kwh harus lebih besar dari 0.");
    }else{
        double tarifPerKwh = 0;
        String labelGolongan = "";
        boolean dayaValid = true;

        // Logika percabangan untuk menentukan tarif berdasarkan daya
        switch (daya) {
            case 450:
                tarifPerKwh = TARIF_450;
                labelGolongan = "450 VA";
                break;
            case 900:
                tarifPerKwh = TARIF_900;
                labelGolongan = "900 VA";
                break;
            case 1300:
                tarifPerKwh = TARIF_1300;
                labelGolongan = "1300 VA";
                break;
            case 2200:
                tarifPerKwh = TARIF_2200;
                labelGolongan = "2200 VA";
                break;
            default:
                if (daya > 2200) {
                    tarifPerKwh = TARIF_ABOVE_2200;
                    labelGolongan = "> 2200 VA";
                } else {
                    dayaValid = false;
                    System.out.println("\n[ERROR] Golongan daya yang Anda masukkan tidak valid!");
                }
                break;
        }

        // Tampilkan hasil jika daya valid
        if (dayaValid) {
            double totalTagihan = kwh * tarifPerKwh;

            System.out.println("\n===========================================");
            System.out.println("          RINCIAN TAGIHAN LISTRIK          ");
            System.out.println("===========================================");
            System.out.printf("Golongan Daya   : %s\n", labelGolongan);
            System.out.printf("Pemakaian kWh   : %.2f kWh\n", kwh);
            System.out.printf("Tarif per kWh   : Rp %,.2f\n", tarifPerKwh);
            System.out.println("-------------------------------------------");
            System.out.printf("TOTAL TAGIHAN   : Rp %,.2f\n", totalTagihan);
            System.out.println("===========================================");
        }
    }

        input.close();
    }
    }




