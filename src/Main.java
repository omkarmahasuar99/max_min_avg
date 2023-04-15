import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Enter number #" + i + ": ");
            int a = scanner.nextInt();
            if (a > max)
            {
                max = a;
            }
            if (a < min)
            {
                min = a;
            }
            sum =sum+a;
        }
        double avg = (double) sum / 10;
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        System.out.println("Average is: " + avg);
    }
}
