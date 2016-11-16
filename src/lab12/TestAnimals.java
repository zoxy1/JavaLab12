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

	d.setName("����");
	System.out.println("��� �����:" + d.getName());
	d.eat();
	d.play();
	d.walk();

	System.out.println("\n��� �����:" + c.getName());
	c.eat();
	c.play();
	c.legs = 4;
	c.walk();

	// a.setName("����"); �� �� ����� ��������� ��� ��������� ��� ������
	// ������ � ������ Animal
	System.out.println("\n");
	a.walk();
	a.eat();

	System.out.println("\n");
	e.legs = 8;
	e.walk();
	e.eat();

	p.setName("������");
	System.out.println("\n��� ��������� ���������:" + p.getName());
	p.play();

	// Fish fish=(Pet)d; ������, ������ �������� ��� ������� � ���� ������
	// ��������
	// Fish fish=(Animal)d;
	Animal animal = (Fish) a; // �� ��� ������ �������� ����� �������� � ���
				  // ������ �������
	System.out.println("\n");
	animal.walk();
	animal.eat();
	System.out.println("\n");
	// Pet pet = (Spider) e; // ������, ����� Spider �� ��������� ���������
	// Pet
	Animal[] zoo = new Animal[10];
	Random random = new Random();
	System.out.println("������� 10 ��������� ��������:");
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
	System.out.println("\n�� ��� �������� ��������:");
	for (Animal x : zoo) {

	    if ((x instanceof Cat) || (x instanceof Fish)) {
		pets[numberPets] = (Pet) x;
		System.out.println(pets[numberPets].getClass().getName());
		numberPets++;

	    }
	}
	System.out.println("����� " + numberPets + " �������� ��������");
    }
}