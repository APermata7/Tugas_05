import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Meminta input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        // Memilih tahap pembelian
        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();

        Pemesanan pesanan = null;

        // Memproses pembelian sesuai tahap yang dipilih
        if (tahapPembelian == 1) {
            // Pembelian tahap presale
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();

            System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
            int jumlahTiket = scanner.nextInt();

            // Memilih jenis tiket sesuai input pengguna
            Tiket tiket;
            if (jenisTiket == 1) {
                tiket = new VIP();
            } else if (jenisTiket == 2) {
                tiket = new VVIP();
            } else {
                // Menampilkan pesan jika input tidak valid
                System.out.println("Input tidak valid!");
                return;
            }

            // Membuat objek pesanan untuk tahap presale
            pesanan = new Pemesanan(nama, "Presale", tiket, jumlahTiket);
        } else if (tahapPembelian == 2) {
            // Pembelian tahap reguler
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();

            System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
            int jumlahTiket = scanner.nextInt();

            // Memilih jenis tiket sesuai input pengguna
            Tiket tiket;
            if (jenisTiket == 1) {
                tiket = new Festival();
            } else if (jenisTiket == 2) {
                tiket = new VIP();
            } else if (jenisTiket == 3) {
                tiket = new VVIP();
            } else {
                // Menampilkan pesan jika input tidak valid
                System.out.println("Input tidak valid!");
                return;
            }

            // Membuat objek pesanan untuk tahap reguler
            pesanan = new Pemesanan(nama, "Reguler", tiket, jumlahTiket);
        } else {
            // Menampilkan pesan jika input tidak valid
            System.out.println("Input tidak valid!");
            return;
        }

        // Mencetak nota pembelian
        pesanan.cetakNota();
        
    }
}