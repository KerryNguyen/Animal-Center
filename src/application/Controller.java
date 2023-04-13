package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	
	 	@FXML
	 	private TextField Dog1Name;
	 	@FXML
	 	private TextField Dog1Age;
	 	@FXML
	 	private TextField Dog1Breed;
	 	@FXML
	 	private TextField Dog1Size;
	 	@FXML
	 	private TextField Dog1Color;
	 	@FXML
	 	private TextField Dog1Gender;
	 	@FXML
	 	private TextField Dog1Fav;
	    @FXML
	    private Button Dog1Save;
	    
	    ////////////////////////////////
	    
	    @FXML
	    private TextField Dog2Name;
	 	@FXML
	 	private TextField Dog2Age;
	 	@FXML
	 	private TextField Dog2Breed;
	 	@FXML
	 	private TextField Dog2Size;
	 	@FXML
	 	private TextField Dog2Color;
	 	@FXML
	 	private TextField Dog2Gender;
	 	@FXML
	 	private TextField Dog2Fav;
	    @FXML
	    private Button Dog2Save;
	    
	    /////////////////////////
	    
	    @FXML
	    private TextField Dog3Name;
	    @FXML
	 	private TextField Dog3Age;
	 	@FXML
	 	private TextField Dog3Breed;
	 	@FXML
	 	private TextField Dog3Size;
	 	@FXML
	 	private TextField Dog3Color;
	 	@FXML
	 	private TextField Dog3Gender;
	 	@FXML
	 	private TextField Dog3Fav;
	    @FXML
	    private Button Dog3Save;
	    
	    /////////////////////////
	    
	    @FXML
	    private TextField Dog4Name;
	    @FXML
	 	private TextField Dog4Age;
	 	@FXML
	 	private TextField Dog4Breed;
	 	@FXML
	 	private TextField Dog4Size;
	 	@FXML
	 	private TextField Dog4Color;
	 	@FXML
	 	private TextField Dog4Gender;
	 	@FXML
	 	private TextField Dog4Fav;
	    @FXML
	    private Button Dog4Save;
	    
	    //////////////////////////
	    
	    @FXML
	    private TextField Dog5Name;
	    @FXML
	 	private TextField Dog5Age;
	 	@FXML
	 	private TextField Dog5Breed;
	 	@FXML
	 	private TextField Dog5Size;
	 	@FXML
	 	private TextField Dog5Color;
	 	@FXML
	 	private TextField Dog5Gender;
	 	@FXML
	 	private TextField Dog5Fav;
	    @FXML
	    private Button Dog5Save;
	    
	    ///////////////////////////
	    
	    @FXML
	    private TextField Cat1Name;
	    @FXML
	 	private TextField Cat1Age;
	 	@FXML
	 	private TextField Cat1Breed;
	 	@FXML
	 	private TextField Cat1Color;
	 	@FXML
	 	private TextField Cat1Gender;
	 	@FXML
	 	private TextField Cat1Fav;
	    @FXML
	    private Button Cat1Save;
	    
	    //////////////////////////
	    
	    @FXML
	    private TextField Cat2Name;
	    @FXML
	 	private TextField Cat2Age;
	 	@FXML
	 	private TextField Cat2Breed;
	 	@FXML
	 	private TextField Cat2Color;
	 	@FXML
	 	private TextField Cat2Gender;
	 	@FXML
	 	private TextField Cat2Fav;
	    @FXML
	    private Button Cat2Save;
	    
	    ///////////////////////////
	    
	    @FXML
	    private TextField Cat3Name;
	    @FXML
	 	private TextField Cat3Age;
	 	@FXML
	 	private TextField Cat3Breed;
	 	@FXML
	 	private TextField Cat3Color;
	 	@FXML
	 	private TextField Cat3Gender;
	 	@FXML
	 	private TextField Cat3Fav;
	    @FXML
	    private Button Cat3Save;
	    
	    ////////////////////////////
	    
	    @FXML
	    private TextField Cat4Name;
	    @FXML
	 	private TextField Cat4Age;
	 	@FXML
	 	private TextField Cat4Breed;
	 	@FXML
	 	private TextField Cat4Color;
	 	@FXML
	 	private TextField Cat4Gender;
	 	@FXML
	 	private TextField Cat4Fav;
	    @FXML
	    private Button Cat4Save;
	    
	    ///////////////////////////
	    
	    @FXML
	    private TextField Cat5Name;
	    @FXML
	 	private TextField Cat5Age;
	 	@FXML
	 	private TextField Cat5Breed;
	 	@FXML
	 	private TextField Cat5Color;
	 	@FXML
	 	private TextField Cat5Gender;
	 	@FXML
	 	private TextField Cat5Fav;
	    @FXML
	    private Button Cat5Save;
	    
	    //////////////////////////
	    
	    @FXML
	    private TextField Bird1Name;
	    @FXML
	 	private TextField Bird1Age;
	 	@FXML
	 	private TextField Bird1Breed;
	 	@FXML
	 	private TextField Bird1Color;
	 	@FXML
	 	private TextField Bird1Gender;
	 	@FXML
	 	private TextField Bird1Fav;
	    @FXML
	    private Button Bird1Save;
	    
	    ///////////////////////////
	    
	    @FXML
	    private TextField Bird2Name;
	    @FXML
	 	private TextField Bird2Age;
	 	@FXML
	 	private TextField Bird2Breed;
	 	@FXML
	 	private TextField Bird2Color;
	 	@FXML
	 	private TextField Bird2Gender;
	 	@FXML
	 	private TextField Bird2Fav;
	    @FXML
	    private Button Bird2Save;
	    
	    ///////////////////////////
	    
	    @FXML
	    private TextField Bird3Name;
	    @FXML
	 	private TextField Bird3Age;
	 	@FXML
	 	private TextField Bird3Breed;
	 	@FXML
	 	private TextField Bird3Color;
	 	@FXML
	 	private TextField Bird3Gender;
	 	@FXML
	 	private TextField Bird3Fav;
	    @FXML
	    private Button Bird3Save;
	    
	    ////////////////////////////
	    
	    @FXML
	    private TextField Bird4Name;
	    @FXML
	 	private TextField Bird4Age;
	 	@FXML
	 	private TextField Bird4Breed;
	 	@FXML
	 	private TextField Bird4Color;
	 	@FXML
	 	private TextField Bird4Gender;
	 	@FXML
	 	private TextField Bird4Fav;
	    @FXML
	    private Button Bird4Save;
	    
	    ////////////////////////////
	    
	    @FXML
	    private TextField Bird5Name;
	    @FXML
	 	private TextField Bird5Age;
	 	@FXML
	 	private TextField Bird5Breed;
	 	@FXML
	 	private TextField Bird5Color;
	 	@FXML
	 	private TextField Bird5Gender;
	 	@FXML
	 	private TextField Bird5Fav;
	    @FXML
	    private Button Bird5Save;
	    
	    ///////////////////////////////
	    
	    @FXML
	    private TextField Lizard1Name;
	    @FXML
	 	private TextField Lizard1Age;
	 	@FXML
	 	private TextField Lizard1Breed;
	 	@FXML
	 	private TextField Lizard1Color;
	 	@FXML
	 	private TextField Lizard1Gender;
	 	@FXML
	 	private TextField Lizard1Fav;
	 	@FXML
	 	private TextField Lizard1Venom;
	    @FXML
	    private Button Lizard1Save;
	    
	    ////////////////////////////////
	    
	    @FXML
	    private TextField Lizard2Name;
	    @FXML
	 	private TextField Lizard2Age;
	 	@FXML
	 	private TextField Lizard2Breed;
	 	@FXML
	 	private TextField Lizard2Color;
	 	@FXML
	 	private TextField Lizard2Gender;
	 	@FXML
	 	private TextField Lizard2Fav;
	 	@FXML
	 	private TextField Lizard2Venom;
	    @FXML
	    private Button Lizard2Save;
	    
	    /////////////////////////////////
	    
	    @FXML
	    private TextField Lizard3Name;
	    @FXML
	 	private TextField Lizard3Age;
	 	@FXML
	 	private TextField Lizard3Breed;
	 	@FXML
	 	private TextField Lizard3Color;
	 	@FXML
	 	private TextField Lizard3Gender;
	 	@FXML
	 	private TextField Lizard3Fav;
	 	@FXML
	 	private TextField Lizard3Venom;
	    @FXML
	    private Button Lizard3Save;
	    
	    ////////////////////////////////
	    
	    @FXML
	    private TextField Lizard4Name;
	    @FXML
	 	private TextField Lizard4Age;
	 	@FXML
	 	private TextField Lizard4Breed;
	 	@FXML
	 	private TextField Lizard4Color;
	 	@FXML
	 	private TextField Lizard4Gender;
	 	@FXML
	 	private TextField Lizard4Fav;
	 	@FXML
	 	private TextField Lizard4Venom;
	    @FXML
	    private Button Lizard4Save;
	    
	    /////////////////////////////////
	    
	    @FXML
	    private TextField Lizard5Name;
	    @FXML
	 	private TextField Lizard5Age;
	 	@FXML
	 	private TextField Lizard5Breed;
	 	@FXML
	 	private TextField Lizard5Color;
	 	@FXML
	 	private TextField Lizard5Gender;
	 	@FXML
	 	private TextField Lizard5Fav;
	 	@FXML
	 	private TextField Lizard5Venom;
	    @FXML
	    private Button Lizard5Save;
	    
	    ////////////////////////////////
	    
	    @FXML
	    private TextField Hamster1Name;
	    @FXML
	 	private TextField Hamster1Age;
	 	@FXML
	 	private TextField Hamster1Breed;
	 	@FXML
	 	private TextField Hamster1Color;
	 	@FXML
	 	private TextField Hamster1Gender;
	 	@FXML
	 	private TextField Hamster1Fav;
	    @FXML
	    private Button Hamster1Save;
	    
	    //////////////////////////////////
	    
	    @FXML
	    private TextField Hamster2Name;
	    @FXML
	 	private TextField Hamster2Age;
	 	@FXML
	 	private TextField Hamster2Breed;
	 	@FXML
	 	private TextField Hamster2Color;
	 	@FXML
	 	private TextField Hamster2Gender;
	 	@FXML
	 	private TextField Hamster2Fav;
	    @FXML
	    private Button Hamster2Save;
	    
	    //////////////////////////////////
	    
	    @FXML
	    private TextField Hamster3Name;
	    @FXML
	 	private TextField Hamster3Age;
	 	@FXML
	 	private TextField Hamster3Breed;
	 	@FXML
	 	private TextField Hamster3Color;
	 	@FXML
	 	private TextField Hamster3Gender;
	 	@FXML
	 	private TextField Hamster3Fav;
	    @FXML
	    private Button Hamster3Save;
	    
	    /////////////////////////////////
	    
	    @FXML
	    private TextField Hamster4Name;
	    @FXML
	 	private TextField Hamster4Age;
	 	@FXML
	 	private TextField Hamster4Breed;
	 	@FXML
	 	private TextField Hamster4Color;
	 	@FXML
	 	private TextField Hamster4Gender;
	 	@FXML
	 	private TextField Hamster4Fav;
	    @FXML
	    private Button Hamster4Save;
	    
	    /////////////////////////////////
	    
	    @FXML
	    private TextField Hamster5Name;
	    @FXML
	 	private TextField Hamster5Age;
	 	@FXML
	 	private TextField Hamster5Breed;
	 	@FXML
	 	private TextField Hamster5Color;
	 	@FXML
	 	private TextField Hamster5Gender;
	 	@FXML
	 	private TextField Hamster5Fav;
	    @FXML
	    private Button Hamster5Save;
	    
	    
	    
	    String dogn1; //name
	    String doga1; //age
	    String dogb1; //breed
	    String dogs1; //size
	    String dogc1; //color
	    String dogg1; //gender
	    String dogf1; //favorite food	    
	    
	    String dogn2; //name
	    String doga2; //age
	    String dogb2; //breed
	    String dogs2; //size
	    String dogc2; //color
	    String dogg2; //gender
	    String dogf2; //favorite food
	    
	    String dogn3; //name
	    String doga3; //age
	    String dogb3; //breed
	    String dogs3; //size
	    String dogc3; //color
	    String dogg3; //gender
	    String dogf3; //favorite food
	    
	    String dogn4; //name
	    String doga4; //age
	    String dogb4; //breed
	    String dogs4; //size
	    String dogc4; //color
	    String dogg4; //gender
	    String dogf4; //favorite food
	    
	    String dogn5; //name
	    String doga5; //age
	    String dogb5; //breed
	    String dogs5; //size
	    String dogc5; //color
	    String dogg5; //gender
	    String dogf5; //favorite food
	    
	    /////////////////////////
	    
	    String catn1; //name
	    String cata1; //age
	    String catb1; //breed
	    String catc1; //color
	    String catg1; //gender
	    String catf1; //favorite food
	    
	    String catn2; //name
	    String cata2; //age
	    String catb2; //breed
	    String catc2; //color
	    String catg2; //gender
	    String catf2; //favorite food
	    
	    String catn3; //name
	    String cata3; //age
	    String catb3; //breed
	    String catc3; //color
	    String catg3; //gender
	    String catf3; //favorite food
	    
	    String catn4; //name
	    String cata4; //age
	    String catb4; //breed
	    String catc4; //color
	    String catg4; //gender
	    String catf4; //favorite food
	    
	    String catn5; //name
	    String cata5; //age
	    String catb5; //breed
	    String catc5; //color
	    String catg5; //gender
	    String catf5; //favorite food
	    
	    ///////////////////////////
	    
	    String birdn1; //name
	    String birda1; //age
	    String birdb1; //breed
	    String birdc1; //color
	    String birdg1; //gender
	    String birdf1; //favorite food
	    
	    String birdn2; //name
	    String birda2; //age
	    String birdb2; //breed
	    String birdc2; //color
	    String birdg2; //gender
	    String birdf2; //favorite food
	    
	    String birdn3; //name
	    String birda3; //age
	    String birdb3; //breed
	    String birdc3; //color
	    String birdg3; //gender
	    String birdf3; //favorite food
	    
	    String birdn4; //name
	    String birda4; //age
	    String birdb4; //breed
	    String birdc4; //color
	    String birdg4; //gender
	    String birdf4; //favorite food
	    
	    String birdn5; //name
	    String birda5; //age
	    String birdb5; //breed
	    String birdc5; //color
	    String birdg5; //gender
	    String birdf5; //favorite food
	    
	    /////////////////////////
	    
	    String lizn1; //name
	    String liza1; //age
	    String lizb1; //breed
	    String lizc1; //color
	    String lizg1; //gender
	    String lizf1; //favorite food
	    String lizv1; //venom
	    
	    String lizn2; //name
	    String liza2; //age
	    String lizb2; //breed
	    String lizc2; //color
	    String lizg2; //gender
	    String lizf2; //favorite food
	    String lizv2; //venom
	    
	    String lizn3; //name
	    String liza3; //age
	    String lizb3; //breed
	    String lizc3; //color
	    String lizg3; //gender
	    String lizf3; //favorite food
	    String lizv3; //venom
	    
	    String lizn4; //name
	    String liza4; //age
	    String lizb4; //breed
	    String lizc4; //color
	    String lizg4; //gender
	    String lizf4; //favorite food
	    String lizv4; //venom
	    
	    String lizn5; //name
	    String liza5; //age
	    String lizb5; //breed
	    String lizc5; //color
	    String lizg5; //gender
	    String lizf5; //favorite food
	    String lizv5; //venom
	    
	    /////////////////////////////////
	    
	    String hamn1; //name
	    String hama1; //age
	    String hamb1; //breed
	    String hamc1; //color
	    String hamg1; //gender
	    String hamf1; //favorite food

	    String hamn2; //name
	    String hama2; //age
	    String hamb2; //breed
	    String hamc2; //color
	    String hamg2; //gender
	    String hamf2; //favorite food
	    
	    String hamn3; //name
	    String hama3; //age
	    String hamb3; //breed
	    String hamc3; //color
	    String hamg3; //gender
	    String hamf3; //favorite food
	    
	    String hamn4; //name
	    String hama4; //age
	    String hamb4; //breed
	    String hamc4; //color
	    String hamg4; //gender
	    String hamf4; //favorite food
	    
	    String hamn5; //name
	    String hama5; //age
	    String hamb5; //breed
	    String hamc5; //color
	    String hamg5; //gender
	    String hamf5; //favorite food
	    
	    
	    @FXML
	    public void savedog1(ActionEvent e) {	
	    	Dog dog1 = new Dog(Dog1Name.getText(), Integer.valueOf(Dog1Age.getText()), Dog1Breed.getText(), Dog1Size.getText(), Dog1Fav.getText(), Dog1Gender.getText());
	    	dog1.setColor(Dog1Color.getText());
	    	System.out.println(dog1.getName());
	    	System.out.println(dog1.getAge());
	    	System.out.println(dog1.getBreed());
	    	System.out.println(dog1.getSize());
	    	System.out.println(dog1.getColor());
	    	System.out.println(dog1.getGender());
	    	System.out.println(dog1.getFav());
	    }
	    
	    @FXML
	    public void savedog2(ActionEvent e) {
	    	Dog dog2 = new Dog(Dog2Name.getText(), Integer.valueOf(Dog2Age.getText()), Dog2Breed.getText(), Dog2Size.getText(), Dog2Fav.getText(), Dog2Gender.getText());
	    	dog2.setColor(Dog2Color.getText());
	    	System.out.println(dog2.getName());
	    	System.out.println(dog2.getAge());
	    	System.out.println(dog2.getBreed());
	    	System.out.println(dog2.getSize());
	    	System.out.println(dog2.getColor());
	    	System.out.println(dog2.getGender());
	    	System.out.println(dog2.getFav());
	    }
	    
	    @FXML
	    public void savedog3(ActionEvent e) {
	    	Dog dog3 = new Dog(Dog3Name.getText(), Integer.valueOf(Dog3Age.getText()), Dog3Breed.getText(), Dog3Size.getText(), Dog3Fav.getText(), Dog3Gender.getText());
	    	dog3.setColor(Dog3Color.getText());
	    	System.out.println(dog3.getName());
	    	System.out.println(dog3.getAge());
	    	System.out.println(dog3.getBreed());
	    	System.out.println(dog3.getSize());
	    	System.out.println(dog3.getColor());
	    	System.out.println(dog3.getGender());
	    	System.out.println(dog3.getFav());
	    }
	    
	    @FXML
	    public void savedog4(ActionEvent e) {
	    	Dog dog4 = new Dog(Dog4Name.getText(), Integer.valueOf(Dog4Age.getText()), Dog4Breed.getText(), Dog4Size.getText(), Dog4Fav.getText(), Dog4Gender.getText());
	    	dog4.setColor(Dog4Color.getText());
	    	System.out.println(dog4.getName());
	    	System.out.println(dog4.getAge());
	    	System.out.println(dog4.getBreed());
	    	System.out.println(dog4.getSize());
	    	System.out.println(dog4.getColor());
	    	System.out.println(dog4.getGender());
	    	System.out.println(dog4.getFav());	
	    }
	    
	    @FXML
	    public void savedog5(ActionEvent e) {
	    	Dog dog5 = new Dog(Dog5Name.getText(), Integer.valueOf(Dog5Age.getText()), Dog5Breed.getText(), Dog5Size.getText(), Dog5Fav.getText(), Dog5Gender.getText());
	    	dog5.setColor(Dog5Color.getText());
	    	System.out.println(dog5.getName());
	    	System.out.println(dog5.getAge());
	    	System.out.println(dog5.getBreed());
	    	System.out.println(dog5.getSize());
	    	System.out.println(dog5.getColor());
	    	System.out.println(dog5.getGender());
	    	System.out.println(dog5.getFav());	
	    }
	    
	    @FXML
	    public void savecat1(ActionEvent e) {
	    	Cat cat1 = new Cat(Cat1Name.getText(), Integer.valueOf(Cat1Age.getText()), Cat1Breed.getText(), Cat1Fav.getText(), Cat1Gender.getText());
	    	cat1.setColor(Cat1Color.getText());
	    	System.out.println(cat1.getName());
	    	System.out.println(cat1.getAge());
	    	System.out.println(cat1.getBreed());
	    	System.out.println(cat1.getColor());
	    	System.out.println(cat1.getGender());
	    	System.out.println(cat1.getFav());
	    }
	    
	    @FXML
	    public void savecat2(ActionEvent e) {
	    	Cat cat2 = new Cat(Cat2Name.getText(), Integer.valueOf(Cat2Age.getText()), Cat2Breed.getText(), Cat2Fav.getText(), Cat2Gender.getText());
	    	cat2.setColor(Cat2Color.getText());
	    	System.out.println(cat2.getName());
	    	System.out.println(cat2.getAge());
	    	System.out.println(cat2.getBreed());
	    	System.out.println(cat2.getColor());
	    	System.out.println(cat2.getGender());
	    	System.out.println(cat2.getFav());
	    }
	    
	    @FXML
	    public void savecat3(ActionEvent e) {
	    	Cat cat3 = new Cat(Cat3Name.getText(), Integer.valueOf(Cat3Age.getText()), Cat3Breed.getText(), Cat3Fav.getText(), Cat3Gender.getText());
	    	cat3.setColor(Cat3Color.getText());
	    	System.out.println(cat3.getName());
	    	System.out.println(cat3.getAge());
	    	System.out.println(cat3.getBreed());
	    	System.out.println(cat3.getColor());
	    	System.out.println(cat3.getGender());
	    	System.out.println(cat3.getFav());
	    }
	    
	    @FXML
	    public void savecat4(ActionEvent e) {
	    	Cat cat4 = new Cat(Cat4Name.getText(), Integer.valueOf(Cat4Age.getText()), Cat4Breed.getText(), Cat4Fav.getText(), Cat4Gender.getText());
	    	cat4.setColor(Cat4Color.getText());
	    	System.out.println(cat4.getName());
	    	System.out.println(cat4.getAge());
	    	System.out.println(cat4.getBreed());
	    	System.out.println(cat4.getColor());
	    	System.out.println(cat4.getGender());
	    	System.out.println(cat4.getFav());
	    }
	    
	    @FXML
	    public void savecat5(ActionEvent e) {
	    	Cat cat5 = new Cat(Cat5Name.getText(), Integer.valueOf(Cat5Age.getText()), Cat5Breed.getText(), Cat5Fav.getText(), Cat5Gender.getText());
	    	cat5.setColor(Cat5Color.getText());
	    	System.out.println(cat5.getName());
	    	System.out.println(cat5.getAge());
	    	System.out.println(cat5.getBreed());
	    	System.out.println(cat5.getColor());
	    	System.out.println(cat5.getGender());
	    	System.out.println(cat5.getFav());	
	    }
	    
	    @FXML
	    public void savebird1(ActionEvent e) {
	    	Bird bird1 = new Bird(Bird1Name.getText(), Integer.valueOf(Bird1Age.getText()), Bird1Breed.getText(), Bird1Fav.getText(), Bird1Gender.getText());
	    	bird1.setColor(Bird1Color.getText());
	    	System.out.println(bird1.getName());
	    	System.out.println(bird1.getAge());
	    	System.out.println(bird1.getBreed());
	    	System.out.println(bird1.getColor());
	    	System.out.println(bird1.getGender());
	    	System.out.println(bird1.getFav());
	    }
	    
	    @FXML
	    public void savebird2(ActionEvent e) {
	    	Bird bird2 = new Bird(Bird2Name.getText(), Integer.valueOf(Bird2Age.getText()), Bird2Breed.getText(), Bird2Fav.getText(), Bird2Gender.getText());
	    	bird2.setColor(Bird2Color.getText());
	    	System.out.println(bird2.getName());
	    	System.out.println(bird2.getAge());
	    	System.out.println(bird2.getBreed());
	    	System.out.println(bird2.getColor());
	    	System.out.println(bird2.getFav());
	    	System.out.println(bird2.getGender());
	    }
	    
	    @FXML
	    public void savebird3(ActionEvent e) {
	    	Bird bird3 = new Bird(Bird3Name.getText(), Integer.valueOf(Bird3Age.getText()), Bird3Breed.getText(), Bird3Fav.getText(), Bird3Gender.getText());
	    	bird3.setColor(Bird3Color.getText());
	    	System.out.println(bird3.getName());
	    	System.out.println(bird3.getAge());
	    	System.out.println(bird3.getBreed());
	    	System.out.println(bird3.getColor());
	    	System.out.println(bird3.getFav());
	    	System.out.println(bird3.getGender());
	    }
	    
	    @FXML
	    public void savebird4(ActionEvent e) {
	    	Bird bird4 = new Bird(Bird4Name.getText(), Integer.valueOf(Bird4Age.getText()), Bird4Breed.getText(), Bird4Fav.getText(), Bird4Gender.getText());
	    	bird4.setColor(Bird4Color.getText());
	    	System.out.println(bird4.getName());
	    	System.out.println(bird4.getAge());
	    	System.out.println(bird4.getBreed());
	    	System.out.println(bird4.getColor());
	    	System.out.println(bird4.getFav());
	    	System.out.println(bird4.getGender());
	    }
	    
	    @FXML
	    public void savebird5(ActionEvent e) {
	    	Bird bird5 = new Bird(Bird5Name.getText(), Integer.valueOf(Bird5Age.getText()), Bird5Breed.getText(), Bird5Fav.getText(), Bird5Gender.getText());
	    	bird5.setColor(Bird5Color.getText());
	    	System.out.println(bird5.getName());
	    	System.out.println(bird5.getAge());
	    	System.out.println(bird5.getBreed());
	    	System.out.println(bird5.getColor());
	    	System.out.println(bird5.getFav());
	    	System.out.println(bird5.getGender());
	    }
	    
	    @FXML
	    public void saveliz1(ActionEvent e) {
	    	Lizard liz1 = new Lizard(Lizard1Name.getText(), Integer.valueOf(Lizard1Age.getText()), Lizard1Breed.getText(), Lizard1Venom.getText(), Lizard1Fav.getText(), Lizard1Gender.getText());
	    	liz1.setColor(Lizard1Color.getText());
	    	System.out.println(liz1.getName());
	    	System.out.println(liz1.getAge());
	    	System.out.println(liz1.getBreed());
	    	System.out.println(liz1.getColor());
	    	System.out.println(liz1.getGender());
	    	System.out.println(liz1.getFav());
	    	System.out.println(liz1.getIsVenomous());
	    }
	    
	    @FXML
	    public void saveliz2(ActionEvent e) {
	    	Lizard liz2 = new Lizard(Lizard2Name.getText(), Integer.valueOf(Lizard2Age.getText()), Lizard2Breed.getText(), Lizard2Venom.getText(), Lizard2Fav.getText(), Lizard2Gender.getText());
	    	liz2.setColor(Lizard2Color.getText());
	    	System.out.println(liz2.getName());
	    	System.out.println(liz2.getAge());
	    	System.out.println(liz2.getBreed());
	    	System.out.println(liz2.getColor());
	    	System.out.println(liz2.getGender());
	    	System.out.println(liz2.getFav());
	    	System.out.println(liz2.getIsVenomous());
	    }
	    
	    @FXML
	    public void saveliz3(ActionEvent e) {
	    	Lizard liz3 = new Lizard(Lizard3Name.getText(), Integer.valueOf(Lizard3Age.getText()), Lizard3Breed.getText(), Lizard3Venom.getText(), Lizard3Fav.getText(), Lizard3Gender.getText());
	    	liz3.setColor(Lizard3Color.getText());
	    	System.out.println(liz3.getName());
	    	System.out.println(liz3.getAge());
	    	System.out.println(liz3.getBreed());
	    	System.out.println(liz3.getColor());
	    	System.out.println(liz3.getGender());
	    	System.out.println(liz3.getFav());
	    	System.out.println(liz3.getIsVenomous());
	    }
	    
	    @FXML
	    public void saveliz4(ActionEvent e) {
	    	Lizard liz4 = new Lizard(Lizard4Name.getText(), Integer.valueOf(Lizard4Age.getText()), Lizard4Breed.getText(), Lizard4Venom.getText(), Lizard4Fav.getText(), Lizard4Gender.getText());
	    	liz4.setColor(Lizard4Color.getText());
	    	System.out.println(liz4.getName());
	    	System.out.println(liz4.getAge());
	    	System.out.println(liz4.getBreed());
	    	System.out.println(liz4.getColor());
	    	System.out.println(liz4.getGender());
	    	System.out.println(liz4.getFav());
	    	System.out.println(liz4.getIsVenomous());
	    }
	    
	    @FXML
	    public void saveliz5(ActionEvent e) {
	    	Lizard liz5 = new Lizard(Lizard5Name.getText(), Integer.valueOf(Lizard5Age.getText()), Lizard5Breed.getText(), Lizard5Venom.getText(), Lizard5Fav.getText(), Lizard5Gender.getText());
	    	liz5.setColor(Lizard5Color.getText());
	    	System.out.println(liz5.getName());
	    	System.out.println(liz5.getAge());
	    	System.out.println(liz5.getBreed());
	    	System.out.println(liz5.getColor());
	    	System.out.println(liz5.getGender());
	    	System.out.println(liz5.getFav());
	    	System.out.println(liz5.getIsVenomous());
	    }
	    
	    @FXML
	    public void saveham1(ActionEvent e) {
	    	Hamster ham1 = new Hamster(Hamster1Name.getText(), Integer.valueOf(Hamster1Age.getText()), Hamster1Breed.getText(), Hamster1Fav.getText(), Hamster1Gender.getText());
	    	ham1.setColor(Hamster1Color.getText());
	    	System.out.println(ham1.getName());
	    	System.out.println(ham1.getAge());
	    	System.out.println(ham1.getBreed());
	    	System.out.println(ham1.getColor());
	    	System.out.println(ham1.getGender());
	    	System.out.println(ham1.getFav());
	    }
	    
	    @FXML
	    public void saveham2(ActionEvent e) {
	    	Hamster ham2 = new Hamster(Hamster2Name.getText(), Integer.valueOf(Hamster2Age.getText()), Hamster2Breed.getText(), Hamster2Fav.getText(), Hamster2Gender.getText());
	    	ham2.setColor(Hamster2Color.getText());
	    	System.out.println(ham2.getName());
	    	System.out.println(ham2.getAge());
	    	System.out.println(ham2.getBreed());
	    	System.out.println(ham2.getColor());
	    	System.out.println(ham2.getGender());
	    	System.out.println(ham2.getFav());
	    }
	    
	    @FXML
	    public void saveham3(ActionEvent e) {
	    	Hamster ham3 = new Hamster(Hamster3Name.getText(), Integer.valueOf(Hamster3Age.getText()), Hamster3Breed.getText(), Hamster3Fav.getText(), Hamster3Gender.getText());
	    	ham3.setColor(Hamster3Color.getText());
	    	System.out.println(ham3.getName());
	    	System.out.println(ham3.getAge());
	    	System.out.println(ham3.getBreed());
	    	System.out.println(ham3.getColor());
	    	System.out.println(ham3.getGender());
	    	System.out.println(ham3.getFav());
	    }
	    
	    @FXML
	    public void saveham4(ActionEvent e) {
	    	Hamster ham4 = new Hamster(Hamster4Name.getText(), Integer.valueOf(Hamster4Age.getText()), Hamster4Breed.getText(), Hamster4Fav.getText(), Hamster4Gender.getText());
	    	ham4.setColor(Hamster4Color.getText());
	    	System.out.println(ham4.getName());
	    	System.out.println(ham4.getAge());
	    	System.out.println(ham4.getBreed());
	    	System.out.println(ham4.getColor());
	    	System.out.println(ham4.getGender());
	    	System.out.println(ham4.getFav());
	    }
	    
	    @FXML
	    public void saveham5(ActionEvent e) {
	    	Hamster ham5 = new Hamster(Hamster5Name.getText(), Integer.valueOf(Hamster5Age.getText()), Hamster5Breed.getText(), Hamster5Fav.getText(), Hamster5Gender.getText());
	    	ham5.setColor(Hamster5Color.getText());
	    	System.out.println(ham5.getName());
	    	System.out.println(ham5.getAge());
	    	System.out.println(ham5.getBreed());
	    	System.out.println(ham5.getColor());
	    	System.out.println(ham5.getGender());
	    	System.out.println(ham5.getFav());
	    }
	    
	// About Us Section
	
	@FXML
	void Kerry(ActionEvent e) throws URISyntaxException, IOException {
		System.out.println("Link to Kerry's Github");
		Desktop.getDesktop().browse(new URI("https://github.com/KerryNguyen"));
	}
	
	@FXML
	void Nathan(ActionEvent e) throws URISyntaxException, IOException {
		System.out.println("Link to Nathan's Github");
		Desktop.getDesktop().browse(new URI("https://github.com/huangn1ATWIT"));
	}
	
	@FXML
	void Project(ActionEvent e) throws URISyntaxException, IOException {
		System.out.println("Link to Project");
		Desktop.getDesktop().browse(new URI("https://github.com/KerryNguyen/CompSciProject"));
	}
	 
}
	
