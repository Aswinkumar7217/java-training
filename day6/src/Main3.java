import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //split is used to split the strings
        String[] stArray=s.split("[ ,.]") ;
        ArrayList<String> stArrayList = new ArrayList<String>(Arrays.asList(stArray));
        System.out.println(stArrayList);
        Collections.reverse(stArrayList);
        System.out.println(stArrayList);
        Collections.reverse(stArrayList);
        for(int i=0;i<stArrayList.size();i++){
            if (stArrayList.get(i).endsWith("s")) {
                stArrayList.set(i,stArrayList.get(i).toUpperCase()) ;
            }
        }
        System.out.println(stArrayList);
        for(int i=0;i<stArrayList.size();i++){
            if(stArrayList.get(i).length()%2!=0){
                stArrayList.remove(stArrayList.get(i));
            }
        }
        System.out.println(stArrayList);
    }
}