public class Hogwarts {
    private String name;
    private String surname;
    private int witchCraft;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int witchCraft, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.witchCraft = witchCraft;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWitchCraft() {
        return witchCraft;
    }

    public void setWitchCraft(int witchCraft) {
        this.witchCraft = witchCraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return witchCraft + transgressionDistance;
    }

    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем Студент %s: %d vs %d%n", getName(), hogwarts.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем Студент %s: %d vs %d%n", hogwarts.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Студент %s такой же, как Студент %s: %d vs %d%n", hogwarts.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d, ", name, witchCraft, transgressionDistance);
    }
}
