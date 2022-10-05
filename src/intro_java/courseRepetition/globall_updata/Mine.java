package intro_java.courseRepetition.globall_updata;

public class Mine {
    public static void main(String[] args) {

        // Car example

        CarEx bmw = new CarEx("BMW", "black", 99999, 1111);
        CarEx mercedes = new CarEx("Mercedes", "red", 45000, 365);
        CarEx volvo = new CarEx();
        volvo.setBrand("Volvo");
        volvo.setColour("green");
        volvo.setPrice(32000);
        volvo.setHp(284);
        CarEx porch = new CarEx("Porch", 25000);

        System.out.println(bmw);
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(porch);

        // Book example
        System.out.println("Book example");

        BookEx raffi = new BookEx("Raffi", 4000, 506, "melodrama");
        BookEx sasunciDavid = new BookEx("mardik", 4999, 1000, "epic");
        BookEx destination = new BookEx();
        destination.setAfter("Malcolm Mann");
        destination.setPage(230);
        destination.setPrice(4500);
        destination.setType("Grammar & Vocabulary");

        System.out.println(raffi);
        System.out.println(sasunciDavid);
        System.out.println(destination);
    }
}
