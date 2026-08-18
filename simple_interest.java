import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        double p, t, r, SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        p = sc.nextDouble();
        System.out.println("Enter Time:");
        t = sc.nextDouble();
        System.out.println("Enter Rate:");
        r = sc.nextDouble();
        SI = (p * t * r) / 100;
        System.out.println("Simple Interest = " + SI);
        sc.close();
    }
}