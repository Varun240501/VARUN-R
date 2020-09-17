import java.util.Scanner;
public class fibinocci {
    public static void main(String[] args) {
        int num, num1=0, num2=1;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers should be there in the sequence:");
        num=input.nextInt();
        System.out.println("Fibonacci Series of "+num+" numbers:");
        int i=1;
        while(i<=num)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }

}
