//Abstract class for pets
abstract class Pet {
private String name;
private int age;
private String breed;
public String color;
private String gender;

	public Pet(String name, int age, String breed, String gender) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.gender = gender;
	}

// Abstract method to get the color of the pet
	public abstract String getColor();
	public abstract void setColor(String c);

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
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

//Subclass for dogs
class Dog extends Pet {
	private String size;
	private String Fav;

	public Dog(String name, int age, String breed, String size, String fav, String gender) {
		super(name, age, breed, gender);
 		this.size = size;
		this.Fav = fav
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getFav() {
		return Fav;
	}

	public void setFav(String fav) {
		this.Fav = fav;
	}
}

//Subclass for cats
class Cat extends Pet {
	private String Fav;

	public Cat(String name, int age, String breed, String fav, String gender) {
		super(name, age, breed, gender);
 		this.Fav = fav;
	}

	public String getColor() {
	 	return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFav() {
		return Fav;
	}

	public void setFav(String fav) {
		this.Fav = fav;
	}
}

//Subclass for birds
class Bird extends Pet {
	private String Fav;
	public Bird(String name, int age, String breed, String fav, String gender) {
		super(name, age, breed, gender);
		this.Fav = fav;
	}

public String getColor() {
	 return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getFav() {
		return Fav;
	}

	public void setFav(String fav) {
		this.Fav = fav;
	}
}

//Subclass for hamsters
class Hamster extends Pet {
	private String Fav;

	public Hamster(String name, int age, String breed, String fav, String gender) {
		super(name, age, breed, gender);
		this.Fav = fav;
	}
	
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFavoriteFood() {
	return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
	this.favoriteFood = favoriteFood;
	}
	public String getFav() {
		return Fav;
	}

	public void setFav(String fav) {
		this.Fav = fav;
	}
}

//Subclass for lizards
class Lizard extends Pet {
	private String isVenomous;
	private String Fav;

	public Lizard(String name, int age, String breed, String isVenomous, String fav, String gender) {
		super(name, age, breed, gender);
		this.isVenomous = isVenomous;
		this.Fav = fav;
	}

	public String getColor() {
	 	return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIsVenomous() {
		return isVenomous;
	}

	public void setIsVenomous(String isVenomous) {
		this.isVenomous = isVenomous;
	}
	public String getFav() {
		return Fav;
	}

	public void setFav(String fav) {
		this.Fav = fav;
	}
}
