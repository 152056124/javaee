package com.ztc.servlet;

import com.ztc.entry.Student;
import com.ztc.mapper.StudentMapper;
import com.ztc.until.SqlSessionUntil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsertStudentServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        System.out.println(11);
        SqlSession sqlSession = SqlSessionUntil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setSid(req.getParameter("sid"));
        student.setSname(req.getParameter("sname"));
        student.setSbirthday(req.getParameter("sbirth"));
        student.setSex(req.getParameter("sex"));
        studentMapper.insertStudent(student);
        resp.sendRedirect("select");
    }
}
