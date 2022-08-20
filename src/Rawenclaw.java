public class Rawenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Rawenclaw(String name, String surname, int witchCraft, int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, witchCraft, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareRawenclaw(Rawenclaw rawenclaw) {
        int ability1 = ability();
        int ability2 = rawenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d vs %d%n", getName(), rawenclaw.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d vs %d%n", rawenclaw.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Когтевранец %s такой же, как Когтевранец %s: %d vs %d%n", rawenclaw.getName(), getName(), ability1, ability2);
        }
    }
    private int ability() {
        return mind + wisdom + wit + creativity;
    }
    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d, ум: %d, мудрость: %d, остроумие: %d, креативность: %d", getName(), getWitchCraft(), getTransgressionDistance(), getMind(), getWisdom(), getWit(), getCreativity());
    }
}