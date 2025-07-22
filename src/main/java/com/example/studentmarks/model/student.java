package com.example.studentmarks.model;


public class student {
    private int id;
    private String name;
    private int marks;

    public student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
