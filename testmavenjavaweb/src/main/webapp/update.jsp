<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.ztc.until.SqlSessionUntil" %>
<%@ page import="com.ztc.mapper.StudentMapper" %>
<%@ page import="com.ztc.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
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

    <%
        for (Student student : students) {
    %>
    <tr>
        <form action="update" method="post">
            <td><input type="text" name="sid" value="<%out.print(student.getSid());%>"></td>
            <td><input type="text" name="sname" value="<%out.print(student.getSname());%>"></td>
            <td><input type="text" name="sbirth" value="<%out.print(student.getSbirthday());%>"></td>
            <td><input type="text" name="sex" value="<%out.print(student.getSex());%>"></td>
            <td><input type="submit" value="修改"></td>
        </form>
    </tr>
    <%
        }%>
    </tbody>
</table>
<form action="index.jsp" method="post">
    <input type="submit" value="返回">
</form>
</body>
</html>
