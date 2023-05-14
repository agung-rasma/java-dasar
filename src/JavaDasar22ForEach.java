public class JavaDasar22ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Agung", "Wijaya", "Rasma",
                "Bukan", "Programmer", "Pemula"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("\nFor Each\n");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
