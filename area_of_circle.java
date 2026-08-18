import java.util.Scanner;
public class area_of_circle {
    public static void main(String[] args) {
        int r; //for radius
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        r = sc.nextInt();
        area= 3.14*r*r;
        System.out.println("Area of Circle:"+ area);
        sc.close();
    }
}