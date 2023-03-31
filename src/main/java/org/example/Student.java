package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private int[] marks;
    private String result;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        //int mark = 0;
        for (int i = 0; i < marks.length; i++) {
            //  mark = marks[i];
            if (marks[i] < 50) {
                result = "fail";
                break;
            } else {
                result = "pass";
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", result='" + result + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static void main(String[] args) {
        Student student1 = new Student("kulsuma", new int[]{50, 50, 60, 46, 70});
        Student student2 = new Student("Rokeya", new int[]{50, 50, 60, 50, 70});
        Student student3 = new Student("Mollika", new int[]{50, 50, 30, 50, 70});
        Student student4 = new Student("Bipasha", new int[]{50, 80, 60, 50, 70});
        Student student5 = new Student("Arnab", new int[]{40, 80, 60, 50, 70});
        Student student6 = new Student("Sahil", new int[]{60, 80, 60, 50, 70});
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        for (Student student : studentList) {
            if (student.result.equals("pass")) {
                System.out.println(student);
            }
        }

        System.out.println("Students after passed with grace");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).result.equals("pass")) {
                continue;
            }
            List<Integer> count = new ArrayList<>();
            for (int j = 0; j < studentList.get(i).marks.length; j++) {
                if (studentList.get(i).marks[j] < 50) {
                    count.add(j);
                }
            }
            if (count.size() == 1) {
                if (studentList.get(i).marks[count.get(0)] >= 45) {
                    studentList.get(i).marks[count.get(0)] = studentList.get(i).marks[count.get(0)] + (50 - studentList.get(i).marks[count.get(0)]);
                    studentList.get(i).result = "pass";
                }
            }
            if (studentList.get(i).result.equals("pass")) {
                System.out.println(studentList.get(i));
            }
        }


    }


}