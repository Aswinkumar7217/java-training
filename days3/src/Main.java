class Test{
    void aswin()
    {
        System.out.println("Hi");
    }
    public int a=10;
    public void display()
    {
        System.out.println(a);
    }
    private int b=20;
    private void abc()
    {
        System.out.println(b);
    }
    protected int c=30;
    protected void show()
    {
        System.out.println(c);
    }
}
public class Main{
    public static void main(String[] args){
        Test t=new Test();
        t.display();
        t.aswin();
        t.show();
    }
}

