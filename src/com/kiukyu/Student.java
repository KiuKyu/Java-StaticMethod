package com.kiukyu;

public class Student {

    // Khai báo props
    private int rollNo;
    private String name;
    private static String college = "VPr";

    // Constructor triển khai biến

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }
    // Tạo static method để thay đổi value của biến static
    public static void change() {
        college = "CodeGym";
    }
    // Tạo method để in ra value
    public void display() {
        System.out.println(this.rollNo + " " + this.name + " " + college);
    }
}
