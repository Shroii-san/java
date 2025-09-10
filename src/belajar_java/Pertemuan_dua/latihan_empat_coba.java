package belajar_java.Pertemuan_dua;

public class latihan_empat_coba {
    public static void main(String[] args){
        String nama, gelar, namaPanggil, namaLengkap;
        nama = "Rizal Wira";
        gelar = "Prog";

        namaPanggil = nama.substring(2,5);
        System.out.println("Nama Panggilan : " + namaPanggil);

        namaLengkap = nama + ", " + gelar;
        System.out.println("Nama Lengkap : " + namaLengkap);

        System.out.print("\n");

        String s = "satu";
        System.out.println(s);
        s = s + "";
        if (s=="satu") {
            System.out.println("string sama");
        }
        else {
            System.out.println("string berbeda");
        }

    }
}


