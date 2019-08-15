package reflection;

import pojo.Course;

import java.util.List;


public class TestAllQuiry {
    public static void main(String[] args) {
        List<Course> list = DbAllQuiryUtils.allQuiry(Course.class);
        for (Course course : list) {
            System.out.println(course);
        }
    }
}
