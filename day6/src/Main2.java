import java.util.*;
public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //storing the string in separate character
        char[] data = str.toCharArray();
        //Creating an object for Hashset
        //Hashset its don't have specific length
        Set s = new HashSet();
        for (int i = 0; i < data.length; i++) {
            s.add(data[i]);//adding each character to hash
        }
        //Storing in object array
        Object[] s1 = s.toArray();
        System.out.print("{");
        for (int i = 0; i < s.size(); i++) {//hydrate the string
            System.out.print(s.toArray()[i] + "=");
            //Creating an object of array list class and storing it in a collection type variable
            Collection t = new ArrayList();
            //typecasting s1 from object type to char type and storing it in the variable a
            char c = (Character) s1[i];
            for (int j = 0; j < data.length; j++) {
                //comparing index
                if (c == data[j]) {
                    t.add(j);
                }
            }
            System.out.print(t + ", ");
        }
        System.out.print("}");
    }
}
// {'h','e', ....}