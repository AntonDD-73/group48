package lesson13Home;

import java.util.Objects;

public abstract class Duck {

    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    public abstract void swim();
    public abstract void quack();
    public abstract void fly();
    public abstract void reproduce();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }
}


