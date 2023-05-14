public class JavaDasar26MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 70};
        sayCongrats("Agung", values);

        sayCongrats("Tompel", 80, 85, 87, 78, 90);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat Bro/Sist " + name + ", Kamu Gagah");
        } else {
            System.out.println("Maaf " + name + ", Kamu Pulang Ajah");
        }
    }
}
