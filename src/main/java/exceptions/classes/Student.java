package exceptions.classes;

import exceptions.customexceptions.StudentNullSubjectsException;

import java.util.List;

public class Student {

    List<Subject> subjects;

    public double averageRating() {
        if (subjects == null || subjects.size() == 0)
            throw new StudentNullSubjectsException("Must be at least one subject in list");
       return subjects.stream().mapToDouble(r -> (double) r.rating/subjects.size()).sum();
    }

    public List<Subject> getSubjects() {
        if (subjects == null || subjects.size() == 0)
            throw new StudentNullSubjectsException("Must be at least one subject in list");
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}