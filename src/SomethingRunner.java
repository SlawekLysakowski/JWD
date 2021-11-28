public class SomethingRunner {
    public static void main(String[] args) {
        Something something = new Something();

        something.height = 10;
        something.width = 15;
        something.depth = 10;

        System.out.println("wymiary obiektu Something to: " +  something.height + ", " + something.width + ", " + something.depth);
    }
}
