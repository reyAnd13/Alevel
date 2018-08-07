package com.alevel.hometask.oop;

public class Group {

    private Student[] students;

    public Group(Student[] students) {

        this.students = students;
    }

    public void printContractStudents() {

        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof ContractStudent) {
                System.out.println(students[i].getName() + ", " +
                        students[i].getOld() + ", " +
                        ((ContractStudent) students[i]).getPricecontract()
                );
            }
        }
    }

}