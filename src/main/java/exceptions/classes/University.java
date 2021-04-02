package exceptions.classes;

import exceptions.customexceptions.EmptyException;

import java.util.List;

public class University {

    List<Faculty> faculties;

    public double averageRatingAcrossUniversityBySubject(String subjectName) throws EmptyException {
        if (faculties == null || faculties.size() == 0)
            throw new EmptyException("Faculties cannot be empty!");
        return faculties.stream().mapToDouble(f -> {
            try {
                return f.averageRatingAcrossGroupsBySubject(subjectName);
            } catch (EmptyException e) {
                e.printStackTrace();
            }
            return 0;
        }).sum() / faculties.size();
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
