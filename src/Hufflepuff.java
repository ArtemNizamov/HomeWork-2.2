public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int witchCraft, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, witchCraft, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d vs %d%n", getName(), hufflepuff.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d vs %d%n", hufflepuff.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Пуффендуец %s такой же, как Пуффендуец %s: %d vs %d%n", hufflepuff.getName(), getName(), ability1, ability2);
        }
    }
    private int ability() {
        return diligence + loyalty + honesty;
    }
}
