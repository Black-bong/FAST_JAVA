package thread;

public class JoinTest extends Thread {

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i=start;i<=end;i++) {
            total += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinTest j1 = new JoinTest(1, 50);
        JoinTest j2 = new JoinTest(51, 100);

        j1.start();
        j2.start();

        j1.join();
        j2.join();

        int total = j1.total + j2.total;

        System.out.println("j1.total = " + j1.total);
        System.out.println("j2.total = " + j2.total);

        System.out.println(total);
    }
}
