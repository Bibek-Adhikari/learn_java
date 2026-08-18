import java.util.Scanner;

public class negative_positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
