public class JavaDasar14IfStatement {
    public static void main(String[] args) {

        int nilai = 80;
        int absen = 30;

        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;

        boolean lulus = lulusNilai && lulusAbsen;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("NIlai Anda E");
        }
    }
}
