public class SwitchStatement {
    public static void main(String[] args) {

        String nilai = "E";
        String ucapan;

        switch (nilai) {
            case "A":
                ucapan = "Emejing, Kamu Lulus Dengan Gagah Brani";
//                System.out.println(ucapan);
                break;
            case "B":
            case "C":
                ucapan = "Lumayan Juga Nilaimu";
//                System.out.println(ucapan);
                break;
            case "D":
                ucapan = "hmm....Nda bisa berkata2";
//                System.out.println(ucapan);
                break;
            default:
                ucapan = "haduhh...kayaknya kamu salah jurusan";
//                System.out.println(ucapan);
        }
        System.out.println(ucapan);

    }
}
