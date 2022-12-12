package Attendee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import Database.DB;
import static Admin.admin.id;
import static Admin.admin.input;

public class attendee {
    public static String password;

    public static void attendeefunction(){
        try{

            Connection con=DB.get_connection();
            Statement smt=con.createStatement();
            System.out.println("Please Enter the Attendee UserID and Passcode");
            id=input.nextInt();
            input.nextLine();
            password=input.nextLine();
            String SQL="select count(*) as count from QuizUser Where UserId="+id+" and passcode='"+password+"'and IsAdmin=false";
            ResultSet rs= smt.executeQuery(SQL);
            rs.next();
            int count=rs.getInt(1);
            if(count==1)
             {
                 int[] questions=new int[100];
                 int i=0;
                 SQL="select QuestionId from QuizQuestion";
                 Statement statement=con.createStatement();
                 ResultSet resultset=statement.executeQuery(SQL);
                 while(resultset.next())
                    {
                        String qusid=resultset.getString("QuestionId");
                        questions[i++]=Integer.parseInt(qusid);
                    }
                    Random random=new Random();
                    int[] randomid=new int[3];
                    int rndcount=0;
                    for (int k=0;k<3;) {
                        int rdno=random.nextInt(10);
                        for(int j=0;j<questions.length;j++){
                            if(questions[j]==rdno) {
                                int check=0;
                                for (int n = 0; n < k;n++) {
                                    if(rdno==randomid[n])
                                        check=1;
                                }
                                if(check==0) {
                                    randomid[k++] = questions[j];
                                    break;
                                }
                            }
                        }
                    }
                    int mark=0;
                    for (int j=0;j<3;j++){
                        SQL="select Question,option1,option2,option3,Answer from QuizQuestion where QuestionId="+randomid[j];
                        statement=(Statement) con.createStatement();
                        resultset=statement.executeQuery(SQL);
                        String answer="";
                        while(resultset.next())
                        {
                            System.out.println("Question:"+resultset.getString("Question"));
                            System.out.println("option1:"+resultset.getString("option1"));
                            System.out.println("option2:"+resultset.getString("option2"));
                            System.out.println("option3:"+resultset.getString("option3"));
                            answer=resultset.getString("Answer");
                        }
                        System.out.println("please select A for Option1, B for Option2, C for Option3");
                        String ansopt=input.nextLine();

                        if(ansopt.equalsIgnoreCase(answer)){
                            mark=mark+5;
                        }
                        else{
                            mark=mark-2;
                        }
                    }
                    System.out.println("Score for the test:"+mark);
                }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
