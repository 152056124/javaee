package test;

import dao.impl.DruidCourseDaoImpl;
import pojo.Course;

import java.util.List;

public class DruidCourseDaoImplTest {
    public static void main(String[] args) {
        DruidCourseDaoImpl druid = new DruidCourseDaoImpl();
//        Course course = new Course();
//        course.setCno("C009");
//        course.setCname("语文课");
//        course.setCredit(2);
//        course.setSemester(5);
//        int i = druid.insertCourse(course);
//        System.out.println(i);

//        int i = druid.deleteCourse("C009");
//        System.out.println(i);

        Course course = new Course();
        course.setCno("c010");
        course.setCname("语文课");
        course.setCredit(3);
        course.setSemester(6);
        int i = druid.updateCourseByCno(course);
        System.out.println(i);

//        List<Course> courses = druid.selectCourseByCno("c009");
//        for (Course course : courses) {
//            System.out.println(course);
//        }
    }
}
