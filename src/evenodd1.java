import java.util.Scanner;

public class evenodd1 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not wierd");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Wierd");
            } else if (n > 20) {
                System.out.println("Not Wierd");
            }
        } else {
            System.out.println("Wierd");
        }
    }
}