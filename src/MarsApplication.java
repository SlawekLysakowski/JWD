public class MarsApplication {
    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();
spirit.status = "eksploracja";
spirit.speed = 2;
spirit.temperature = -60;

spirit.showAttributes();
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println();

        System.out.println("zmiana temperatury do - 90");
        spirit.temperature = -90;
        spirit.checkTemperature();
        spirit.showAttributes();

        opportunity.showAttributes();
        System.out.println("Zwiększenie prędkości do 4.");
        opportunity.speed = 4;
        opportunity.showAttributes();
        System.out.println();

        System.out.println("zmiana temperatury do - 100");
        opportunity.temperature = -100;
        opportunity.status = "sprawdzanie temperatury";
        opportunity.checkTemperature();
        opportunity.showAttributes();

        opportunity.checkStatus();

            }

}

