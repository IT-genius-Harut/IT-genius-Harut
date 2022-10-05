package intro_java.class_14_practice.people.students;

/*

public class Student extends Person {
    public static final int MAX_CLASSES_PER_STUDENT = 3;

    private int grade;
    // current classes - Set
    private Set<AbstractSubject> currentSubjects;
    // previous classes - Set
    private Set<AbstractSubject> previousSubjects;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
        currentSubjects = new HashSet<>();
        previousSubjects = new HashSet<>();
    }

    public void addToCurrentClasses(AbstractSubject subject)
            throws DuplicateStudentAdditionException {
        // availability check
        if (currentSubjects.size() >= MAX_CLASSES_PER_STUDENT) {
            // todo: throw custom exception that tells the same thing
            System.out.println("Cannot take more than "
                    + MAX_CLASSES_PER_STUDENT + " classes at the same time");
            return;
        }
        // Prerequisites check
        Set<AbstractSubject> prereqs = subject.getPrerequisites();
        for (AbstractSubject prereq : prereqs) {
            if (!previousSubjects.contains(prereq)) {
                // todo: throw custom exception that tells the same thing
                System.out.println("Cannot register to " + subject.getName()
                        + " due to lack of prerequisites: " + subject.getPrerequisites());
                return;
            }
        }
        // grade check
        if (grade < subject.getMinGrade()) {
            // todo: throw custom exception that tells the same thing
            System.out.println("Cannot register to " + subject.getName()
                    + " due to lower grade");
            return;
        }
        currentSubjects.add(subject);
        subject.addStudent(this);
        System.out.println("Successfully added: " + subject.getName());
    }

    public void addToPreviousClasses(AbstractSubject subject) {
        if (grade < subject.getMinGrade()) {
            // todo: throw custom exception that tells the same thing
            System.out.println("Cannot register to " + subject.getName()
                    + " due to lower grade");
            return;
        }
        previousSubjects.add(subject);
        System.out.println("Successfully added to previously taken classes: " + subject.getName());
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
*/
