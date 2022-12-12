import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap; // Map the string and store as integer and used as unique
import java.util.Map;
import java.util.Scanner;
public class Main2
{
    public static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
    {
        //To read the contents of the file
        Scanner file=new Scanner (new File(filename));
        //To check if word exists
        while(file.hasNext()) //boolean return type
        {
            //To store the existing word
            String word=file.next();
            //Storing the value of keys
            Integer count=words.get(word);
            if(count!=null)
                count++;
            else
                count=1;
            words.put(word,count);
        }
        file.close();
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        //Hash map
        Map<String,Integer> words=new HashMap<String, Integer>();
        CountWords("/Users/aswinkumar/IdeaProjects/day8/src/aswin.txt",words);
        System.out.println(words);
    }
}