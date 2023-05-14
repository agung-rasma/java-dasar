public class JavaDasar08TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;


        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer intObject = iniInt;

        short iniShort = intObject.shortValue();
        long iniLong2 = intObject.longValue();
        float iniFloat = intObject.floatValue();

        Long amount = 1000000L;

    }
}
