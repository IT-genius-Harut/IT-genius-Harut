package intro_java.homeworks.hw3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10, "green");

        rectangle1.setWidth(5);
        rectangle1.setHeight(10);
        rectangle1.setColour("green");

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("rectangle 1 equals rectangele 2");
        System.out.println(rectangle1.equals(rectangle2));



        Person p1 = new Person("aa", "bb", 24, 180);
        Person p2 = new Person();
        Person p3 = new Person("cc", "dd", 25, 168);
        p2.setAge(18);
        p2.setHeight(190);
        p2.setName("tt");
        p2.setSurname("pp");

        Classroom classroom = new Classroom(3);

        classroom.addStudent(p1);
        classroom.addStudent(p2);
        classroom.addStudent(p3);

        System.out.println(classroom);
        Person pTT = classroom.findStudentByName("abc");
        System.out.println(pTT);

        System.out.println("kmToMile(100) = " + Converter.kmToMile(100));
        System.out.println("mileToKm(60) = " + Converter.mileToKm(60));


        Movie movie1 = new Movie("AAA");
        Movie movie2 = new Movie("BBB");
        Movie movie3 = new Movie("CCC");
        Movie movie4 = new Movie("DDD", 7);

        movie1.setRating(10);
        movie2.setRating(8);
        movie3.setRating(9);

        Cinema cinema = new Cinema(5);
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);
        cinema.addMovie(movie3);
        cinema.addMovie(movie4);

        Movie theBestMovie = cinema.getTheBestMovie();
        System.out.println("The best movie is: " + theBestMovie);

    }
}
