package cn.itcast.day11.demo07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnMySql {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://49.232.146.147:3306/balance?useSSL=true"
                        ,"root","root");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from t1;"))
        {
            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t"
                        + rs.getString(2)+"\t"
                        + rs.getInt(3)

                        );

            }
        }
    }
}
