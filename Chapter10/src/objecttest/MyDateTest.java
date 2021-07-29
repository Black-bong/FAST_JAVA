package objecttest;

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        MyDate myDate = (MyDate)obj;
        if(myDate.day == day && myDate.month == month && myDate.year == year) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return year + month + day;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2021, 2, 21);
        MyDate myDate2 = new MyDate(2021, 2, 21);
        MyDate myDate3 = new MyDate(2020, 1, 25);

        System.out.println(myDate1.equals(myDate2));
        System.out.println(myDate3.equals(myDate1));

        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());
    }
}
