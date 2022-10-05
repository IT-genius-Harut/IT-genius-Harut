package intro_java.class_9_practice;

public class Classroom {

    public static void main(String[] args) {
        Classroom c = new Classroom(5);

    }

    private Classroom[] student;
    private int currentStudentIndex = 0;

    public Classroom(int numberOfStudent) {
        student = new Classroom[numberOfStudent];
    }
    public void addStudent (String nameStudent) {
        if (currentStudentIndex >= student.length) {
            System.out.println("add student: " + student.toString());
            return;
        }
        Classroom classroom = student[currentStudentIndex];
        currentStudentIndex++;
    }

    public void removeStudent () {
        currentStudentIndex--;
        if (currentStudentIndex <= 0) {
            System.out.println("remove student" + student.toString());
            currentStudentIndex = 0;
            return;
        }
    }
    @Override
    public String toString() {
        String value = "";
        for (int i = 0; i < currentStudentIndex; i++) {
            value += student[i].toString() + "\n";
        }
        return value;
    }

}