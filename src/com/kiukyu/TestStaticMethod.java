package com.kiukyu;

import com.kiukyu.Student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // gọi method change của Student

        // creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        // gọi method display
        s1.display();
        s2.display();
        s3.display();
    }
}
