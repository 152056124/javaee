//package com.ztc.servlet;
//
//import com.ztc.entity.Student;
//import com.ztc.mapper.StudentMapper;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import static com.ztc.until.SqlSessionUntil.getSqlSession;
//
//public class SelectStudentServlet extends HttpServlet {
//    @Override
//    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        StudentMapper studentMapper = getSqlSession().getMapper(StudentMapper.class);
//        List<Student> students = studentMapper.selectStudent();
//        String html = "";
//        html += "<!DOCTYPE html>";
//        html += "<html lang=\"zh_CN\">";
//        html += "<head>";
//        html += "<meta charset=\"UTF-8\">";
//        html += "<title>学生表</title>";
//        html += "</head>";
//        html += "<body>";
//        html += "<table cellspacing=\"0px\" border=\"1px\" cellpadding=\"10px\">";
//        html += "<thead>";
//        html += "<tr>";
//        html += "<td>ID</td>";
//        html += "<td>姓名</td>";
//        html += "<td>生日</td>";
//        html += "<td>性别</td>";
//        html += "<td></td>";
//        html += "</tr>";
//        html += "</thead>";
//        html += "<tbody>";
//        html += "<form action=\"insert\" method=\"post\">";
//        html += "<tr>";
//        html += "<td><input type=\"text\" name=\"sid\" value=\"\"></td>";
//        html += "<td><input type=\"text\" name=\"sname\" value=\"\"></td>";
//        html += "<td><input type=\"text\" name=\"sbirth\" value=\"\"></td>";
//        html += "<td><input type=\"text\" name=\"sex\" value=\"\"></td>";
//        html += "<td><input type=\"submit\"  value=\"增加\"></td>";
//        html += "</tr>";
//        html += "</form>";
//        for (Student student : students) {
//            html += "<tr>";
//            html += "<form action=\"delete\" method=\"get\">";
//            html += "<td><input type=\"text\" name=\"sid\" value="+student.getSid()+"></td>";
//            html += "<td>" + student.getSname() + "</td>";
//            html += "<td>" + student.getSbirthday() + "</td>";
//            html += "<td>" + student.getSex() + "</td>";
//            html += "<td>";
//            html += "<input type=\"submit\" value=\"删除\">";
//            html += "</td>";
//            html += "</form>";
//            html += "</tr>";
//        }
//        html += "</tbody>";
//        html += "</table>";
//        html += "<form action=\"stou\" method=\"post\">";
//        html += "<input type=\"submit\" value=\"修改数据\">";
//        html += "</form>";
//        html += "</body>";
//        html += "</html>";
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = resp.getWriter();
//        writer.print(html);
//        writer.close();
//    }
//}
