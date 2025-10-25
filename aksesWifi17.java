import java.util.Scanner;

public class aksesWifi17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak. SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak. Jenis pengguna tidak dikenal.");
        }
    }
}
