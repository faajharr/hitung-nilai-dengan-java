import java.util.Scanner;

public class TugasFajar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI TUGAS FAJAR");
        System.out.println("PILIH MENU:");
        System.out.println("1. HITUNG RATA-RATA NILAI ULANGAN");
        System.out.println("2. HITUNG RATA-RATA NILAI MAPEL");
        System.out.print("Masukkan pilihan: ");
        int pilih = scanner.nextInt();
        scanner.nextLine(); // Menangani enter setelah input angka

        if (pilih == 1) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Jurusan: ");
            String jurusan = scanner.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = scanner.nextLine();

            System.out.print("Masukkan Nilai UAS: ");
            int uas = scanner.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            int uts = scanner.nextInt();
            System.out.print("Masukkan Nilai UH: ");
            int uh = scanner.nextInt();

            int rata = (uas + uts + uh) / 3;

            System.out.println("\n===============================================");
            System.out.println("NAMA      : " + nama);
            System.out.println("KELAS     : " + kelas);
            System.out.println("JURUSAN   : " + jurusan);
            System.out.println("===============================================");
            System.out.println("NILAI UAS : " + uas);
            System.out.println("NILAI UTS : " + uts);
            System.out.println("NILAI UH  : " + uh);
            System.out.println("===============================================");
            System.out.println("RATA-RATA NILAI ULANGAN: " + rata);
        } 
        else if (pilih == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String jurusan = scanner.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = scanner.nextLine();

            System.out.print("Masukkan Nilai Bahasa Indonesia: ");
            int bi = scanner.nextInt();
            System.out.print("Masukkan Nilai Matematika: ");
            int mt = scanner.nextInt();
            System.out.print("Masukkan Nilai Bahasa Inggris: ");
            int bing = scanner.nextInt();

            int rata = (bi + mt + bing) / 3;

            System.out.println("\n===============================================");
            System.out.println("NAMA        : " + nama);
            System.out.println("KELAS       : " + kelas);
            System.out.println("ALAMAT      : " + jurusan);
            System.out.println("===============================================");
            System.out.println("NILAI BAHASA INDONESIA : " + bi);
            System.out.println("NILAI MATEMATIKA       : " + mt);
            System.out.println("NILAI BAHASA INGGRIS   : " + bing);
            System.out.println("===============================================");
            System.out.println("RATA-RATA NILAI PELAJARAN: " + rata);
        } 
        else {
            System.out.println("Maaf, input yang Anda masukkan tidak terdaftar.");
        }

        scanner.close();
    }
}
