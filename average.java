import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        int n1, n2;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        avg = (n1 + n2) / 2.0;
        System.out.println("Average = " + avg);
        sc.close();
    }
}
