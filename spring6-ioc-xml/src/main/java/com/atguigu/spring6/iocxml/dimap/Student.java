package com.atguigu.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 18:24
 */
public class Student {
    private List<Lesson> lessonList;
    private Map<String,Teacher> teacherMap;
    private Integer sid;
    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lessonList=" + lessonList +
                ", teacherMap=" + teacherMap +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }

    public void run(){
        System.out.println("学生编号："+sid+"学生名称"+sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }
}
