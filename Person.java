package CoffeeTime;

import java.util.Observable;
import java.util.Observer;

public class Person extends Observable implements Observer {

     public final String name;

     public Person(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return this.name;
     }
     
     public void shout(Observer receiver, String message) {
         super.setChanged();
         receiver.update(this, message);
     }
     
     public void shoutOutLaud(String message) {
         super.setChanged();
         super.notifyObservers(message);
     }
     
     @Override
     public void update(Observable sender, Object message) {
         System.out.println(String.format("Received by %s message from %s: %s", this.name, sender.toString(), message.toString()));
     }
 }
