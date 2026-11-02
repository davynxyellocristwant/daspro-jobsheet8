import java.util.Scanner;
public class tugas2_02 {
    public static void main(String[] argys) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d ", hasil);
                totalAngka += hasil;
            }
            System.out.println();
        }
        System.out.println("Total seluruhangka: " + totalAngka);
        
        sc.close();
    }
}
