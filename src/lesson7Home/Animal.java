package lesson7Home;

import java.util.Objects;

public class Animal {
    private final String name;
    private double height;
    private double weight;
    private final String color;
    private final int numberOfLegs;
    private String favoriteFood;

    public Animal(String name, double height, double weight, String color, int numberOfLegs, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.favoriteFood = favoriteFood;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void speak() {
        System.out.println("Меня зовут: " + name +
                        "\nМой рост: " + height +
                        "\nМой вес: " + weight +
                        "\nМой цвет: " + color +
                        "\nУ меня " + numberOfLegs + " лап(ы)" +
                        "\n Моя любимая еда: " + favoriteFood);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && Double.compare(weight, animal.weight) == 0 && numberOfLegs == animal.numberOfLegs && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, color, numberOfLegs, favoriteFood);
    }
}
