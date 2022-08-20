public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int witchCraft, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, witchCraft, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d vs %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем Слизеринец %s: %d vs %d%n", slytherin.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Слизеринец %s такой же, как Слизеринец %s: %d vs %d%n", slytherin.getName(), getName(), ability1, ability2);
        }
    }
    private int ability() {
        return cunning + determination + thirstForPower + resourcefulness + ambition;
    }
    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d, хитрость: %d, решительность: %d, честолюбие: %d, находчивость: %d, жажда власти: %d", getName(), getWitchCraft(), getTransgressionDistance(), getCunning(), getDetermination(), getAmbition(), getResourcefulness(), getThirstForPower());
    }
}
