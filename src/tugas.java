public class tugas {
    // Class PaketLayanan untuk menyimpan informasi mengenai paket layanan
    class PaketLayanan {
        private String namaPaket;
        private String benefit;
        private int biaya;

        public PaketLayanan(String namaPaket, String benefit, int biaya) {
            this.namaPaket = namaPaket;
            this.benefit = benefit;
            this.biaya = biaya;
        }

        public String getNamaPaket() {
            return namaPaket;
        }

        public String getBenefit() {
            return benefit;
        }

        public int getBiaya() {
            return biaya;
        }
    }

    // Class JasaLayanan untuk mengatur paket-paket yang tersedia
    class JasaLayanan {
        private ArrayList<PaketLayanan> paketLayanan;

        public JasaLayanan() {
            paketLayanan = new ArrayList<>();
        }

        public void tambahPaketLayanan(PaketLayanan paket) {
            paketLayanan.add(paket);
        }

        public void tampilkanPaketLayanan() {
            for (PaketLayanan paket : paketLayanan) {
                System.out.println("Nama paket: " + paket.getNamaPaket());
                System.out.println("Benefit: " + paket.getBenefit());
                System.out.println("Harga: " + paket.getBiaya());
                System.out.println();
            }
        }

        public int hitungTotalBiaya(ArrayList<String> paketDipilih) {
            int totalBiaya = 0;
            for (String namaPaket : paketDipilih) {
                for (PaketLayanan paket : paketLayanan) {
                    if (paket.getNamaPaket().equalsIgnoreCase(namaPaket)) {
                        totalBiaya += paket.getBiaya();
                        break;
                    }
                }
            }
            return totalBiaya;
        }
    }

    // Class Main untuk menjalankan program
    public class Main {
        public static void main(String[] args) {
            JasaLayanan jasaLayanan = new JasaLayanan();

            // Menambahkan paket-paket layanan
            PaketLayanan paket1 = new PaketLayanan("Paket Unlimited", "24 jam nonstop 30 hari FUP 5GB/hari", 118000);
            PaketLayanan paket2 = new PaketLayanan("Paket Basic", "12 jam penggunaan 15 hari FUP 2GB/hari", 69000);
            PaketLayanan paket3 = new PaketLayanan("Paket Lite", "6 jam penggunaan 7 hari FUP 1GB/hari", 39000);

            jasaLayanan.tambahPaketLayanan(paket1);
            jasaLayanan.tambahPaketLayanan(paket2);
            jasaLayanan.tambahPaketLayanan(paket3);

            // Menampilkan paket-paket layanan yang tersedia
            System.out.println("Paket Layanan Tersedia:");
            jasaLayanan.tampilkanPaketLayanan();

            // Contoh penggunaan: menghitung total biaya paket yang dipilih
            ArrayList<String> paketDipilih = new ArrayList<>();
            paketDipilih.add("Paket Unlimited");
            paketDipilih.add("Paket Basic");

            int totalBiaya = jasaLayanan.hitungTotalBiaya(paketDipilih);
            System.out.println("Total biaya: " + totalBiaya);
        }
    }

}
