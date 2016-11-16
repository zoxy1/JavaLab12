package lab12;

import java.util.Random;

public class TestAnimals {

    public TestAnimals() {

    }

    public static void main(String[] args) {
	Fish d = new Fish();
	Cat c = new Cat("Fluffy");
	Animal a = new Fish();
	Animal e = new Spider();
	Pet p = new Cat();

	d.setName("Немо");
	System.out.println("Имя рыбки:" + d.getName());
	d.eat();
	d.play();
	d.walk();

	System.out.println("\nИмя кошки:" + c.getName());
	c.eat();
	c.play();
	c.legs = 4;
	c.walk();

	// a.setName("Немо"); мы не можем присвоить имя животному нет такого
	// метода в классе Animal
	System.out.println("\n");
	a.walk();
	a.eat();

	System.out.println("\n");
	e.legs = 8;
	e.walk();
	e.eat();

	p.setName("Барсик");
	System.out.println("\nИмя домашнего животного:" + p.getName());
	p.play();

	// Fish fish=(Pet)d; ошибка, нельзя привести тип потомка к типу класса
	// родителя
	// Fish fish=(Animal)d;
	Animal animal = (Fish) a; // но тип класса родителя можно привести к тиу
				  // класса потомка
	System.out.println("\n");
	animal.walk();
	animal.eat();
	System.out.println("\n");
	// Pet pet = (Spider) e; // ошибка, класс Spider не реализует интерфейс
	// Pet
	Animal[] zoo = new Animal[10];
	Random random = new Random();
	System.out.println("Выводим 10 случайных животных:");
	for (int i = 0; i < 10; i++) {
	    switch (random.nextInt(3)) {
	    case 0:
		zoo[i] = new Spider();
		break;
	    case 1:
		zoo[i] = new Cat();
		break;
	    case 2:
		zoo[i] = new Fish();
		break;
	    default:
		break;
	    }
	    System.out.println(zoo[i].getClass().getName());
	}
	Pet[] pets = new Pet[10];
	int numberPets = 0;
	System.out.println("\nИз них домашние животные:");
	for (Animal x : zoo) {

	    if ((x instanceof Cat) || (x instanceof Fish)) {
		pets[numberPets] = (Pet) x;
		System.out.println(pets[numberPets].getClass().getName());
		numberPets++;

	    }
	}
	System.out.println("Всего " + numberPets + " домашних животных");
    }
}