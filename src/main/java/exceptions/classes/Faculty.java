package exceptions.classes;

import exceptions.customexceptions.EmptyException;

import java.util.List;

public class Faculty {

    List<Group> groups;

    public double averageRatingAcrossGroupsBySubject(String subjectName) throws EmptyException {

        if (groups == null || groups.size() == 0)
            throw new EmptyException("Faculty cannot be empty!");
        return groups.stream().mapToDouble(g -> {
            try {
                return g.averageRatingBySubject(subjectName);
            } catch (EmptyException e) {
                e.printStackTrace();
            }
            return 0;
        }).sum() / groups.size();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
