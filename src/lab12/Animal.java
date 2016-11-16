package lab12;

abstract public class Animal {

    protected int legs = 0;

    protected Animal(int legs) {
	this.legs = legs;
    }

    protected Animal() {

    }

    public void walk() {
	System.out.println("��� �������� ����� �� " + legs + " �����");
    }

    abstract public void eat();

}
