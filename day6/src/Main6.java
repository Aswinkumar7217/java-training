import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Main6 {



    public static void main(String[] args) {
        // create a linked list
        Scanner sc = new Scanner(System.in);
        LinkedList<String> l_list = new LinkedList<String>();
        System.out.println("Enter the number of values: ");
        int a = sc.nextInt();
        for (int i = 1; i<=a; i++) {
            System.out.println("Enter the value " + i);
            l_list.add(sc.next());
        }
        System.out.println("Original linked list:" + l_list);
        l_list.sort(null);
        System.out.println("the sorted list is :"+l_list);

        Iterator it = l_list.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        //Assigns index
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        sc.close();
    }
}