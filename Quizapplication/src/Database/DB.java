package Database;

import java.sql.Connection;
import java.sql.DriverManager;
public class DB {
    public static Connection get_connection(){
        //connection requirements for my SQL
        final String SQL_URL="jdbc:mysql://localhost:3306/Quiz";
        final String Username="root";
        final String pwd="12345678";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(SQL_URL,Username,pwd);
            return conn;
            //smt.executeUpdate("insert into QuizUser (Username,passcode,IsAdmin) value('Aswin','Admin123',true)");

            //conforming this is the attendee
        }
        catch (Exception e){
            System.out.println(e);
        }

        return null;
    }
}
