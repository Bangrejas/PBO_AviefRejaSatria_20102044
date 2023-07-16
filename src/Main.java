// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        pegawai.nip = 191220032;
        pegawai.nama = "Ahmad";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);

        pegawai.showInfo();
        pegawai.extraInfo();
    }


















//    public static void main(String[] args) {

//        SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
//        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
//        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

//        SepedaMotor suzuki = new SepedaMotor();
//        SepedaMotor yamaha = new SepedaMotor();
//        SepedaMotor honda = new SepedaMotor();

//        suzuki.merk = "suzuki";
//        suzuki.tipe = "GSX 150R";
//        suzuki.harga = 20000000;
//
//        yamaha.merk = "Yamaha";
//        yamaha.tipe = "YZF R15";
//        yamaha.harga = 25000000;
//
//        honda.merk = "Honda";
//        honda.tipe = "CBR 150R";
//        honda.harga = 23500000;

//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();
//
//        System.out.println("Motor Merk"+suzuki.getMerk()+ "dengan tipe (before) :"+ suzuki.getTipe());
//        suzuki.setTipe("Satria FU");
//        System.out.println("Motor Merk"+suzuki.getMerk()+ "dengan tipe (before) :"+ suzuki.getTipe());
//
//    }
}