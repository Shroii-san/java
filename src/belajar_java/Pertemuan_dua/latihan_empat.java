package belajar_java.Pertemuan_dua;

import java.util.Scanner;

public class latihan_empat {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int panjang, lebar, luas, keliling;
        System.out.println("Program menghitung luas dan keliling segi empat");
        System.out.print("Masukkan Panjang : ");
        panjang = (in.nextInt());
        System.out.print("Masukkan lebar : ");
        lebar = (in.nextInt());

        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("Panjang  : "+ panjang + " cm");
        System.out.println("Lebar : "+ lebar + " cm");
        System.out.printf("Luas : %d cm\n", luas);
        System.out.printf("Keliling : %d cm\n", keliling);
    }
}
