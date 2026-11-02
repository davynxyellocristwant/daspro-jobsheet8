import java.util.Scanner;

public class tugas3_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        System.out.println();

        int totalSeluruhBarang = 0;
        int banyakBarang = -1;
        int tokoTerbaik = 1;

        String ringkasan = "";

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan ke-" + j + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }

            ringkasan += "Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";

            totalSeluruhBarang += totalBarangToko;

            if (totalBarangToko > banyakBarang) {
                banyakBarang = totalBarangToko;
                tokoTerbaik = i;
            }
            
            System.out.println();
        }

        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        System.out.println();

        sc.close();
    }
}