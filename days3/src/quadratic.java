public class quadratic
{
    int a, b, c;
    quadratic()
    // empty constructor
    {
        a=1;
        b=1;
        c=1;
    }
    quadratic(int a, int b, int c)
    //parameters constructor
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getValues()
    //extractor
    {
        System.out.println("a = " + a + ", b = " + b +", c = " + c );
    }

    public void quadFunction(int x) {
        System.out.println(a*(x*x) + b*(x)+ c);
    }

    public static void main (String [] args)
    {
        quadratic obj1 = new quadratic();
        quadratic object= new quadratic(1,2,3);
        obj1.getValues();
        object.getValues();
        object.quadFunction(88);
    }

}