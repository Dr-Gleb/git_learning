public class Student {
    String Name;
    double grade;

    public Student(String name, double grade) {
        Name = name;
        this.grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
