package chapter8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

public class MysqlMulTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://49.232.146.147/student?useSSL=true","root","root");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT g.GradeId,g.GradeName,"
                        +"s.StudentName FROM `grade` g, student s WHERE g.GradeId=s.GradeID"))
        {
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t" +
                rs.getString(2) );
            }
        }
    }
}
