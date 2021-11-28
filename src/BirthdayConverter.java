import java.util.StringTokenizer;

public class BirthdayConverter {
    public static void main(String[] args) {

        String birthday = "09/10/1986";

        System.out.println("Dzień urodzenia to: " + birthday.substring(0,2));
        System.out.println("Miesiąc urodzenia to: " + birthday.substring(3,5));
        System.out.println("Rok urodzenia to: " + birthday.substring(6, 10));

        StringTokenizer st = new StringTokenizer(birthday, "/");
        System.out.println("\nUrodziny: " + birthday );
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());
    }
}
