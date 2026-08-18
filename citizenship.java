import java.util.Scanner;

public class citizenship {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for citizenship");
        } else {
            System.out.println("You are not eligible for citizenship");
        }
        sc.close();
    }
}
