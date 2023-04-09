//Abstract class for pets
abstract class Pet {
private String name;
private int age;
private String breed;

public Pet(String name, int age, String breed) {
 this.name = name;
 this.age = age;
 this.breed = breed;
}

// Abstract method to get the color of the pet
public abstract String color();

public String getName() {
 return name;
}

public void setName(String name) {
 this.name = name;
}

public int getAge() {
 return age;
}

public void setAge(int age) {
 this.age = age;
}

public String getBreed() {
 return breed;
}

public void setBreed(String breed) {
 this.breed = breed;
}
}

//Subclass for dogs
class Dog extends Pet {
private String size;

public Dog(String name, int age, String breed, String size) {
 super(name, age, breed);
 this.size = size;
}

public String color() {
 return "Brown";
}

public String getSize() {
 return size;
}

public void setSize(String size) {
 this.size = size;
}
}

//Subclass for cats
class Cat extends Pet {
private boolean isIndoor;

public Cat(String name, int age, String breed, boolean isIndoor) {
 super(name, age, breed);
 this.isIndoor = isIndoor;
}

public String color() {
 return "Black";
}

public boolean getIsIndoor() {
 return isIndoor;
}

public void setIsIndoor(boolean isIndoor) {
 this.isIndoor = isIndoor;
}
}

//Subclass for birds
class Bird extends Pet {
private String type;

public Bird(String name, int age, String breed, String type) {
 super(name, age, breed);
 this.type = type;
}

public String color() {
 return "Yellow";
}

public String getType() {
 return type;
}

public void setType(String type) {
 this.type = type;
}
}

//Subclass for hamsters
class Hamster extends Pet {
private String favoriteFood;

public Hamster(String name, int age, String breed, String favoriteFood) {
 super(name, age, breed);
 this.favoriteFood = favoriteFood;
}

public String color() {
 return "White";
}

public String getFavoriteFood() {
 return favoriteFood;
}

public void setFavoriteFood(String favoriteFood) {
 this.favoriteFood = favoriteFood;
}
}

//Subclass for lizards
class Lizard extends Pet {
private boolean isVenomous;

public Lizard(String name, int age, String breed, boolean isVenomous) {
 super(name, age, breed);
 this.isVenomous = isVenomous;
}

public String color() {
 return "Green";
}

public boolean getIsVenomous() {
 return isVenomous;
}

public void setIsVenomous(boolean isVenomous) {
 this.isVenomous = isVenomous;
}
}
