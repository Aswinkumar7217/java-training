import java.util.Scanner;
class AgeException extends Exception {



}
class Vote {

    int age;
    Vote() {}
    //empty constructor


    Vote(int age) {
        //parameter constructor
        if (age<0) {

           // throw new AgeException();

        } else {

            this.age = age;

        }

    }



    public void checkEligibility() {

        if (this.age>18) {

            System.out.println("Eligible");

        } else {

            System.out.println("Not Eligible");

        }

    }

}



public class B {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");

        Vote v = new Vote();



            v = new Vote(sc.nextInt());


        v.checkEligibility();

        sc.close();

    }
}

