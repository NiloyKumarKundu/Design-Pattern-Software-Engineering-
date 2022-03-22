class Robot {
    private String arms;
    private String legs;
    private String head;
    private String doors;
    private String wheels;

    private String sensors;
    private String fireArms;


    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getFireArms() {
        return fireArms;
    }

    public void setFireArms(String fireArms) {
        this.fireArms = fireArms;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "arms='" + arms + '\'' +
                ", legs='" + legs + '\'' +
                ", head='" + head + '\'' +
                ", doors='" + doors + '\'' +
                ", wheels='" + wheels + '\'' +
                ", sensors='" + sensors + '\'' +
                ", fireArms='" + fireArms + '\'' +
                '}';
    }
}


interface RobotBuilder {

    void initBot();

    void assembleArms();
    void assembleLegs();
    void assembleWheels();
    void assembleHead();
    void assembleFireArms();
    void assembleSensors();
    void assembleDoors();

    Robot build();
}

class HumanoidRobotBuilder implements RobotBuilder {

    private Robot robot;

    public HumanoidRobotBuilder() {

    }

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("Setting arms");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("Setting Legs");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Setting wheels");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead( "Sofia, You look nice. Assembling head complete.");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Setting firearms");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Setting sensors");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("Setting doors");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
}

class RCCarBotBuilder implements  RobotBuilder {

    private Robot robot;

    public RCCarBotBuilder() {

    }

    @Override
    public void initBot() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        this.robot.setArms("No arms for rc bot required...");
    }

    @Override
    public void assembleLegs() {
        this.robot.setLegs("No legs for rc bot required...");
    }

    @Override
    public void assembleWheels() {
        this.robot.setWheels("Assembling finest quality wheels");
    }

    @Override
    public void assembleHead() {
        this.robot.setHead("Head is not required...");
    }

    @Override
    public void assembleFireArms() {
        this.robot.setFireArms("Assembling firearms");
    }

    @Override
    public void assembleSensors() {
        this.robot.setSensors("Assembling sensors");
    }

    @Override
    public void assembleDoors() {
        this.robot.setDoors("Assembling doors");
    }

    @Override
    public Robot build() {
        return this.robot;
    }
}



public class Main {
    public static void main(String[] args) {
        RobotBuilder builder = new HumanoidRobotBuilder();
        builder.initBot();
        builder.assembleHead();
        builder.assembleArms();
        builder.assembleLegs();
        builder.assembleSensors();

        Robot sofia = builder.build();
        System.out.println(sofia);
    }
}
