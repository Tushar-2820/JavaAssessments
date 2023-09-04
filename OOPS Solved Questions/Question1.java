//Question 1

//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Question1 {
    String name;
    int age;

    public Question1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("Name " + name + ",Age " + age);
    }

}

class Main {

    public static void main(String[] args) {

        Question1 p1 = new Question1("tushar", 23);
        Question1 p2 = new Question1("rohit", 32);
        p1.getDetails();
        p2.getDetails();
    }

}
