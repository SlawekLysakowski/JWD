import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Nasza liczba to " + number + ".");
        System.out.println("Liczba " + number +  " jest o " + (number - 8) + " większa od liczby 8.");
        System.out.println("Jeżeli pomnożymy liczbę przez 5 to otrzymamy wartość " + (number *5) + ".");

        final double PI = 3.14159;
        float piValue = 3.14F;
        System.out.println(PI);

        double x = 0.00000000123; // 12 * 10 ^ 2 = 1200
        System.out.printf("%.10f", x);

        double a = 3E-10;
        System.out.println(a);

        int i = 0b011;
        System.out.println(i);

        int c = 0xFF;
        System.out.println(c);

//        DecimalFormat decimalFormat = new DecimalFormat(pattern: "#.##########");
//        System.out.println(decimalFormat.format(a));

    }
}
