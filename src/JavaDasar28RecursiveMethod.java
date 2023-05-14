public class JavaDasar28RecursiveMethod {
    public static void main(String[] args) {
//        System.out.println(factorialLoop(10));
        //System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println("Recursive Method");
//        factorialRecursive(5);
//        System.out.println(1*2*6*24);
//        System.out.println(5*4*3*2*1);
//        System.out.println(factorialRecursive(10));
        System.out.println("Loop");
        loop(10000);
    }

    static int factorialLoop(int value) {
        int result = 1;

        for (int counter = 1; counter <= value; counter++) {
//            System.out.println(counter);
            result *= counter;
        }

        return result;
    }

    static int factorialRecursive(int value) {
//        int result = 0;
//        int nilai = factorialRecursive(value - 1);
        if (value == 1) {
            return 1;
//            result = 1;
        } else {
            return value * factorialRecursive(value - 1);
//            System.out.println(factorialRecursive(value-1));// + " factorial value " + nilai
//            result = value * factorialRecursive(value - 1);
        }
//        System.out.println(result);// + " factorial value " + nilai
//        return result;
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
