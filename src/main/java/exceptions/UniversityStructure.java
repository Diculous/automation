package exceptions;

import exceptions.classes.*;
import exceptions.customexceptions.EmptyException;

import java.util.ArrayList;
import java.util.List;

public class UniversityStructure {
    public static void main(String[] args) {
        Subject subject = new Subject("Math", 9);
        List<Subject> subjects = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        List<Faculty> faculties = new ArrayList<>();
        Student student = new Student();
        Group group = new Group();
        Faculty faculty = new Faculty();
        University university = new University();
        subjects.add(subject);
        student.setSubjects(subjects);
        students.add(student);
        group.setStudents(students);
        groups.add(group);
        faculty.setGroups(groups);
        faculties.add(faculty);
        university.setFaculties(faculties);

        System.out.println(student.averageRating());
        try {
            System.out.println(group.averageRatingBySubject("Math"));
        } catch (EmptyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(faculty.averageRatingAcrossGroupsBySubject("Math"));
        } catch (EmptyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(university.averageRatingAcrossUniversityBySubject("Math"));
        } catch (EmptyException e) {
            e.printStackTrace();
        }
    }
    }