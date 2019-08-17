package com.ztc.entity;

import org.apache.ibatis.type.Alias;

@Alias("sco")
public class Score {
    private  String sid;
    private  String cid;
    private  int score;
    private  Student student;

    public Score() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sid='" + sid + '\'' +
                ", cid='" + cid + '\'' +
                ", score=" + score +
                ", student=" + student +
                '}';
    }
}
