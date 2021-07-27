package interfaceex;

public interface Calc {

    public static final double PI = Math.PI;
    public static final int ERROR = -999999;

    int sum(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);


}
