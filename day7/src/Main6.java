//Thread for producer
class Thread61 extends Thread
{
    public void run()
    {
        try
        {
            PC.produce();
        }
        catch(Exception e)
        {}
    }
}
//Thread for consumer
class Thread62 extends Thread
{
    public void run()
    {
        try
        {
            PC.consume();
        }
        catch (Exception e)
        {}
    }
}
class PC
{
    static int value = 0;
    public static void produce() throws InterruptedException
    {
        System.out.println("Producer produced-" + ++value);
        Thread.sleep(1000);
    }
    public static void consume() throws InterruptedException
    {
        System.out.println("Consumer consumed-" + value);
        Thread.sleep(1000);
    }
}
public class Main6

{
    public static void main(String[] args) throws InterruptedException
    {
        //Creating object for thread
        Thread61 t1 = new Thread61();
        Thread62 t2 = new Thread62();
        for (int i = 0;; i++)
        {
            t1.run();
            t2.run();
        }
    }
}