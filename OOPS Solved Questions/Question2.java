//Question 2

//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Question2 {
    private String name;
    private String breed;

    public Question2(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        Question2 dog1 = new Question2("Max", "American Bully");
        Question2 dog2 = new Question2("Rocky", "Lab");
        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

    }
}
