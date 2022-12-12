import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating arraylist
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Enter the number of strings");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Enter a string");
            String str = sc.next();
                //adding str and *
                al.add(str);
                al.add("*");

        }
        System.out.println(al);

        System.out.println("Enter the string to search");
        String search = sc.next();
        System.out.println("The given string is at the index: " + getIndex(al, search));
        sc.close();
    }
    public static <str> int getIndex(ArrayList<String> s, String search)
    {
        //converting array list to object array
       Object[] str = s.toArray();

        for (int i = 0; i < str.length; i++) {
            if (str[i].toString().equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }
}