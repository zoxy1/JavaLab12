package lab12;

public class Cat extends Animal implements Pet {

    private String name = "�� �������";

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
		.println("����� ����� ����� ������, ������� ���������� ��� ���� ����� ����� ������������� ���������, "
			+ "������� ������ �������� �� � ����. �������� ����� ����� ������� ������, �������������� � ������ ����������/����������, ���:\n"
			+ "1 - ����;\n"
			+ "2 - ������;\n"
			+ "3 - �����;\n"
			+ "4 - ������;\n" + "5 - �������;\n" + "6 - �����.");
    
    }

    public void eat() {
	System.out.println("����� ����� ���� ����");
    }

}
