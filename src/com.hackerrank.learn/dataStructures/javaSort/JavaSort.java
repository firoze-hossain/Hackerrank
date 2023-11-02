package dataStructures.javaSort;

import java.util.*;

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> studentList = new ArrayList<>();

        while (n-- > 0) {
            int id = sc.nextInt();
            String fname = sc.next();
            double cgpa = sc.nextDouble();

            Student student = new Student(id, fname, cgpa);
            studentList.add(student);
        }
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCgpa() < o2.getCgpa()) {
                    return 1;
                } else if (o1.getCgpa() > o2.getCgpa()) {
                    return -1;
                } else {
                    return o1.getFname().compareTo(o2.getFname());
                }
            }
        });
        for (Student s : studentList) {
            System.out.println(s.getFname());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;


    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}