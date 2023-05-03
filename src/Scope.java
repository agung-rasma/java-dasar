public class Scope {
    public static void main(String[] args) {
        sayHello("Agung");
        sayHello("");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if (!name.isEmpty()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); //error diluar scope/wilayah
    }
}
