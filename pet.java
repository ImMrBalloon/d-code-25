public class pet {

    private String type;
    private String name;
    private int weight;
    private int happiness;
    private int health;
    private int energy;
    private int hunger;
    private boolean alive;

    public pet(String typ, String nam) {
        this.type = typ;
        this.name = nam;
        this.weight = 5;
        this.happiness = 5;
        this.health = 5;
        this.energy = 5;
        this.hunger = 5;
        this.alive = true;
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
}

    