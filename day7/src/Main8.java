import java.util.Scanner;
//thread for fibonacci
class fib extends Thread
{
    public void run()
    {
//        Scanner scan = new Scanner(System.in);
        int a=0,b=1,c=0;
//        System.out.println("Enter the Limit");
        int n = 10;
        System.out.println("Fibonacci series:");
        while(n>0)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
            n=n-1;
        }
    }
}
//thread for reverse
class rev extends Thread
{
    public void run()
    {
        System.out.println("Reverse is");
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
class G8 {
    public static void main(String args[]) throws InterruptedException {
        fib t1 = new fib();
        //Starts executing the thread
        t1.start();
        //Thread waits
//        t1.sleep(4000);
        rev t2 = new rev();
        t2.start();
    }
}