package com.ztc.entry;

public class Student {
    private String sid;
    private String sname;
    private String sbirthday;
    private String sex;

    public Student() {
    }

    public Student(String sid, String sname, String sbirthday, String sex) {
        this.sid = sid;
        this.sname = sname;
        this.sbirthday = sbirthday;
        this.sex = sex;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sbirthday='" + sbirthday + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
