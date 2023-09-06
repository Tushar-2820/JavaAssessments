
// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.*;

class Question5 {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    public Question5(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String coursename) {
        courses.add(coursename);
    }

    public void removeCouse(String coursename) {
        courses.remove(coursename);
    }

    public void getDetails() {
        System.out.println("Student details");
        System.out.println("Name" + getName());
        System.out.println("Grade" + getGrade());
        System.out.println("Courses:" + getCourses());

    }

}

class Main {

    public static void main(String[] args) {
        Question5 s1 = new Question5("Tushar", "A");
        Question5 s2 = new Question5("Shambhu", "B");

        s1.addCourse("Java");
        s1.addCourse("C++");
        s1.addCourse("C");
        s1.addCourse("Flutter");

        s1.getDetails();

        s1.removeCouse("Java");
        s1.getDetails();

    }

}