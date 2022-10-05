package intro_java.courseRepetition.globall_updata;

public class OppTrayOne {

   private String brand;

   private int hp;

   private String colour;

   public OppTrayOne(String brand, String colour, int hp){
       this.brand = brand;
       this.colour = brand;
       this.hp = hp;
   }

   public void speedUp(int speed){
       System.out.println(speed * 2);
   }

   @Override
   public String toString(){
       return "The car brand is: " + brand +
               " colour is: " + colour +
               " and horse power is: " + hp;
   }

   //GETTERS AND SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
