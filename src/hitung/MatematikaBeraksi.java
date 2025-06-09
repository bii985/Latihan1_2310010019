package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika qalbi = new Matematika(1,9);
        
        System.out.println("Hasil Penjumlahan : " +qalbi.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " +qalbi.setPengurangan());
        System.out.println("Hasil Perkalian : " +qalbi.setPerkalian());
        System.out.println("Hasil Pembagian : " +qalbi.setPembagian());
    }
}
