package hidingtest;

// 정보은닉 - 날짜 유효성을 검증하는 프로그램 구현
public class MyDateTest {
    public static void main(String[] args) {

        MyDate myDate1 = new MyDate(33, 07, 2021);
        MyDate myDate2 = new MyDate(31, 03, 2020);
//        MyDate myDate = new MyDate();
//        myDate.setDay(31);
//        myDate.setMonth(12);
//        myDate.setYear(2021);
        myDate1.isValid();
        myDate2.isValid();
    }
}
