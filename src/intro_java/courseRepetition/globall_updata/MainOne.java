package intro_java.courseRepetition.globall_updata;

public class MainOne {
    public static void main(String[] args) {
        OppTrayOne bmw = new OppTrayOne("BMW", "black", 505);
        OppTrayOne mercedes = new OppTrayOne("Mercedes", "red", 360);

        System.out.println(bmw);
        System.out.println(mercedes);

        System.out.println("Bmw hp = " + bmw.getHp());
        System.out.println("Mercedes colour = " + mercedes.getColour());

        bmw.speedUp(bmw.getHp());
    }
}
