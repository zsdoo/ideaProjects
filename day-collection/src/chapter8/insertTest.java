package chapter8;

public class insertTest {
    public static void main(String[] args) throws Exception {
        MysqlinsertTest ed = new MysqlinsertTest();
        ed.initParam("D:\\Users\\86132\\IdeaProjects\\day-collection\\src\\mysql.ini");
        int result =  ed.insertData("insert into student.student "+
                "(StudnetNo,LoginPwd,StudentName,Sex) values('26','16','17','1')");
        System.out.println("返回的结果是："+result);
    }
}
