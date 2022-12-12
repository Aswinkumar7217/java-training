import java.util.Scanner;
class ashwin extends Thread
{
    // This Thread is for odd numbers
    public void printValue(int a)
    {
        System.out.println("A");
        System.out.println(a);
    }
}
class Kumar extends Thread
{
    // This Thread is for even numbers
    public void printValue(int a)
    {
        System.out.println("B");
        System.out.println(a);
    }
}
public class Main2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit");
        int limit = sc.nextInt();
        ashwin t1 = new ashwin();
        Kumar t2 = new Kumar();
        for (int i = 1; i <= limit; i++)
        {
            if (i % 2 == 0)
            // this condition for even numbers
            {
                t2.printValue(i);
            }
            else
            // this condition for odd numbers
            {
                t1.printValue(i);
            }
        }
        sc.close();
    }
}