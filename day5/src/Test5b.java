class Test5b1 {

    Test5b1() {

        System.out.println(10/0);

    }

}



class Test5b2 extends Test5b1{

    Test5b2() {
        super();

//        try {
//
//            Test5b1 a = new Test5b1();
//
//        } catch (Exception e) {
//
//            System.out.println("Divided by zero");

//        }

    }

}



public class Test5b {



    public static void main(String[] args) {

        try {

            Test5b2 a =  new Test5b2();
        } catch (Exception e) {
            System.out.println("Caught");
        }

    }



}