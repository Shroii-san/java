package belajar_java.Pertemuan_dua;

public class latihan_tiga {
    public static void main(String[] args){
    int panjang, lebar, luas, keliling;
    panjang = 10;
    lebar = 20;
    luas = panjang * lebar;
    keliling = 2 * (panjang + lebar);

    System.out.println("Program menghitung luas dan keliling persegi panjang");
    System.out.println("Panjang  : "+ panjang + " cm");
    System.out.println("Lebar : "+ lebar + " cm");
    System.out.printf("Luas : %d cm\n", luas);
    System.out.printf("Keliling : %d cm\n", keliling);
    }
}
