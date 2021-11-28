public class Lab5 {
    public static void main(String[] args) {

        // zadanie 1

        System.out.println("Gdyby wartość kwoty 14000 zł zwiększyła się w pierwszym roku o 40%, w drugim roku zanotowała stratę w wysokości 1500 zł, a w trzecim roku zwiększyła się o 12%, to jej wartość wyniesie " + ((14000 *1.4) - 1500) * 1.12);

        // zadanie 2

    int x =35;
    boolean isDividable = x % 7 == 0  && x % 5 == 0;
        System.out.println(isDividable);

        // zadanie 3

        int number = 1245;
        int bitPosition = 2;
        int mask = 1 << bitPosition;
        boolean result = (number & mask) > 0;

        System.out.print("Dla liczby " + number + " na " + bitPosition +  " pozycji " );
        System.out.print(result ? "jest " : "nie jest ");
        System.out.println("ustawiony bit");

        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0'));

    }
}
