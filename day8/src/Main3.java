import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main3
{
    public static void main(String[] args) throws IOException
    {
        //read input stream
        //write output stream
        FileOutputStream a=new FileOutputStream("/Users/aswinkumar/IdeaProjects/day8/src/aswin.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Multiples:");
        int m=sc.nextInt();
        //initializing value to the result.
        int result=0;
        //iterating till 10 value.
        for(int i=1;i<=10;i++)
        {
            result=m*i;
            //format to be print.
            String table=m + " * " + i + " = " + result +"\n"; // /n is used to escape sequence
            System.out.println(table);
            //to convert data in file into byte format.
            a.write(table.getBytes());
        }
    }
}