import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {
        int accountBallance = 15_005;
        System.out.println(accountBallance);
        System.out.printf("Saldo: %,d zł%n", accountBallance);
        // %[flags] [width] [.precision] conversion-character
        // s - formats strings
        // d - decimals decimal integers
        // f - formats zminnoprzecinkowe
        // t - data czas
        // b - Boolean

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"%.3f%n", pi );

    }


}
