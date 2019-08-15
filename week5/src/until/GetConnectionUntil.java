package until;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GetConnectionUntil {
    public static final DruidDataSource druidDateSource = new DruidDataSource();
    static {
        druidDateSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDateSource.setUrl("jdbc:mysql://localhost:3306/s_t?userUnicode=true&characterEncoding=utf-8&useSSL=false");
        druidDateSource.setUsername("root");
        druidDateSource.setPassword("12358");
    }
    public static Connection getCon(){
        Connection connection = null;
        try {
            connection = druidDateSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeCno(Connection con, PreparedStatement pre){
        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pre != null) {
                pre.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
