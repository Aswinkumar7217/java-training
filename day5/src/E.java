import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            for (int i = 0;; i++) {
                //Continue hydration with incremental order

                System.out.println("Enter a numerator: ");



                System.out.println("Enter a divisor: ");



                try {
                    int num = sc.nextInt();
                    int div = sc.nextInt();
                    // for 2nd one
                    //its running as per askey value
                    //Q=81
                    //q=113

//                    if (num == 'Q' || num == 'q') {
//
//                        System.out.println("End");
//
//                        break;
//
//                    }
                    System.out.println(num/div);

                } catch (Exception e) {

                    System.out.println("Poor Input Data");

                }

            }


        }



    }

