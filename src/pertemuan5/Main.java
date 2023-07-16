package pertemuan5;

public class Main {
    public static void main(String[] args){
        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie",3000),
                new Barang("Baju",150000),
                new Barang("Beras",20000),
                new Barang("Sosis",15000),
                new Barang("Celana",200000)
        };

        System.out.println("Jumlah Barang di etalase : "+etalase.length);

        System.out.println("Daftar Barang di etalase : ");
        int i = 1;

        for (Barang b :etalase){
            System.out.println("Barang ke-"+i);
            b.showInfo();
            i++;
        }

        for(int j =0; j<etalase.length;j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }
    }
}
