class Minion
{
    protected int a=7;

}

class info extends Minion
{

    void display()
    {
         a = 550;
        System.out.println(a);
    }

}

public class dog
{
    public static void main(String[] args)
    {
        Minion obj = new Minion();
        System.out.println(obj.a);
        info a = new info();
        a.display();

    }
}
