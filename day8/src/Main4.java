import java.io.*;
import java.util.Scanner;
public class Main4 {
    public static void copy(File a, File b) throws Exception
    {
        FileInputStream input=new FileInputStream(a);//source file reading
        FileOutputStream output=new FileOutputStream(b);//destination file writing
        try
        {
            int i;
            while((i=input.read())!=-1)
            {
                output.write(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            if(input!=null)// for closing input the file
            {
                input.close();
            }
            if(output!=null)// for closing output the file
            {
                output.close();
            }
            System.out.println("Copied");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file name:");
        String in=sc.nextLine();
        File c=new File("/Users/aswinkumar/IdeaProjects/day8/src/aswin.txt");
        System.out.println("Enter Destination file name:");
        String out=sc.nextLine();
        copy(c, new File(out));
    }
}