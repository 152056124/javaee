<%@ page import="com.ztc.until.SqlSessionUntil" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.ztc.mapper.StudentMapper" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ztc.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息表JSP</title>
</head>
<% SqlSession sqlSession = SqlSessionUntil.getSqlSession();
    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
    List<Student> students = studentMapper.selectStudent();%>
<body>
<table border="1px" cellspacing="0px" cellpadding="10px">
    <thead>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>生日</td>
        <td>性别</td>
        <td>功能</td>
    </tr>
    </thead>
    <tbody>
    <form action="insert" method="post">
        <tr>
            <td><input type="text" name="sid" value=""></td>
            <td><input type="text" name="sname" value=""></td>
            <td><input type="text" name="sbirth" value=""></td>
            <td><input type="text" name="sex" value=""></td>
            <td><input type="submit" value="增加"></td>
        </tr>
    </form>

    <%
        for (Student student : students) {
    %>
    <tr>
        <form action="delete" method="post">
            <td><input type="text" name="sid" value="<%out.print(student.getSid());%>"></td>
            <td><%out.print(student.getSname());%></td>
            <td><%out.print(student.getSbirthday());%></td>
            <td><%out.print(student.getSex());%></td>
            <td><input type="submit" value="删除"></td>
        </form>
    </tr>
    <%
        }%>
    </tbody>
</table>
<form action="update.jsp" method="post">
    <input type="submit" value="修改数据">
</form>
</body>
</html>
