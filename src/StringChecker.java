public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Tekst to: " + str);
        System.out.println("Długośc tekstu to: " + str.length());

        System.out.println(str.length());

        System.out.println("znak na pozycji 6 to: " + str.length());

        System.out.println(str.charAt(6));
       str.substring(10, 16);
        System.out.println(str.substring(10, 16));
        System.out.println("indeks pierwszej litery t: " + str.indexOf('t'));
        System.out.println("indeks pipoczątku tekstu \"długi\": " + str.indexOf("długi"));
        System.out.println("tekst dużymi " +  str.toUpperCase());




        //znak na pozycji 6
        // fragment od zanku 10 - 16
        // indeks pierwsze litery t
        // indeks początku tekstu długi




    }
}
