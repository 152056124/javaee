package reflection;

import until.GetConnectionUntil;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAllQuiryUtils {
//    public static <T> List<T> allQuiry(Class c){
//        //反射获取注解
//        Table table= (Table) c.getDeclaredAnnotation(Table.class);
//        String tableName = "";
//        //如果没有注解，通过反射获取类名当表名
//        //反之，则获取注解值当表名
//        if(table == null){
//            tableName = c.getSimpleName();
//        }else {
//            tableName = table.tableName();
//        }
//
//        //正常的jdbc顺序
//        Connection con  = null;
//        PreparedStatement pre = null;
//        ResultSet rs = null;
//        List<T> tList = new ArrayList<>();
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_t?userUnicode=true&characterEncoding=utf-8&useSSL=false",
//                    "root","12358");
//            pre = con.prepareStatement("select * from " + tableName);
//            rs = pre.executeQuery();
//            while (rs.next()){
//                Field[] fields = c.getDeclaredFields();
//                T t= (T)c.newInstance();
//                for (Field field : fields) {
//                    field.setAccessible(true);
//                    Column column = (Column) c.getDeclaredAnnotation(Column.class);
//                    String columnName = "";
//                    if(column == null){
//                        columnName = field.getName();
//                    }else {
//                        columnName = column.columnName();
//                    }
//                    field.set(t,rs.getObject(columnName));
//                }
//                tList.add(t);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            GetConnectionUntil.closeCno(con,pre);
//        }
//
//        return tList;
//    }
    public static <T> List<T> allQuiry(Class c){
        Table table = (Table) c.getDeclaredAnnotation(Table.class);
        String tablename = "";
        if(table == null){
            tablename = c.getSimpleName();
        }else {
            tablename = table.tableName();
        }

        Connection con = GetConnectionUntil.getCon();
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<T> tList = new ArrayList<>();
        try {
            pre = con.prepareStatement("select * from " + tablename);
            rs = pre.executeQuery();

            while (rs.next()){
                T t = (T)c.newInstance();
                Field[] fields = c.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    Column column = (Column) c.getDeclaredAnnotation(Column.class);
                    String columnName = "";
                    if(column == null){
                        columnName = field.getName();
                    }else {
                        columnName = column.columnName();
                    }
                    field.set(t,rs.getObject(columnName));
                }
                tList.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            GetConnectionUntil.closeCno(con,pre);
        }

        return tList;
    }
}
