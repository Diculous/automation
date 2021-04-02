package exceptions.classes;

import exceptions.customexceptions.StudentMarkException;

public class Subject {
    String name;
    int rating;

    public Subject(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) throws StudentMarkException {
        if (rating > 10 || rating < 0) {
            throw new StudentMarkException("Mark cannot be lower than 0 and higher than 10");
        }
        this.rating = rating;
    }
}