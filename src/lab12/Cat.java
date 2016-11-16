package lab12;

public class Cat extends Animal implements Pet {

    private String name = "Не указано";

    protected Cat(String n) {
	super.legs=4;
	name = n;
    }

    protected Cat() {

    }

    public String getName() {
	return name;
    }

    public void setName(String n) {
	name = n;
    }

    public void play() {
	System.out
		.println("Кошки очень любят играть, поэтому используют для этих целей самые разнообразные материалы, "
			+ "которые только попадают им в лапы. Наиболее часто можно увидеть кошака, забавляющегося с такими предметами/существами, как:\n"
			+ "1 - Мышь;\n"
			+ "2 - Клубок;\n"
			+ "3 - Мячик;\n"
			+ "4 - Бантик;\n" + "5 - Бумажка;\n" + "6 - Шарик.");
    
    }

    public void eat() {
	System.out.println("Кошки любят есть рыбу");
    }

}
