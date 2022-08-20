public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри", "Поттер", 90, 93),
                new Hogwarts("Гермиона", "Грейнджер", 99, 76),
                new Hogwarts("Рон", "Уизли", 54, 28),
                new Hogwarts("Захария", "Смит", 63, 32),
                new Hogwarts("Седрик ", "Диггори", 78, 69),
                new Hogwarts("Джастин ", "Финч-Флетчли", 42, 41),
                new Hogwarts("Чжоу", "Чанг", 43, 62),
                new Hogwarts("Падма", "Патил", 58, 45),
                new Hogwarts("Маркус", "Белби", 87, 17),
                new Hogwarts("Драко", "Малфой", 82, 99),
                new Hogwarts("Грэхэм", "Монтегю", 67, 76),
                new Hogwarts("Грегори", "Гойл", 32, 11)
        };

        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер", 90, 93, 86, 67, 72),
                new Griffindor("Гермиона", "Грейнджер", 99, 76, 79, 58, 84),
                new Griffindor("Рон", "Уизли", 54, 28, 71, 34, 60)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 63, 32, 64, 72, 45),
                new Hufflepuff("Седрик ", "Диггори", 78, 69, 98, 84, 45),
                new Hufflepuff("Джастин ", "Финч-Флетчли", 42, 41, 43, 96, 89)
        };
        Rawenclaw[] rawenclaws = {
                new Rawenclaw("Чжоу", "Чанг", 43, 62, 57, 78, 65, 36),
                new Rawenclaw("Падма", "Патил", 58, 45, 93, 44, 72, 63),
                new Rawenclaw("Маркус", "Белби", 87, 17, 89, 53, 43, 78)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 82, 99, 96, 93, 90, 98, 95),
                new Slytherin("Грэхэм", "Монтегю", 67, 76, 87, 87, 76, 45, 76),
                new Slytherin("Грегори", "Гойл", 32, 11, 54, 34, 23, 41, 12)
        };

        for (int i = 0; i < griffindors.length; i++) {
            griffindors[i].print();
        }

        System.out.println();

        for (int i = 0; i < hufflepuffs.length; i++) {
            hufflepuffs[i].print();
        }

        System.out.println();

        for (int i = 0; i < slytherins.length; i++) {
            slytherins[i].print();
        }

        System.out.println();

        for (int i = 0; i < rawenclaws.length; i++) {
            rawenclaws[i].print();
        }

        System.out.println();

        griffindors[2].compareGriffindor(griffindors[1]);
        slytherins[1].compareSlytherin(slytherins[2]);
        hufflepuffs[0].compareHufflepuff(hufflepuffs[2]);
        rawenclaws[2].compareRawenclaw(rawenclaws[1]);

        hogwarts[4].compareHogwarts(hogwarts[8]);
    }
}