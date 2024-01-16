{
 public static void main(String[] args) {
        Dalton joe = new Dalton("Joe", 137);
        Dalton jack = new Dalton("Jack", 165);
        Dalton william = new Dalton("William", 190);
        Dalton averell = new Dalton("Averell", 210);
        System.out.println(joe.parle());
        System.out.println(jack.parle());
        System.out.println(william.parle());
        System.out.println(averell.parle());
    }
}
public void parle() {
        System.out.println(joe.parle());
        System.out.println(jack.parle());
        System.out.println(william.parle());
        System.out.println(averell.parle());
    }
 {
       public static void main(String[] args) {
        SimulRobot robot = new SimulRobot();

        robot.deplace(60);
        robot.parle();
    }
}