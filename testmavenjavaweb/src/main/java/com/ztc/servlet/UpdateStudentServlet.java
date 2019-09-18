package com.ztc.servlet;

import com.ztc.mapper.StudentMapper;
import com.ztc.until.SqlSessionUntil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateStudentServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSession sqlSession = SqlSessionUntil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        com.ztc.entity.Student student = new com.ztc.entity.Student();
        student.setSid(req.getParameter("sid"));
        student.setSname(req.getParameter("sname"));
        student.setSbirthday(req.getParameter("sbirth"));
        student.setSex(req.getParameter("sex"));
        int i = mapper.updateStudentById(student);
        resp.sendRedirect("index.jsp");
    }
}
