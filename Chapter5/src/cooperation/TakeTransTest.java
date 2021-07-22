package cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee", 10000);
        Student studentKim = new Student("Kim", 120000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(4);

        studentKim.takeSubway(subwayGreen);
        studentLee.takeBus(bus100);

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        subwayGreen.showSubwayInfo();
        subwayBlue.showSubwayInfo();
    }
}
