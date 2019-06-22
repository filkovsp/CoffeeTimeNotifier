package CoffeeTime;

public class CoffeeTime {

    public static void main(String[] args) {        
      Person eugene = new Person("Eugene");
      Person pavel = new Person("pavel");
      Person andrii = new Person("Andrii");

      pavel.addObserver(eugene);
      pavel.addObserver(andrii);
    
      pavel.shoutOutLaud("Hey! Guys! It's cofee time!");
    }
}
