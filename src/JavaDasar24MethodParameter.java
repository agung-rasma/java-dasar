public class JavaDasar24MethodParameter {
    public static void main(String[] args) {
        sayHello("Agung", "Rasma");
        sayHello("Wayan", "Balik");
        sayHello("Ketut", "Ugig");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
