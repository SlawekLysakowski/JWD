public class OnceAgain {
    public static void main(String[] args) {

// "%3s"
// 0 1 2 3
// 3 2 1 0
// indeks odwrocony = długość - 1 - i


        //

        // 1101
////        int x = (1 * 2^3) + (1 * 2^2) + (0 * 2^1) + (1 * 2^0);
//        System.out.println(x);

        String bin = "1101";
        int d = bin.length();
        long result = 0l;

        for (int i =0; i<bin.length(); i++) {
            int reverseIndex = bin.length() - 1 - i;
            char c = bin.charAt(reverseIndex);
            int bit = Character.getNumericValue(c);
            System.out.println(bit);

        }




//        double result = 0;
//
//        for(int i=0;i<bin.length();i++) {
//            if (bin.charAt(i) == '1') {
//                result += Math.pow(2, bin.length() - 1 - i);
//            }
//        }
//            long finalResult = (long)result;

//
//            System.out.println(finalResult);





}

}