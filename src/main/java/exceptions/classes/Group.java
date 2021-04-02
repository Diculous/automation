package exceptions.classes;

import exceptions.customexceptions.EmptyException;

import java.util.List;
import java.util.stream.Collectors;

public class Group {

    List<Student> students;

    public double averageRatingBySubject (String subjectName) throws EmptyException{

        if (students == null || students.size() == 0)
            throw new EmptyException("Group cannot be empty!");
        List<Subject> subjectStudents = students.stream().flatMap(s -> s.getSubjects().stream()).collect(Collectors.toList())
                                                .stream().filter(subject -> subject.getName().equals(subjectName)).collect(Collectors.toList());
        return subjectStudents.stream().mapToDouble(s -> s.getRating()).sum() / subjectStudents.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
