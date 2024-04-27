// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        
        // Menghitung total harga tiket
        double totalHarga = tiket.harga() * jumlah;
        // Menerapkan diskon 20% untuk pembelian tahap Presale
        if (tahap.equals("Presale")) {
            totalHarga *= 0.8;
        }

        // Menampilkan informasi pemesanan
        System.out.println("\n--- NOTA PEMESANAN ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.getClass().getSimpleName());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}