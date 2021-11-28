public class NumbersTester {
    public static void main(String[] args) {
        byte a = 7;
        short b;
        int c;
        c = a;
        b = (short)c; // rzutowanie; konwersja jawna

        System.out.println(3125515);
        System.out.println((byte)3125515);

        int d = 5;
        double e = 13.5;
        double f = e / d; // konwersja niejawna
        int g = (int) e / d; // rzutowanie

        //  int -> Integer : boxing
        // Integer -> int  : unboxing




    }
}
