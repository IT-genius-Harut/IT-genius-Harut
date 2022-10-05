package intro_java.homeworks.hw3;

public class Movie {
    private String name;
    private float rating;

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name,float rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        if (rating < 0 || rating > 10) {
            System.out.println("Rating must be between 0 and 10");
            return;
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name ='" + name + '\'' +
                ", rating =" + rating +
                '}';
    }
}
