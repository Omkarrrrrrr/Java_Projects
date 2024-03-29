import java.util.Scanner;

class Farmer {
    int pa; // principle amount
    float td; // time duration
    static float ri; // rate of interest
    float si; // simple interest

    static {
        ri = 8.5f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please mention the amount required");
        pa = sc.nextInt();
        System.out.println("Please mention time duration");
        td = sc.nextFloat();
        ri = 8.5f;

    }

    void calculate() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("Simple Interest is " + si);
    }

}

public class FarmerLoans {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.calculate();
        f1.disp();
        Farmer f2 = new Farmer();
        f2.input();
        f2.calculate();
        f2.disp();
    }
}