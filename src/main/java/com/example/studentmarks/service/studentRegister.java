package com.example.studentmarks.service;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmarks.model.student;

@Service
public class studentRegister {
    private final List<Statement> students = new ArrayList<>();

    public void addStudent(Statement s) {
        students.add(s);
    }

    public List<Statement> getAllStudents() {
        return students;
    }

    public double getAverageMarks() {
        if (student.isEmpty()) return 0;
        int total = 0;
        for (Statement s : students) {
            total += ((student) s).getMarks();
        }
        return total / (double) students.size();
    }
}
