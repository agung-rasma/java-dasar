public class JavaDasar12OperasiBoolean {

    public static void main(String[] args) {

        int absen = 75;
        int nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilaiAkhir;

        System.out.println(lulus);
    }
}
