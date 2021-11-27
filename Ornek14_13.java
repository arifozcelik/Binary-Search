package NesneYonelimliProgramlamaKitap;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek14_13 {
    static int[] A = {2,13,4,6,17,12,34,67,89};
    private static Scanner ara;

    public static void main(String[] args) {
        Arrays.sort(A); //dizi sıralandı
        System.out.printf("Sıralı dizi: ");

        //for each döngüsü ile ekrana yazdırıldı
        for (int dizi: A){
            System.out.printf("%d ", dizi);
        }
        System.out.printf("\nAranan Sayi:");
        ara = new Scanner(System.in);
        int Aranan = ara.nextInt();

        //ikili arama yapıldı
        int b = Arrays.binarySearch(A,Aranan);
        if (b>0)
            System.out.printf("Aranan %d. sırada bulundu", b);
        else
            System.out.printf("Aranan bulunamadı");
    }
}
