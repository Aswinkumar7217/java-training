package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import Database.DB;
import Attendee.attendee;

public class admin {
    public static String name;
    public static String password;
    public static int id;
    public static String SQL;
    public static Scanner input=new Scanner(System.in);

    public static void adminfunctions(){

        try{

            Connection con=DB.get_connection();
           // System.out.println("Please press 1 for admin and 2 Attendee");
            System.out.println("Welcome to Quiz Application");
            System.out.println("Please press 1 for admin and 2 Attendee");
            int option=input.nextInt();
            Statement smt=con.createStatement();
            //conforming this is the admin
            if(option==1) {
                System.out.println("Please Enter Admin UserId and passcode");
                id = input.nextInt();
                input.nextLine();
                password = input.nextLine();
                SQL = "select count(*) as count from QuizUser Where UserId=" + id + " and passcode='" + password + "'and IsAdmin=true";
                ResultSet rs = smt.executeQuery(SQL);
                rs.next();
                int count = rs.getInt(1);
                //System.out.println(count);
                if (count == 1) {
                    int loop = 0;
                    do {
                        System.out.println("Please Select 1 for creating Attendee, 2 for creating question and 3 for delete the question ");
                        int adminoption = input.nextInt();
                        //For creating the attendee
                        if (adminoption == 1) {
                            System.out.println("To create Please Enter username and passcode");
                            input.nextLine();
                            name = input.nextLine();
                            System.out.println("Username:" + name);
                            password = input.nextLine();
                            System.out.println("passcode:" + password);
                            SQL = "insert into QuizUser (Username,passcode,IsAdmin) value('" + name + "','" + password + "',false)";
                            smt.execute(SQL);
                            SQL = "select UserId from QuizUser where Username='" + name + "' and passcode='" + password + "'";
                            rs = smt.executeQuery(SQL);
                            rs.next();
                            id = rs.getInt(1);
                            System.out.println("Attendee UserId:" + id + "/n Attendee Passcode:" + password);
                        }
                        //For creating Questions
                        else if (adminoption == 2) {
                            System.out.println("Enter the Question Id");
                            int QuestionId = input.nextInt();

                            System.out.println("To create Enter Question");
                            input.nextLine();
                            String Question = input.nextLine();
                            System.out.println("To create Enter Option1");
                            String Option1 = input.nextLine();
                            System.out.println("To create Enter Option2");
                            String Option2 = input.nextLine();
                            System.out.println("To create Enter Option3");
                            String Option3 = input.nextLine();
                            System.out.println("To create Enter correct answer");
                            String Answer = input.nextLine();
                            SQL = "insert into QuizQuestion (QuestionId,Question,Option1,Option2,Option3,Answer) value('" + QuestionId + "','" + Question + "','" + Option1 + "','" + Option2 + "','" + Option3 + "','" + Answer + "')";
                            System.out.println(SQL);
                            smt.execute(SQL);
                        }
                        //for deleting the questions
                        else if (adminoption == 3) {
                            System.out.println("Please Enter Question number to delete");
                            int questionid = input.nextInt();
                            SQL = "delete from QuizQuestion where QuestionId=" + questionid;
                            smt.execute(SQL);
                            System.out.println("Question deleted from table");
                        }
                        System.out.println("Do you need to continue please select 1 or to exit press 2");
                        loop = input.nextInt();
                    } while (loop == 1);
                    if (loop==2) {
                        adminfunctions();
                    }
                }

            }else if (option==2){
                 attendee.attendeefunction();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
