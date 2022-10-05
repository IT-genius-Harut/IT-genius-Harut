package intro_java.courseRepetition.class_1_example;

public class Class1Conditionals {
    public static void main(String[] args) {
        switchExample(5);
        getDay("Monday");
        ifStatementExample(17, 6);
    }

    public static void switchExample(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("the number is between 1 and 4");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("the number is between 5 and 8");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("the number is between 9 and 12");
                break;
            default:
                System.out.println("number is not between 1 and 12");

        }
    }
    public static void getDay(String day){
        switch (day){
            case "Monday":
                System.out.println("today is Monday ");
                break;
            case "Tuesday":
                    System.out.println("today is Tuesday");
            case "Wednesday":
                System.out.println("today is Wednesday");
                break;
            case "Thursday":
                System.out.println("today is Thursday");
                break;
            case "Friday":
                System.out.println("today is Friday");
                break;
            case "Saturday":
                System.out.println("today is Saturday");
                break;
            case "Sunday":
                    System.out.println("today is Sunday");
                    break;
            default:
                System.out.println("Today is not a valid day");
        }
    }
    public static void ifStatementExample(int a, int b){
        if (a > b){
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println(" a is equal than b");
        }
    }
}
