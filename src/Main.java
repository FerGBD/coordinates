import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x:");
        int x = sc.nextInt();
        System.out.print("Enter the value of y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third");
            }
            else {
                System.out.println("Fourth");
            }
            System.out.print("Enter the value of x:");
            x = sc.nextInt();
            System.out.print("Enter the value of y:");
            y = sc.nextInt();
        }
        sc.close();

    }
}