package belajar_java.Pertemuan_dua;

import java.util.Scanner;

public class latihan_lima_coba {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Masukkan nama anda : ");
        String nama = (in.nextLine());

        System.out.println("Masukkan umur anda : ");
        int umur = (in.nextInt());

        System.out.println("Masukkan nominal uang saku : ");
        Double uang = (in.nextDouble());
    }
}

