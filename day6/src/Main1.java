import java.util.ArrayList;
public class Main1 {


    public static void main(String[] args) {

        ArrayList<String> theatres = new ArrayList<>();

        theatres.add("Hema Cinimas");

        theatres.add("KS");

        theatres.add("LMR");

        theatres.add("Sangam");

        theatres.add("Sathiyam");

        theatres.add("Express avenue");

        theatres.add("Rohini");


        ArrayList<String> closed = new ArrayList<>();
        //We are using removeAll so the below theaters are closed
        closed.add("KS");

        closed.add("LMR");

        closed.add("Sathiyam");

        System.out.println("Open theatres: " + theatres.removeAll(closed));


        System.out.println(theatres);

    }
}


