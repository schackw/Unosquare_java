import functions.InatorInator;

public class Main {
    public static void main(String[] args) {


        String value = "Shrinka";
        String ceros = "000";
        String ultimo = value.substring(value.length() - 1);
        System.out.println(ultimo);
        if (ultimo.toLowerCase().equals("a") || ultimo.toLowerCase().equals("e")|| ultimo.toLowerCase().equals("i")|| ultimo.toLowerCase().equals("o")|| ultimo.toLowerCase().equals("u")) {
            System.out.println("inatorinator" + " " + value + value.length() + ceros);
        } else {
            System.out.println(value + " " + value.length() + ceros);
        }

    }
}

