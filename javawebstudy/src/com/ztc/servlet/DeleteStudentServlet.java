package com.ztc.servlet;

import com.ztc.mapper.StudentMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.ztc.until.SqlSessionUntil.getSqlSession;

public class DeleteStudentServlet extends HttpServlet {


    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String sid = req.getParameter("sid");
        StudentMapper studentMapper = getSqlSession().getMapper(StudentMapper.class);
        int i = studentMapper.deleteStudentById(sid);
        res.sendRedirect("select");
    }
}
