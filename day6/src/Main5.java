import java.util.*;

public class Main5 {
    public static void main(String[] args)
    {

        // Creating an empty HashMap
        HashMap<String, String> map = new HashMap<String, String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int values = sc.nextInt();
        // Mapping string values to int keys

        for (int i = 1; i<=values; i++) {
            System.out.println("Enter the key " + i);
            String key = sc.next();
            System.out.println("Enter the value " + i);
            String value = sc.next();
            map.put(key,value);
        }
        System.out.println(map);
        System.out.println("Enter the value to be found");
        String s = sc.next();
        try {
            Integer i = Integer.parseInt(s);
            System.out.println("Wrong Input");
        }
        catch(Exception e) {
            if(map.containsValue(s)){
                System.out.println("yes");
            }
              else if (map.containsKey(s)){
                 System.out.println("yeah");
              }
            else{
                System.out.println("no");
            }
        }
    }
}