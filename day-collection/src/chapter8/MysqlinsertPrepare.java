package chapter8;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class MysqlinsertPrepare {
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
        Class.forName(driver);
    }
    public void insertData()throws Exception{
        long start = System.currentTimeMillis();
        try(
                Connection conn = DriverManager.getConnection(url,user,pass);
                PreparedStatement pstmt = conn.prepareStatement("insert into student.student "+
                        "(StudnetNo,LoginPwd,StudentName,Sex) values(?,?,'17','1')")) {
            for (int i = 60; i <100 ; i++) {
                pstmt.setInt(1,i);
                pstmt.setString(2,i+"57");
                pstmt.executeUpdate();
            }


            System.out.println("start费时："+ start);
            System.out.println("end费时："+ (System.currentTimeMillis()-start));
        }
    }

    public static void main(String[] args) throws Exception {
        MysqlinsertPrepare ed = new MysqlinsertPrepare();
        ed.initParam("D:\\Users\\86132\\IdeaProjects\\day-collection\\src\\mysql.ini");
        ed.insertData();

    }
}
