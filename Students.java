package HW17;

public class Students {
    public String name;

    String studentsName;
    int grade1;
    int grade2;
    int grade3;

    public Students(String studentsName, int grade1, int grade2, int grade3) {
        this.studentsName = studentsName;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void average() {
        double average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println(name + average);
    }

    public static void main(String[] args) {
        Students student1 = new Students("Alex", 80, 90, 75);
        student1.average();

        Students student2 = new Students("Nina", 85, 95, 90);
        student2.average();

        Students student3 = new Students("Angela", 70, 80, 65);
        student3.average();

        Students student4 = new Students("Julia", 95, 90, 92);
        student4.average();

        Students student5 = new Students("Michael", 88, 92, 87);
        student5.average();
    }

}