public class Progression {

    private int Frist;
    private int Move;


    public Progression(int Move, int Frist) {
        this.Frist = Frist;
        this.Move = Move;
    }

    public Progression() {
        this.Frist = -3;
        this.Move = 2;


    }

    public int getElement(int k) {
        int num = Frist;
        for (int count = 0; count < k; count++) {
            num = num + Move;
        }
        return num;
    }

    public void showProg(int n) {
        int num = Frist;
        System.out.print(num + ",");
        for (int count = 0; n > count; count++) {
            num = num + Move;
            System.out.print(num + ",");
        }
    }

    public void showProg() {
        showProg(10);
    }

    public void showProgUpTo(int n) {
        for (int num = Frist; num < n; num = num + Move) {
            System.out.print(num + ",");
        }
    }

    public int sum(int n) {
        int num = Frist;
        int sum = 0;
        for (int count = 0; count <= n; num = num + Move) {
            sum = sum + num;
            count++;
        }
        return sum;
    }

}