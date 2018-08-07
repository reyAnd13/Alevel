package com.alevel.hometask.oop;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", 20);
        students[1] = new ContractStudent(100, "Mark", 19);
        students[2] = new Student("Mary", 22);
        students[3] = new ContractStudent(110, "Abby", 20);
        students[4] = new Student("Mike", 21);

        Group g = new Group(students);
        g.printContractStudents();
    }

}
