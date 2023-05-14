public class JavaDasar25MethodReturnValue {
    public static void main(String[] args) {

        int result = sum(100, 100);
        System.out.println(result);

        System.out.println(sum(500, 500));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(100, "-", 50));
        System.out.println(hitung(100, "null", 50));
    }

    static int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
