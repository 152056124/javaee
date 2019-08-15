package until;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        Connection con = GetConnectionUntil.getCon();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement("select * from course where Cno = ?");
            preparedStatement.setString(1,"C001");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet.next());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
