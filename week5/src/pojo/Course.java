package pojo;

import reflection.Column;
import reflection.Table;

@Table(tableName = "course")
public class Course {
    @Column(columnName = "Cno")
    private String cno;
    private String cname;
    private int credit;
    @Column(columnName = "Semester")
    private int semester;

    public Course() {
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", credit=" + credit +
                ", semester=" + semester +
                '}';
    }
}
