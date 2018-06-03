package p02;

import p01.Food;

public abstract class Animal {
    public String animalName;
    public String animalType;
    public Double animalWeight;
    Integer foodEaten;

    public abstract void makeSound();
    public abstract void eat(Food food);
}
