
import java.io.FileOutputStream;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String a=sc.nextLine();
        try(FileOutputStream output=new FileOutputStream("/Users/aswinkumar/IdeaProjects/day8/src/aswin.txt",true))
        {
            byte[] strToBytes = a.getBytes();
            output.write(strToBytes);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}