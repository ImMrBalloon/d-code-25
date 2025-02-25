public class Pet { // class defines tamagotchi pet and actions that can be done to it

    private String type;
    private String name;
    private int weight;
    private int happiness;
    private int health;
    private int energy;
    private int hunger;
    private boolean alive;
    private Status state;

    public Pet(String typ, String nam) {
        this.type = typ;
        this.name = nam;
        this.weight = 5;
        this.happiness = 5;
        this.health = 5;
        this.energy = 5;
        this.hunger = 5;
        this.alive = true;
        
    }

    public void setState(Status s) {
        this.state=s;
    }

    public void feed(String input) {
        if (input.equals("meal")) {
            this.weight++;
            this.health++;
            this.energy++;
            this.hunger--;
        }

        if (input.equals("treat")) {
            this.weight+=2;
            this.hunger-=.5;
        }
    }

    public void walk() {
        this.weight--;
        this.happiness++;
        this.health++;
        this.energy--;
        this.hunger--;
    }

    public void hungry() { // will be called with time when that is figured out
        this.weight--;
        this.happiness--;
    }

    public void veryHungry() { // also time based, only happens after more time than hungry
        this.weight-=2;
        this.happiness-=2;
        this.health--;
        this.energy--;
    }
    

    public void doctor() {
        this.happiness--;
        this.health+=2;
    }

    public void train() {
        this.happiness++;
        this.energy--;
        this.hunger--;
    }
}

    