class A implements Runnable
{
    @Override
    public void run() {

    }
    // first we want to use Threads to use setName Method
}
class B extends Thread implements Runnable
{

}
public class Main
{
    public static void main(String[] args)
    {
        A hi = new A();
        Thread t1 = new Thread(hi);
        //setName is used to change the name
        t1.setName("Aswin");
        System.out.println(t1.getName());
        B t2 = new B();
        t2.setName("Kumar");
        System.out.println(t2.getName());

    }
}