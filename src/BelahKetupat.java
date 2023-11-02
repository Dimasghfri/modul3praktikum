import java.util.Scanner;
public class BelahKetupat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi: ");
        double sisi = input.nextDouble();
        System.out.print("Masukkan Diagonal 1: ");
        double D1 = input.nextDouble();
        System.out.print("Masukkan Diagonal 2: ");
        double D2 = input.nextDouble();

         double keliling = 4 * sisi;
         double luas = (D1 * D2)/0.5;
        /**
         * @param sisi Panjang sisi belah ketupat
         * @return luas dari belah ketupat
         */
        System.out.println("Keliling dari Bangun Belah Ketupat adalah: "+keliling);

        System.out.println("Luas dari Bangun Belah Ketupat adalah: "+luas);
    }
}

