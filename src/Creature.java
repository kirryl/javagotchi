/**
 * Created by k1764082 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat() {
        if (fullness >= 12) {
            System.out.println("Whoops, " + this.getName() + " is already full.");
            }
        else {
            fullness += 8;
            energy -= 6;
            happiness -= 4;
            if (fullness > 15) { fullness = 15; }
        }
    }

    public void sleep() {
        if (energy >= 12) {
            System.out.println("Whoops, " + this.getName() + " is not sleepy.");
        }
        else {
            energy += 8;
            happiness -= 5;
            fullness -= 5;
            if (energy > 15) { energy = 15; }
        }
    }

    public void play() {

        happiness += 8;
        fullness -= 4;
        energy -= 6;
        if (happiness > 15) { happiness = 15; }
        else
    }

    public String checkStatus() {
        String status = "";

        if (happiness <= 0 || energy <= 0 || fullness <= 0) {
            System.out.println("Oh noh, " + this.getName() + " is dead!");
            System.exit(0);
        }

        if (happiness <= 6) {
            status += "Oh, " + this.getName() + " is feeling sad!\n";
        }

        if (energy <= 6) {
            status += "Oh, " + this.getName() + " is feeling tired!\n";
        }

        if (fullness <= 6) {
            status += "Oh, " + this.getName() + " is feeling hungry!\n";
        }

        return status;
    }

    public String getName() {
        return name;
    }
}
