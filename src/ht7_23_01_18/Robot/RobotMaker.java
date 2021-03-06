package ht7_23_01_18.Robot;

public class RobotMaker {
    private static Head heads1[] = new Head[1];
    private static Head heads2[] = new Head[2];
    private static Head heads3[] = new Head[3];

    private static Leg legs1[] = new Leg[1];
    private static Leg legs2[] = new Leg[2];
    private static Leg legs3[] = new Leg[3];

    private static Hand hands1[] = new Hand[1];
    private static Hand hands2[] = new Hand[2];
    private static Hand hands3[] = new Hand[3];

    private static Robot robot1;
    private static Robot robot2;
    private static Robot robot3;

    public static void main(String[] args) {
        createHeads();
        createLegs();
        createHands();

        createRobots();
        getInfoAboutRobots();

    }

    private static void createHeads() {
        heads1[0] = new Head(5,"Red");

        heads2[0] = new Head(2,"Blue");
        heads2[1] = new Head(2,"Green");

        heads3[0] = new Head(2,"Blue");
        heads3[1] = new Head(3,"Green");
        heads3[2] = new Head(1,"Red");
    }

    private static void createLegs() {
        legs1[0] = new Leg(5,46);

        legs2[0] = new Leg(2,45);
        legs2[1] = new Leg(2,43);

        legs3[0] = new Leg(2,36);
        legs3[1] = new Leg(3,23);
        legs3[2] = new Leg(1,38);
    }

    private static void createHands() {
        hands1[0] = new Hand(5);

        hands2[0] = new Hand(5);
        hands2[1] = new Hand(2);

        hands3[0] = new Hand(2);
        hands3[1] = new Hand(3);
        hands3[2] = new Hand(6);
    }

    public static void createRobots(){
        robot1 = new Robot("Protocol droid","C-3PO",legs2,hands1,heads3);
        robot2 = new Robot("Astromech droid"," R2-D2",legs2,hands2,heads1);
        robot3 = new Robot("Battle droid"," HK-47",legs1,hands3,heads2);
    }

    public static void getInfoAboutRobots(){
        robot1.printRobotStatus();
        robot2.printRobotStatus();
        robot3.printRobotStatus();
    }
}
