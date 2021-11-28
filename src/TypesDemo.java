import java.math.BigDecimal;

public class TypesDemo {
     public static void main(String[] args) {

        //liczby całkowite

        // byte  -1 00000000
        // short -2 00000000 00000000
        // int -  4 00000000 00000000 00000000 00000000
        // long - 8 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        byte b =120;
        short s = 12033;
        int i = 1_200_000_000;
        long l = 12_222_222_222_22l;

        double d = 34.443657777777777777777777777777;
        float f = 34.443F;
        char c = 'c';
        System.out.println((int)c);
        System.out.println('\'');
        System.out.println("\t");

        // TYP LOGICZNY
        boolean chosen = true;
        boolean isBigger = b > 7;

        System.out.println(isBigger);

        // ciągi znaków
         String name = "Ala";
         System.out.println("Cześć. jestem " + name);
         System.out.println("tekst " + (1 + 4));
    }
}

