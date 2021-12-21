package chapter8;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class MysqlinsertTest {
    private  String driver ;
    private  String url  ;
    private  String user  ;
    private  String pass  ;
    public void initParam(String paramFile) throws  Exception{
        Properties prop = new Properties();
        prop.load(new FileInputStream(paramFile));
        driver=prop.getProperty("driver");
        url = prop.getProperty("url");
        user = prop.getProperty("user");
        pass  = prop.getProperty("pass");

    }
    public int insertData(String sql)throws Exception{
        Class.forName(driver);
        try(
                Connection conn = DriverManager.getConnection(url,user,pass);
                Statement stmt = conn.createStatement()) {
            return  stmt.executeUpdate(sql);
        }
    }

    public static void main(String[] args) throws Exception {
        MysqlinsertTest ed = new MysqlinsertTest();
        ed.initParam("D:\\Users\\86132\\IdeaProjects\\day-collection\\src\\mysql.ini");
int result = ed.insertData("insert into student.student "+
        "(StudnetNo,LoginPwd,StudentName,Sex) values(?,?,'17','1')");

        System.out.println("int"+result);
    }
}
