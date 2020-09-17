import java.util.Scanner;
public class calci
{
    public static void main(String[] args)
    {
        double a,b;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a=input.nextDouble();
        b=input.nextDouble();
        System.out.println("Enter any one operator(+,-,*,/)");
        operator=input.next().charAt(0);
        switch(operator)
        {
            case'+':
                System.out.println("Sum of two numbers:"+(a+b));
                break;
            case'-':
                System.out.println("Difference of two numbers:"+(a-b));
                break;
            case'*':
                System.out.println("Product of two numbers:"+(a*b));
                break;
            case'/':
                System.out.println("Result of division:"+(a/b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
