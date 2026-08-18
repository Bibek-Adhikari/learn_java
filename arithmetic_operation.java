import java.util.Scanner;
public class arithmetic_operation {
    public static void main(String[] args) {
        int n1, n2, sum, diff, multi;
        double div, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sum = n1 + n2;
        diff = n1 - n2;
        multi = n1 * n2;
        div = (double) n1 / n2;
        rem = n1 % n2;
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + diff);
        System.out.println("Multiplication : " + multi);
        System.out.println("Division : " + div);
        System.out.println("Remainder : " + rem);
        sc.close();
    }
}