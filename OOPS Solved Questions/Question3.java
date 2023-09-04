// Question3

// Write a Java program to create a class called "Rectangle" with width and
// height attributes. Calculate the area and perimeter of the rectangle.

class Question3 {

    private double width;
    private double height;

    public Question3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

}

// class Main {
// public static void main(String[] args) {
// Question3 r1 = new Question3(20.0, 20.0);
// Question3 r2 = new Question3(30.0, 30.0);
// System.out.println(r1.getArea());
// System.out.println(r2.getPerimeter());
// }
// }