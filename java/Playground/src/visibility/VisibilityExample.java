package visibility;

public class VisibilityExample {

    private static String test = "Visibility Example";
    private static VisibilityExampleTestObject object;

    public static void main(String[] args) {
        int num = 1;

        // System.out.println(test);

        // System.out.println(object.name);
        // System.out.println(object.hidden);

        doStuff();
        // System.out.println(num + num2);
        megaStringTesting("aaa AAAS");
    }

    private static void doStuff() {
        int num2 = 2;
    }


    private static void megaStringTesting(String input) {
        if (input == null) {
            System.out.println("input is null");
            return;
        }

        if (input.isEmpty()) {
            System.out.println("input is empty");
        }

        if (input.isBlank()) {
            System.out.println("input is blank");
        }

        if (input.trim().matches("a-zA-Z")) {
            System.out.println("input contains lower AND upper case letters");
        } else if (input.trim().matches("a-z")) {
            System.out.println("input contains only LOWER case letters");
        } else if (input.trim().matches("A-Z")) {
            System.out.println("input contains only UPPER case letters");
        }

        if (input.trim().matches("0-9")) {
            System.out.println("input contains numbers");
        }
    }
}
