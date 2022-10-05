package intro_java.homeworks.hw3;

public class Classroom {
    private Person[] students;
    private int currentStudentIndex = 0;

    public Classroom(int maxCapacity) {
        students = new Person[maxCapacity];
    }

    public void addStudent(Person student) {
        if (currentStudentIndex >= students.length) {
            System.out.println("no more students can be added to this classroom");
            return;
        }
        students[currentStudentIndex] = student;
        currentStudentIndex++;
    }

    public void removeStudent() {
        currentStudentIndex--;
        if (currentStudentIndex < 0) {
            System.out.println("cannot remove more students");
            currentStudentIndex = 0;
        }
    }

    public Person[] getAllStudents() {
//        return students;
        Person[] copyArray = new Person[currentStudentIndex + 1];
        int count = 0;
        for (int i = 0; i < currentStudentIndex; i++) {
            Person currentStudent = students[i];
            if (currentStudent == null) continue;
            copyArray[count] = new Person(currentStudent.getName(), currentStudent.getSurname(),
                    currentStudent.getAge(), currentStudent.getHeight());
            count++;
        }
        return copyArray;
    }

    public Person findStudentByName(String name) {
        for (int i = 0; i < currentStudentIndex; i++) {
            Person currentStudent = students[i];
            if (currentStudent == null) continue;
            if (currentStudent.getName().equals(name)) {
                return currentStudent;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String retValue = "";
        for (int i = 0; i < currentStudentIndex; i++) {
            retValue += students[i].toString() + "\n";
        }
        return retValue;
    }
}
