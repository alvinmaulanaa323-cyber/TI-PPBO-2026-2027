 public class KebunBinatangDemo {
     public static void main(String[] args) {
         Hewan h1 = new Kucing("Milo");
         Hewan h2 = new Anjing("Rex");

         h1.bersuara();
         h2.bersuara();

         System.out.println();

         Hewan[] daftarhewan = {
                 new Kucing("Milo"),
                 new Anjing("Rex"),
                 new Kucing("Oyen")
         };

         for (Hewan h : daftarhewan) {
             h.bersuara();
         }

     }

 }

