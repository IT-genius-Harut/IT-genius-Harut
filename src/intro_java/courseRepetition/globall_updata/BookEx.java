package intro_java.courseRepetition.globall_updata;

public class BookEx {
    public String after;

    public int price;

    public int page;

    public String type;

    public BookEx(String after, int price, int page,String type){
        this.after = after;
        this.page = page;
         this.price = price;
         this.type = type;
    }

    // This constructor is empty
    public BookEx(){

    }

    @Override
    public String toString(){
        return "The book after is: " + after + " type is: "
                + type + " price is: " + price + " and page are: " + page;
    }

    @Override
    public boolean equals(Object object){
        BookEx bookEx = (BookEx) object;
        return (this.after.equals(bookEx.after)
                && this.type.equals(((BookEx) object).type));
    }

    //GETTERS ANS SETTERS

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 5000) {
            System.out.println("This book is so expensive");
            return;
        }
        if (price < 0) {
            System.out.println("This book is so cheep");
            return;
        }
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page > 1000){
            System.out.println("This book is so heavy");
            return;
        }
        if (page < 20){
            System.out.println("This book is so so");
            return;
        }
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
