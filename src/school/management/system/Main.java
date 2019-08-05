package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher melisa = new Teacher(2,"Melisa", 700);
        Teacher ryan = new Teacher(3, "Ryan", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(ryan);

        Student josh = new Student(1,"Josh",80);
        Student berfin = new Student(2, "Berfin", 100);
        Student berk = new Student(3, "Berk", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(josh);
        studentList.add(berfin);
        studentList.add(berk);

        School cbu = new School(teacherList, studentList);

        Teacher megan = new Teacher(4, "Megan", 800);
        cbu.addTeacher(megan);

        josh.payFees(5000);
        System.out.println("CBU has earned: $" + cbu.getTotalMoneyEarned());

        berk.payFees(6000);
        System.out.println("CBU has earned: $" + cbu.getTotalMoneyEarned());

        System.out.println("----Making SCHOOL PAY SALARY----");
        ryan.receiveSalary(ryan.getSalary());
        System.out.println("CBU has spent for salary to " + ryan.getName() +
                " and now has $" + cbu.getTotalMoneyEarned());

        melisa.receiveSalary((melisa.getSalary()));
        System.out.println("CBU has spent for salary to " + melisa.getName() +
                " and now has $" + cbu.getTotalMoneyEarned());

        System.out.println(lizzy);
        System.out.println(melisa);

        System.out.println(berfin);
        System.out.println(berk);
    }
}
