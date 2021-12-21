package chapter8;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MysqlTest {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://49.232.146.147/";
    private static final String db = "hpeback";
    private static final String user = "root";
    private static final String pass = "root";
    static Connection conn = null;
    static Statement statement = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    public static void startMySQLConn() {
        try {
//            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + db, user, pass);
            if (!conn.isClosed()) {
                System.out.println("--mysql数据库开始连接……");
            }
            statement = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeMySQLConn() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("--关闭mysql数据库");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void useDB() {
        String sql = "use information_schema;";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getTable() {
        long sum = 0;
        String[] nList = new String[100];
        int i = 0;
        String sql = "select table_name,table_rows from tables where TABLE_SCHEMA = '" +
                db + "' order by table_rows desc;";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                nList[i] = rs.getString(1);
//                System.out.println(nList[i]);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(nList[]);
        return nList;
//        return false;
    }

    public static void getTable2(String[] list) {
//        String[] nList2 = new String[100];
//        int k=0;
//        for (String tmp :list) {
//            if (tmp == "sys_auth_company")
//                continue;
//            else
//                nList2[k++]=tmp;
        List<String> nList2 = Arrays.asList(list);
        List arrList = new ArrayList(nList2);
//            nList2.remove("sys_auth_company") ;
//        list.removeIf(value -> value==toRemoveValue);
//        nList.removeIf("sys_auth_company" -> "sys_auth_company" == toRemoveVale);
        arrList.remove("sys_auth_company");
        arrList.removeIf(s -> s == null);
//        System.out.println(arrList);
        long sum = 0;
        String[] nList3 = new String[100];
        int i = 0;

        try {
            for (int j = 0; j < arrList.size(); j++) {
                String sql2 = "select distinct '" + arrList.get(j) + "' from " + db
                        + "." + arrList.get(j) + " where tenant_id is null;";

                ps = conn.prepareStatement(sql2);
                rs = ps.executeQuery();
                while (rs.next()) {
                    nList3[j] = rs.getString(1);
                    System.out.println(nList3[j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        closeMySQLConn();
        startMySQLConn();
        useDB();
//        System.out.println(getDbSum());
        getTable2(getTable());
//        System.out.println(getTable());
//        getTable();
//        System.out.println(Arrays.toString(getTable()));
        closeMySQLConn();
    }
}



//    public static long getDbSum() {
//        long sum = 0;
//        String sql = "select table_name,table_rows from tables where TABLE_SCHEMA = '" +
//                db + "' order by table_rows desc;";
////System.out.println(sql);
//        try {
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                sum += rs.getInt(2);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return sum;
//    }