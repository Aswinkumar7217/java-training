class aswin extends Thread
{
    public void run()
    {
        System.out.println("BETTER LUCK");
    }
}
class HAI extends Thread
{
    public void run()
    {
        System.out.println("NEXT TIME");
    }
}
public class Main3
{
    public static void main(String[] args)
    {
        aswin A = new aswin();
        HAI B = new HAI();
        for (int i = 0;; i++)
        //printing the values without any limits
        // because there is no condition
        {
            A.run();
            B.run();
        }
    }
}