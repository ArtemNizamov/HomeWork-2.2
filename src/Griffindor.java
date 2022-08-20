public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int witchCraft, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, witchCraft, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGriffindor(Griffindor griffindor) {
        int ability1 = ability();
        int ability2 = griffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d vs %d%n", getName(), griffindor.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d vs %d%n", griffindor.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Гриффиндорец %s такой же, как Гриффиндорец %s: %d vs %d%n", griffindor.getName(), getName(), ability1, ability2);
        }
    }
    private int ability() {
        return nobility + honor + bravery;
    }
}
