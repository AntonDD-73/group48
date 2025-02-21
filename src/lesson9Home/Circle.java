package lesson9Home;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Площадь круга
    }

    @Override
    public String toString() {
        return "Площадь круга: " + calculateArea();
    }
}