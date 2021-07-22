package hidingtest;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    public int getDay() { return day = day; }
    public int getMonth() { return month = month; }
    public int getYear() { return year = year; }

    public MyDate() { }

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void isValid() {
        if((getDay() < 1 || getDay() > 31) || (getMonth() < 1 || getMonth() > 12)) {
            System.out.println("유효 하지 않은 날짜 입니다.");
        }
        else {
            System.out.println(getYear() + "년 " + getMonth() + "월 " + getDay() + "일은 유효한 날짜 입니다.");
        }
    }
}
