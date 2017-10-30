import java.util.Scanner;

/**
 * Created by k1764082 on 30/10/17.
 */
public class Game {

    Scanner scanner = new Scanner(System.in);

    Creature creature;

    boolean userQuits = false;

    public void run() {


        while(!userQuits) {
            interact();
            System.out.println(this.creature.checkStatus());

        }

        System.out.println("Aww, time to put " + this.creature.getName() + " to sleep.");
    }

    private void startTutorial() {
        System.out.println("Hi there, welcome to Javagotchi.");
        System.out.println("What's the name of your creature?");

        String name = scanner.nextLine();

        this.creature = new Creature(name);
        System.out.println("Great, you can now meet " + this.creature.getName() +"!");

    }

    private void interact() {
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                break;


        }
    }
}
