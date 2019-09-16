package com.ztc.servlet;

import com.ztc.entry.Student;
import com.ztc.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SelectStudentServlet extends HttpServlet {
    private static SqlSession getSqlSession() {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(SelectStudentServlet.class.getClassLoader().getResourceAsStream("mybatis.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        return sqlSession;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        StudentMapper studentMapper = getSqlSession().getMapper(StudentMapper.class);
        List<Student> students = studentMapper.selectStudent();
        String html = "";
        html += "<!DOCTYPE html>";
        html += "<html lang=\"zh_CN\">";
        html += "<head>";
        html += "<meta charset=\"UTF-8\">";
        html += "<title>学生表</title>";
        html += "</head>";
        html += "<body>";
        html += "<form action=\"/javawebstudy/a\" method=\"post\">";
        html += "<table cellspacing=\"0px\" border=\"1px\" cellpadding=\"10px\">";
        html += "<thead>";
        html += "<tr>";
        html += "<td>ID</td>";
        html += "<td>姓名</td>";
        html += "<td>生日</td>";
        html += "<td>性别</td>";
        html += "</tr>";
        html += "</thead>";
        html += "<tbody>";
        for (Student student : students) {
            html += "<tr>";
            html += "<td>" + student.getSid() + "</td>";
            html += "<td>" + student.getSname() + "</td>";
            html += "<td>" + student.getSbirthday() + "</td>";
            html += "<td>" + student.getSex() + "</td>";
            html += "<td>";
            html += "<input type=\"submit\" value=\"修改\">";
            html += "<a href=\"/javawebstudy/delete\">删除</a>";
            html += "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        html += "</form>";
        html += "</body>";
        html += "</html>";
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.print(html);
        writer.close();
    }
}
