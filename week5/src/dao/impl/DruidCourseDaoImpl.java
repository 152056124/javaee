package dao.impl;

import dao.DruidCourseDao;
import pojo.Course;
import until.GetConnectionUntil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DruidCourseDaoImpl implements DruidCourseDao {
    @Override
    public int insertCourse(Course course) {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            con = GetConnectionUntil.getCon();
            preparedStatement = con.prepareStatement("insert into course values (?,?,?,?)");
            preparedStatement.setString(1,course.getCno());
            preparedStatement.setString(2,course.getCname());
            preparedStatement.setInt(3,course.getCredit());
            preparedStatement.setInt(4,course.getSemester());
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GetConnectionUntil.closeCno(con,preparedStatement);

        }
        return count;
    }

    @Override
    public int deleteCourse(String c) {
        Connection con = GetConnectionUntil.getCon();
        PreparedStatement pre = null;
        int count  = 0;
        try {
            pre = con.prepareStatement("delete from course where cno = ?");
            pre.setString(1,c);
            count = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GetConnectionUntil.closeCno(con,pre);
        }
        return count;
    }

    @Override
    public int updateCourseByCno(Course course) {
        Connection con = GetConnectionUntil.getCon();
        PreparedStatement pre = null;
        int count = 0;
        try {
            pre = con.prepareStatement("update course set  Cname = ?,Credit = ?,Semester = ? where Cno = ?");

            pre.setString(1,course.getCname());
            pre.setInt(2,course.getCredit());
            pre.setInt(3,course.getSemester());
            pre.setString(4,course.getCno());
            count = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GetConnectionUntil.closeCno(con,pre);
        }
        return count;
    }

    @Override
    public List<Course> selectCourseByCno(String c) {
        Connection con = GetConnectionUntil.getCon();
        PreparedStatement pre = null;
        Course course = new Course();
        List<Course> courses = new ArrayList<>();
        try {
            pre = con.prepareStatement("select * from course where cno = ?");
            pre.setString(1,c);
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next()){
                course.setCno(resultSet.getString("Cno"));
                course.setCname(resultSet.getString("Cname"));
                course.setCredit(resultSet.getInt("Credit"));
                course.setSemester(resultSet.getInt("Semester"));
            }
            courses.add(course);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            GetConnectionUntil.closeCno(con,pre);
        }
        return courses;
    }

}
