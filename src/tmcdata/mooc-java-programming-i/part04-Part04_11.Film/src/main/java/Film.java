public class Film {
    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }

    @Override
    public String toString() {
        return "You must be at least " + this.ageRating + " to watch " + this.name;
    }
}
